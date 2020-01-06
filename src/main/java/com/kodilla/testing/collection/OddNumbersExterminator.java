package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static void main(String[] args) {
        OddNumbersExterminator object = new OddNumbersExterminator();
        object.exterminate();
    }
    public ArrayList<Integer> exterminate () {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        numbers.add(0, 14);
        numbers.add(1, 2);
        numbers.add(2, 15);
        numbers.add(3, 23);

        for (int evenNumbers : numbers) {
            if (evenNumbers % 2 == 0) {
                evenList.add(evenNumbers);
            }
        }
        return evenList;
    }
}