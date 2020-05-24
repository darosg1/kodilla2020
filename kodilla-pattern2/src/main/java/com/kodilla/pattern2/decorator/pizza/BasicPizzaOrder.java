package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;
//podstawowa klasa do zamawiania pizzy
public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }
    @Override
    public String getDescription(){
        return "Pizza włoska z serem oraz dodatki:";
    }
}
