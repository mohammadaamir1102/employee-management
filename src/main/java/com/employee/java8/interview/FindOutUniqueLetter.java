package com.employee.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutUniqueLetter {
    public static void main(String[] args) {
        String name = "organization";
        List<String> uniqueLetter = Arrays.stream(name.split("")).collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("unique letter here "+ uniqueLetter);
    }
}
