package com.kodilla.spring.shape;

public class Drawer {
    public void doDrawing() {
        Shape shape;

        shape = new Circle();
        shape.getShapeName();

        shape = new Triangle();
        shape.getShapeName();
    }
}
