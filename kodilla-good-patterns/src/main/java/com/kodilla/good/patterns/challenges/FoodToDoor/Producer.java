package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public interface Producer {
    static boolean process(User user, Product product, LocalDateTime dateOfOrder) {
        return true;
    }
}
