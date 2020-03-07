package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private LocalDateTime dateOfSale;

    public Order(User user, Product product, LocalDateTime dateOfSale) {
        this.user = user;
        this.product = product;
        this.dateOfSale = dateOfSale;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfSale() {
        return dateOfSale;
    }
}
