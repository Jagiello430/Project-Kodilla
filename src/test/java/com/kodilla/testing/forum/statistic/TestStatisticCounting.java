package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticCounting {
    @Test
    public void testHowListUserIsNull(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        List<String> testList = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(testList);

        int testPostIs0 = statisticCounting.quantityUser();

        Assert.assertEquals(0,testPostIs0);
    }
}
