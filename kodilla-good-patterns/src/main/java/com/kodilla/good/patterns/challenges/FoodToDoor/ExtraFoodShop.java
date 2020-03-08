package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public class ExtraFoodShop implements Producer{
    private String name;
    private String address;

    public ExtraFoodShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void process(User user, Product product, LocalDateTime dateOfOrder){
        System.out.print("\n Zakpuiony towar: " + product.getProductName() + " został przygotowywany do wysyłki");
    }
}
