package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public class EmailInformationService implements InformationService {
    public void inform (User user, LocalDateTime dateOfSale, Product product, boolean isSold){
        if (isSold){
            System.out.println("Dzień dobry "+ user.getFirstName()+" "+user.getSurname());
            System.out.println("W dniu "+dateOfSale.toString()+" dokonano zakupu");
            System.out.println(product.getProductName()+" na kwotę "+product.getProductPrice());
        }else{
            System.out.println("Dzień dobry "+ user.getFirstName()+" "+user.getSurname()+" niestety zakup się nie powiódł");
        }
    }
}
