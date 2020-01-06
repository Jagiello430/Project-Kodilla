package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name = "Triangle";
    int base;
    int height;
    double resultArea;

    public Triangle (String name, int base, int height, double resultArea){
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
    public void getShapeName(String name) {
        System.out.println(name);
    }
    @Override
    public void getField() {
        resultArea = ((base * height) / 2);
        System.out.println(resultArea);;
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

