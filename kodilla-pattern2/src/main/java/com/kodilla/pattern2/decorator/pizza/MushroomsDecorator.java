package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractPizzaOrderDecorator{
    public MushroomsDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", grzybki Moona!";
    }
}
