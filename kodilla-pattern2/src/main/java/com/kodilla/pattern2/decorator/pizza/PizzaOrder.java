package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getPrice();
    String getDescription();
}
