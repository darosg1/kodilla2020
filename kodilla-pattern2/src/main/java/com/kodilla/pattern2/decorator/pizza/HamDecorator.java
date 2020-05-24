package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class HamDecorator extends AbstractPizzaOrderDecorator{
    public HamDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(6));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", super szynka!";
    }
}
