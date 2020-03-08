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

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        double add = calculator.add(10,5);
        double sub = calculator.sub(10,5);
        double mul = calculator.mul(10,5);
        double div = calculator.div(10,5);

        Assert.assertEquals(15, add,0);
        Assert.assertEquals(5,sub,0);
        Assert.assertEquals(50,mul,0);
        Assert.assertEquals(2,div,0);
    }
}
