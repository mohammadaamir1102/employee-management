package com.employee.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice1 {
    public static void main(String[] args) {
       /*
       Predicate<Integer> predicate = (value) -> {
            if (value % 2 == 0) {
                return true;
            }
            return false;
        };
         */
        Predicate<Integer> predicate = value -> value % 2 == 0;
        System.out.println(predicate.test(3));

        // find out even no
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(even -> even % 2 == 0).forEach(System.out::println);

    }
}
