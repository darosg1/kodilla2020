package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public class DataRetriever {

    public void retrieve() {

        Producer ExtraFoodShop = new ExtraFoodShop ("ExtraFoodShop", "Warszawa ul.Krucza 20");
        Producer HealthyShop = new HealthyShop("HealthyShop","Kraków ul. Rakowicka 15");
        Producer GlutenFreeShop = new GlutenFreeShop("GlutenFreeShop","Gdańsk ul. Oliwska 100");

        Product product0 = new Product("Mleko", 100, 25);
        Product product1 = new Product("Chleb", 15, 5);
        Product product2 = new Product("Ser", 24, 10);
        Product product3 = new Product("Jogurt", 2, 3);

        User user1 = new User("Darek", "Kowalski", "dkowal", "Warszawa 01-320 ul.Lazurowa 10/9", "dkowal@gmail.pl");
        Order order1 = new Order(user1, product1, LocalDateTime.of(2020,03, 8, 12, 44 ));
        Order order2 = new Order(user1, product2, LocalDateTime.of(2020,03, 8, 12, 45 ));

        Processor processor = new Processor(new EmailSalesInformation());
        processor.process(order1);
        processor.process(order2);

    }

}