package com.kodilla.exception.test;

import java.time.LocalTime;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println("Somethink is wrong: " + "\n" + e);
        } finally {
            System.out.println("Date: " + LocalTime.now());
        }return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3,0 );

        System.out.println(result);
    }
}
