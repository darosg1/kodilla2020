package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class Order {
    private Supplier supplier;
    private Product product;
    private LocalDateTime dateOfSale;

    public Order(Supplier supplier, Product product, LocalDateTime dateOfSale) {
        this.supplier = supplier;
        this.product = product;
        this.dateOfSale = dateOfSale;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }

    public boolean sale (Supplier supplier, Product product, LocalDateTime dateOfSale){
        return true;
    }

}
