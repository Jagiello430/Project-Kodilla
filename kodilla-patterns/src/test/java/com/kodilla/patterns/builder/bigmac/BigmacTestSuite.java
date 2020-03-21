package com.kodilla.patterns.builder.bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .sauce("standard")
                .ingredient("bacon")
                .ingredient("tomato")
                .ingredient("cucumber")
                .ingredient("cheese")
                .build();
        //When
        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Than
        Assert.assertEquals(4,howManyIngredients);
        Assert.assertEquals(2,howManyBurgers);
    }
}
