package com.employee.java8.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharIndex {
    public static void main(String[] args) {
        String input = "unbgunbgi";
        int output = firstNoRepeatingCharIndex(input);
        System.out.println(output);
    }

    public static int firstNoRepeatingCharIndex(String input) {

        String firstNoRepeatedValue = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(firstNoRepeatedValue);
        return input.indexOf(firstNoRepeatedValue);
    }
}
