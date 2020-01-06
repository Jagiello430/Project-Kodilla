package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void Begin(){
        System.out.println("We can start test");
    }
    @After
    public void end(){
        System.out.println("It is finish test");
    }

    @Test
    public void testAddFigure() {
        Circle circle = new Circle("Circle", 4,50.26548);
        ArrayList <Object> testList = new ArrayList<>();

        boolean list = testList.add(circle);

        Assert.assertTrue(list);
    }
    @Test
    public void testRemoveFigure(){
        Circle circle = new Circle("Circle", 4,50.26548);
        ArrayList <Object> testList = new ArrayList<>();

        testList.add(circle);
        boolean list = testList.remove(circle);

        Assert.assertTrue(list);
}
    @Test
    public void testGetFigure() {
        Circle circle = new Circle("Circle", 4, 50.26548);
        ArrayList <Object> testList = new ArrayList<>();
        testList.add(circle);

        Assert.assertEquals(circle,testList.get(0));
    }
    @Test
    public void testShowFigures(){
        Circle circle = new Circle("Circle", 4, 50.26548);
        ArrayList <Object> testList = new ArrayList<>();
        testList.add(circle);

        Assert.assertNotEquals(null,testList);
    }
}
