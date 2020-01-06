package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test begin");
    }
    @After
    public void After(){
        System.out.println("Test end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = oddNumbersExterminator.exterminate();

        Assert.assertNotEquals(testList.size(),0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = oddNumbersExterminator.exterminate();
        for (int num : testList)
            if (num % 2 == 0){
                Assert.assertFalse(false);
            }
    }
}