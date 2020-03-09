package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public class HealthyShop implements Producer{
    private String name;
    private String address;

    public HealthyShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean process(User user, Product product, LocalDateTime dateOfOrder){
        System.out.print("Zakupiony w sklepie Healthy Shop towar: " + product.getProductName() + " został przygotowywany do wysyłki.\n");
        return true;
    }
}
