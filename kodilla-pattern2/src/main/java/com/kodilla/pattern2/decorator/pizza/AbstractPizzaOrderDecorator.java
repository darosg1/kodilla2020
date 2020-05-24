package com.kodilla.pattern2.decorator.pizza;

import java.math.BigDecimal;
//Klasa dekorująca/klasa abstrakcyjna stanowowiąca bazę do roszerzenia przez inne dekoraktory
public class AbstractPizzaOrderDecorator implements PizzaOrder{
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }
    @Override
    public String getDescription(){
        return pizzaOrder.getDescription();
    }
}
