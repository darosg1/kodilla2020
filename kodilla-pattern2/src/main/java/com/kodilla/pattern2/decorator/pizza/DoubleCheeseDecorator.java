package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCheeseDecorator extends AbstractPizzaOrderDecorator{
    public DoubleCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " podwójny ser!";
    }
}
