package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public class ArticleSales implements OrderService {
    public boolean sale(User user, Product product, LocalDateTime dateOfSale){
        System.out.println("Sprzedaż "+user.getUserName()+" artykułu "+product.getProductName()+" w dniu "+dateOfSale.toString());
        return true;
    }
}
