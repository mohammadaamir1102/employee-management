package com.employee.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

      String name = "Aamir Khan";
        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> list = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() > 1).map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
        System.out.println(collect);

    }
}
