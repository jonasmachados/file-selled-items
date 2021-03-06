package model.entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    //CONSTRUCTOR
    public Product() {
    }

    //CONSTRUCTOR
    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double valueTotal = 0;

    public double valueTotal() {
        double valueTotal = price * quantity;
        return valueTotal;
    }

    //GET AND SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
