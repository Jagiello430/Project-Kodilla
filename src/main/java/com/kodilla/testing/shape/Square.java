package com.kodilla.testing.shape;

public class Square implements Shape {
    String name = "Square";
    int side;
    double resultArea;

    public Square(String name, int side, double resultArea){
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
    public void getShapeName(String name) {
        System.out.println(name);

    }
    @Override
    public void getField() {
        resultArea = Math.pow(side,2);
        System.out.println(resultArea);

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


