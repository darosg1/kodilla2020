package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(10, 10);
        double resultSub = calculator.sub(10, 5);
        double resultMul = calculator.mul(10, 3);
        double resultDiv = calculator.div(30, 10);
        //Then
        Assert.assertEquals(20, resultAdd, 2);
        Assert.assertEquals(5, resultSub, 2);
        Assert.assertEquals(30, resultMul, 2);
        Assert.assertEquals(3, resultDiv, 2);
    }
}