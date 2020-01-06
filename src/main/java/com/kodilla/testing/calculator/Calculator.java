package com.kodilla.testing.calculator;

public class Calculator {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.add(159,22));
        System.out.println(method.subtract(159,22));
    }
}
class Method{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
}
