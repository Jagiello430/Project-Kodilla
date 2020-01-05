package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.IntStream;

public final class AverageOperation {
    private final List<Integer> numbers = new ArrayList<>();

    public void getNumberToList() {
        Random random = new Random();
        IntStream.range(0, 20).mapToObj(n -> random.nextInt(9) + 1).forEachOrdered(numbers::add);
        System.out.print("Numbers: " + numbers +"\n");
    }
    public double getAverage(List<Integer> number){
        double average = number.stream()
                .mapToDouble((x) -> x)
                .average()
                .getAsDouble();
        System.out.println(average);
        return average;
    }
    public static void main(String[] args) {
        AverageOperation averageOperation = new AverageOperation();
        averageOperation.getNumberToList();
        averageOperation.getAverage(averageOperation.numbers);

    }
}
