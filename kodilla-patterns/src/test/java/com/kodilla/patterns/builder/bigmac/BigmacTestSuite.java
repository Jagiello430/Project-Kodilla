package com.kodilla.patterns.builder.bigmac;
import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.BUN.SESAMEROLL;
import static com.kodilla.patterns.builder.bigmac.INGREDIENTS.*;
import static com.kodilla.patterns.builder.bigmac.QUANTITYBURGERS.TWO;
import static com.kodilla.patterns.builder.bigmac.SAUCE.COCTAILESOUCE;
public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder(SESAMEROLL,TWO)
                .sauce(COCTAILESOUCE)
                .ingredient(BACON)
                .ingredient(TOMATO)
                .ingredient(LETTUCE)
                .ingredient(CHEDDAR)
                .build();
        //When
        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        Enum howManyBurgers = bigmac.getBurgers();
        //Than
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertEquals(TWO,howManyBurgers);
    }
}
