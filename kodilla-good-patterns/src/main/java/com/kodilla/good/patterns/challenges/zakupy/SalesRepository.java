package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public interface SalesRepository {
    public void createSalesRepository (User user, Product product, LocalDateTime dateOfSale);
}
