package com.kodilla.exception.test;

import java.time.LocalTime;

public class ExceptionHandling extends Exception{
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,1);
        }
         catch (Exception e) {
            System.out.println("Somethink is wrong" + e);
            e.printStackTrace();
        } finally {
            LocalTime.now();
        }
    }
}
