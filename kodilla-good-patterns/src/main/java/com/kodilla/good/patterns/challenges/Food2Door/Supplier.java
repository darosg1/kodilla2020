package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class Supplier implements Food2Door{
    private String name;
    private String address;
    private double taxNumber;

    public Supplier(String name, String address, double taxNumber) {
        this.name = name;
        this.address = address;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getTaxNumber() {
        return taxNumber;
    }

    @Override
    public void process(Product product, LocalDateTime dateOfSale) {
        System.out.println(product.getProductName()+product.getProductPrice()+
                product.getQuantity()+dateOfSale.toString());
    }
}
