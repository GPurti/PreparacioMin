package edu.upc.dsa.models;

public class Product {
    String productId;
    String description;
    double price;
    int sales;

    public Product(String productId, String description, double price) {
        this.productId = productId;
        this.description = description;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    public void addSales(int sales){
        this.sales = this.sales+ sales;
    }

    public String getDescription() {
        return  description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
