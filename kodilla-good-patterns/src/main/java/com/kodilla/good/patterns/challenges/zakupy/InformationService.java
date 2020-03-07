package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public interface InformationService {
    public void inform (User user, LocalDateTime dateOfSale, Product product, boolean isSold);
}
