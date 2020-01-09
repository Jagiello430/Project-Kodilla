package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class testGetPeopleQuantity {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();

        BigDecimal population = new BigDecimal("1245350933");

        Assert.assertEquals(world.getPeopleQuantity(), population);
    }
}
