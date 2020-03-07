package com.kodilla.good.patterns.challenges.zakupy;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean sale(User user, Product product, LocalDateTime dateOfSale);
}
