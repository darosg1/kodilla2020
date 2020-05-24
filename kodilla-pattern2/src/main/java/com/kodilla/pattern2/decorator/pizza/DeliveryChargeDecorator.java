package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;

public class DeliveryChargeDecorator extends AbstractPizzaOrderDecorator{
    public DeliveryChargeDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(3));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " oraz koszty dostawy";
    }
}
