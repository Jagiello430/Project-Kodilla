package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private String nameFigures;
    static ArrayList <Object> listFigures = new ArrayList<>();

    public ShapeCollector(String nameFigures){
        this.nameFigures = nameFigures;

    }

    public static void main(String[] args) {

        ShapeCollector shapeCollector = new ShapeCollector("circle");
        Circle circle = new Circle("Circle", 4, 5026548);
        Triangle triangle = new Triangle("Triangle",2,2,2);
        Square square = new Square("Square", 2,4);

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(square);
        shapeCollector.getFigure(0);
        shapeCollector.showFigures();

    }

    public void addFigure(Shape shape){
        listFigures.add(shape);
    }
    public void removeFigure(Shape shape){
        listFigures.remove(shape);
    }
    public void getFigure(int n) {
        Object result = listFigures.get(n);
        System.out.println(result);
    }
    public void  showFigures(){
        for (Object list : listFigures) {
            System.out.println(list);
        }
    }
}
