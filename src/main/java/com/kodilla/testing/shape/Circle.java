package com.kodilla.testing.shape;

public final class Circle implements Shape {
    private final String name;
    private final int radius;
    private final double resultArea;

    public Circle(final String name,final int radius,final double resultArea){
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
    public String getShapeName(String name) {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius,2);
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
