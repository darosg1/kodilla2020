package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private LocalDateTime dateOfOrder;

    public Order(User user, Product product, LocalDateTime dateOfOrder) {
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
