package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addAToB();
        calculator.subtractionAtoB();
    }
}
class Calculator{
    Scanner scanner = new Scanner(System.in);

    public void addAToB(){
        System.out.println("Podaj pierwszą liczbe dodawania: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbe dodawania: ");
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("Wynik dadawania: " + result);
    }
    public void subtractionAtoB (){
        System.out.println("Podaj pierwszą liczbe od której będziemy odejmować: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbe która będzie odejmowana: ");
        int b = scanner.nextInt();

        int result = a - b;
        System.out.println("Wynik odejmowania: " + result);
    }
}
