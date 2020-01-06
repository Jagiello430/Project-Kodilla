package com.kodilla.testing.shape;

public final class Square implements Shape {
    private final String name;
    private final int side;
    private final double resultArea;

    public Square(final String name,final int side,final double resultArea){
        this.name = name;
        this.side = side;
        this.resultArea = resultArea;
    }
    public String getName() {
        return name;
    }
    public int getSide() {
        return side;
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
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                ", resultArea=" + resultArea +
                '}';
    }
}


