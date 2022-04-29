package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.entities.Product;

public class Program {

    public static void main(String[] args) {

        Product productA = new Product("TV", 1290.99, 1);
        Product productB = new Product("Video Game Chair", 350.50, 3);
        Product productC = new Product("Iphone X", 900.00, 2);
        Product productD = new Product("Samsung Galaxy9", 850.00, 1);

        List<Product> productList = new ArrayList<>();
        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);

        //Creating folder
        String paths = "c:\\out\\";
        File sourceFile = new File(paths);
        String sourceFolderStr = sourceFile.getParent();
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        //Creating file
        String path = "c:\\out\\summary.csv";
        File file = new File(path);
        File[] files = file.listFiles(File::isFile);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            String[] lines = new String[]{String.valueOf(productList)};

            for (Product item : productList) {
                bw.write(item.getName() + ", " + String.format("%.2f", item.valueTotal()) + ", " + item.getQuantity());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());

        }
    }

}
