package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User janusz = new Millenials("Janusz Kowalski");
        User grażyna = new YGeneration("Grażyna Kowalska");
        User zbigniewo = new ZGeneration("Zbigniew Nowak");

        //When
        String januszUse = janusz.sharePost();
        System.out.println("Janusz use: " + januszUse);
        String grażynaUse = grażyna.sharePost();
        System.out.println("Grażyna use: " + grażynaUse);
        String zbigniewoUse = zbigniewo.sharePost();
        System.out.println("Zbigniewo use: " + zbigniewoUse);

        //Then
        Assert.assertEquals("SC",januszUse);
        Assert.assertEquals("TW",grażynaUse);
        Assert.assertEquals("FB",zbigniewoUse);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User janusz = new Millenials("Janusz Kowalski");

        //When
        String januszUse = janusz.sharePost();
        System.out.println("Janusz use: " + januszUse);
        janusz.setSocialPublisher(new FacebookPublisher());
        januszUse = janusz.sharePost();
        System.out.println("Janusz use: " + januszUse);

        //Then
        Assert.assertEquals("FB",januszUse);
    }
}
