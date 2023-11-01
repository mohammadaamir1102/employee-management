package com.employee.java8.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElements {

    public static void main(String[] args) {
        String name = "Mohammad Aamir";
        String firstNonRepeatedElements = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() == 1).findFirst().get().getKey();
        System.out.println("First non-repeated elements is " + firstNonRepeatedElements);
        // here linked map use because it follows the insertion order

        //second non repeated element
        String s = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() == 1)
                .map(Map.Entry::getKey).toList().get(1);
        System.out.println(s);
    }
}
