package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public class DataSalesRepository implements SalesRepository{
    public void createSalesRepository (User user, Product product, LocalDateTime dateOfSale){
        System.out.print("Zapisanie do bazy danych użytkownika "+ user.getFirstName()+" "+user.getSurname()+" "+ user.getUserName()+" "+user.getEmail());
        System.out.println("Zapisanie czasu i artykułu "+product.getProductName()+" "+product.getProductPrice()+" "+dateOfSale.toString());
    }

}
