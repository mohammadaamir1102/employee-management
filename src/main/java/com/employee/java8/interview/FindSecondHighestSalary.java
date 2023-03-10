package com.employee.java8.interview;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestSalary {
    public static void main(String[] args) {
        int[] salary = {11, 45, 3, 4, 5, 6, 17};
        Integer secondHighestSalary = Arrays.stream(salary).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHighestSalary);


    }
}
