package com.employee.java8Interview;

import java.util.Arrays;
import java.util.List;

public class AverageUsingJava8 {

    //Given a list of numbers, return the average of all numbers  by java 8
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        double firstWay = numbers.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .average() // Calculate the average
                .orElse(0.0); // Provide a default value if list is empty

        double sum = 0.0;
        for (Integer number : numbers) {
            sum += number;
        }

        double secondWay = sum / numbers.size();

        System.out.println("Average of the numbers: " + firstWay);
        System.out.println("Average of the numbers: " + secondWay);
    }
}
