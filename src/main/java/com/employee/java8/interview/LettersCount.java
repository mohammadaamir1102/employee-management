package com.employee.java8.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LettersCount {

    public static void main(String[] args) {
        String name = "Aamir khan";
        Map<String, Long> letterCounting = Arrays.stream(name.split("")).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("duplicate count here " + letterCounting);
    }
}
