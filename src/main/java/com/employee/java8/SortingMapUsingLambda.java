package com.employee.java8;

import java.util.HashMap;
import java.util.Map;

public class SortingMapUsingLambda {

    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("UK", "United Kingdom");
        studentMap.put("IND", "India");
        studentMap.put("MK", "Makka");

        String s ="sarang";
        System.out.println(s.charAt(5));

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.deleteCharAt(5);
        System.out.println(stringBuilder);

    }
}
