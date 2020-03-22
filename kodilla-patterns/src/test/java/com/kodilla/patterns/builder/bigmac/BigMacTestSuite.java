package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun ("Sesame seeds bun")
                .burgers (3)
                .ingredient ("Salad")
                .sauce ("Barbecue")
                .ingredient ("Onion")
                .ingredient ("Bacon")
                .ingredient ("Cheese")
                .build ();
        System.out.println (bigMac);
        //When
        int numberOfIngredients=bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, numberOfIngredients);
    }
}
