package com.employee.java8;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Integer month = null;
        String input = "jan";
        month = switch (input){
            case "jan" -> months(input);
            case "feb" -> months(input);
            default -> throw new IllegalStateException("Unexpected value: " + input);
        };
        System.out.println(month);
    }

    public static String janMethod() {
        return "Jan";
    }

    public static String febMethod() {
        return "feb";
    }

    public static String marchMethod() {
        return "march";
    }

    public static String aprilMethod() {
        return "april";
    }

    public static Integer months(String month) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jan", 1);
        map.put("feb", 2);
        return (map.containsKey(month.toLowerCase())) ? map.get(month) : null;
    }

}
