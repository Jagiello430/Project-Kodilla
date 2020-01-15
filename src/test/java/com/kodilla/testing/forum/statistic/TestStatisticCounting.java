package com.kodilla.testing.forum.statistic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatisticCounting {
    @Test
    public void testAsTheNumberOfUserIsANull(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        List<String> testList = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(testList);

        int testUserIs0 = statisticCounting.quantityUser();

        Assert.assertEquals(0,testUserIs0);
    }
    @Test
    public void testAsTheNumberOfUserIsAThousand(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        List<String> testList = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            testList.add("aaa");
        }
        when(statistics.usersNames()).thenReturn(testList);

        int testUserIs1000 = statisticCounting.quantityUser();

        Assert.assertEquals(1000,testUserIs1000);
    }
    @Test
    public void testAsTheNumberOfPostIsANull(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        int postsCount = 0;

        when(statistics.postsCount()).thenReturn(postsCount);

        int testPostIs0 = statisticCounting.quantityPost();

        Assert.assertEquals(0,testPostIs0);

    }
    @Test
    public void testAsTheNumberOfPostIsAThousand(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        int postsCount = 1000;

        when(statistics.postsCount()).thenReturn(postsCount);

        int testPostIs1000 = statisticCounting.quantityPost();

        Assert.assertEquals(1000,testPostIs1000);

    }
    @Test
    public void testAsTheNumberOfCommentsIsANull(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        int commentsCount = 0;

        when(statistics.commentsCount()).thenReturn(commentsCount);

        int testCommentsIs0 = statisticCounting.quantityCommit();

        Assert.assertEquals(0,testCommentsIs0);

    }
    @Test
    public void testAsTheNumberOfCommentsIsSmallerThanPosts(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        int commentsCount = 44;
        int postsCount = 45;

        when(statistics.commentsCount()).thenReturn(commentsCount);
        when(statistics.postsCount()).thenReturn(postsCount);

        boolean postsIsBigger = statisticCounting.quantityPost() >
                statisticCounting.quantityCommit();

        Assert.assertTrue(postsIsBigger);

    }
    @Test
    public void testAsTheNumberOfCommentsIsBiggerThanPosts(){
        Statistic statistics = mock(Statistic.class);
        StatisticCounting statisticCounting = new StatisticCounting(statistics);
        int commentsCount = 44;
        int postsCount = 43;

        when(statistics.commentsCount()).thenReturn(commentsCount);
        when(statistics.postsCount()).thenReturn(postsCount);

        boolean commitIsBigger = statisticCounting.quantityPost() <
                statisticCounting.quantityCommit();

        Assert.assertTrue(commitIsBigger);

    }
}
