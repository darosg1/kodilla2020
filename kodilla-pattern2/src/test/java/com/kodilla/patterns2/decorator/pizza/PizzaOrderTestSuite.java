package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.pattern2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaWithDoubleCheese(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        //When
        BigDecimal totalPrice =theOrder.getPrice();
        String description = theOrder.getDescription();
        System.out.println(description+", cena "+ totalPrice+ "PLN");
        //Then
        Assert.assertEquals(new BigDecimal(20), totalPrice);
        Assert.assertEquals("Pizza włoska z serem oraz dodatki: podwójny ser!", description);
    }

    @Test
    public void testPizzaWithAllIngredients(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal totalPrice = theOrder.getPrice();
        String description = theOrder.getDescription();
        System.out.println(description+", cena "+ totalPrice+ "PLN");
        //Then
        Assert.assertEquals(new BigDecimal(31), totalPrice);
        Assert.assertEquals("Pizza włoska z serem oraz dodatki: podwójny ser!, super szynka!, grzybki Moona!", description);
    }
    @Test
    public void testPizzaWithAllIngredientsAndDelivery(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new DeliveryChargeDecorator(theOrder);
        //When
        BigDecimal totalPrice = theOrder.getPrice();
        String description = theOrder.getDescription();
        System.out.println(description+", cena "+ totalPrice+ "PLN");
        //Then
        Assert.assertEquals(new BigDecimal(34), totalPrice);
        Assert.assertEquals("Pizza włoska z serem oraz dodatki: podwójny ser!, super szynka!, " +
                "grzybki Moona! oraz koszty dostawy", description);
    }
}
