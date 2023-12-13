package com.employee.java8;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Salman");
        map.put(1, "Aamir");
        map.put(3, "Ehtesham");
        map.put(2, "Yaseen");
        map.put(4, "Waseen");
        Map<Integer, String> collect = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap
                        (Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new));
        System.out.println(collect);
    }
}
