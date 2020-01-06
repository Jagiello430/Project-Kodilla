package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name = "Circle";
    int radius;
    double resultArea;

    public Circle(String name, int radius, double resultArea){
        this.name = name;
        this.radius = radius;
        this.resultArea = resultArea;
    }

    public String getName() {
        return name;
    }
    public int getRadius() {
        return radius;
    }
    public double getResultArea() {
        return resultArea;
    }

    @Override
    public void getShapeName(String name) {
        System.out.println(name);
    }

    @Override
    public void getField() {
        resultArea = Math.PI * Math.pow(radius,2);
        System.out.println(resultArea);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", resultArea=" + resultArea +
                '}';
    }
}
