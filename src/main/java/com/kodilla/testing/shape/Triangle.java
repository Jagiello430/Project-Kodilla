package com.kodilla.testing.shape;

public final class Triangle implements Shape {
    private final String name;
    private final int base;
    private final int height;
    private final double resultArea;

    public Triangle (final String name,final int base,final int height,final double resultArea){
        this.name = name;
        this.base = base;
        this.height = height;
        this.resultArea = resultArea;
    }
    public String getName() {
        return name;
    }
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
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
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", base=" + base +
                ", height=" + height +
                ", resultArea=" + resultArea +
                '}';
    }
}

