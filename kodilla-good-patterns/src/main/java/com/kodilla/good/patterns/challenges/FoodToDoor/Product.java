package com.kodilla.good.patterns.challenges.FoodToDoor;

public class Product {
    String productName;
    int quantity;
    int price;

    public Product(String productName, int quantity, int price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
