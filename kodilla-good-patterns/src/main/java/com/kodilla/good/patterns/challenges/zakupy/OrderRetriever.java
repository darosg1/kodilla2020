package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public class OrderRetriever {
    public Order retrieve() {
        User user = new User("Darek", "Kowalski", "dkowal", "dkowal@gmail.com");
        Product product = new Product("Parasite", 50.00);
        Order order = new Order(user, product, LocalDateTime.of(2020, 03, 05, 6, 55));
    return order;
    }
}
