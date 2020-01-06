package com.kodilla.testing.calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testMain(){
        Method method = new Method();

        int resultAdd = method.add(159,22);
        int resultSub = method.subtract(159,22);

        Assert.assertEquals(resultAdd,181);
        Assert.assertEquals(resultSub,137);
    }
}