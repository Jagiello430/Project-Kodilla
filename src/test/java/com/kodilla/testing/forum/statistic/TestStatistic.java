package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestStatistic {
    @Test
    public void testCalculateAdvStatics(Statistic statistic){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        when(statistics.postsCount()).thenReturn(0);

        double testPostIs0 = statisticCounting.quantityPost();

        Assert.assertEquals(0,testPostIs0);
    }
}
