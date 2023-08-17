package com.employee.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnSumOfAllNum {
    //     Given a list of numbers, return the sum of all numbers.
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);

        int firstWay = numbers.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum(); // Calculate the sum
        int secondWay = numbers.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println("Sum of numbers: " + firstWay);
        System.out.println("Sum of numbers: "+ secondWay);

    }
}
