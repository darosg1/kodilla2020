package com.kodilla.good.patterns.challenges.FoodToDoor;

import java.time.LocalDateTime;

public interface Producer {
    boolean process(User user, Product product, LocalDateTime dateOfOrder);
}
