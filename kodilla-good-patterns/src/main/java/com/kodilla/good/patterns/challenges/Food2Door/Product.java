package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    private String productName;
    private double productPrice;
    private int quantity;

    public Product(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
