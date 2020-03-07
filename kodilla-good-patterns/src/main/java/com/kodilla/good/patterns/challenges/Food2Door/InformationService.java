package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public interface InformationService {
    public void inform(Supplier supplier, Product product, LocalDateTime dateOfSale);
}
