package com.kodilla.stream;

import com.kodilla.stream.array.AverageOperation;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        AverageOperation averageOperation = new AverageOperation();

        List<Integer> randomNum = Arrays.asList(5,5,5,5,5,5,4,4);
        double averageTest = averageOperation.getAverage(randomNum);

        Assert.assertEquals(4.75,averageTest,0);
    }
}
