package com.employee.java11.utilityMethod;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinesMethod {
    public static void main(String[] args) {
        String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList())); // [JD, JD, JD]

        String name = "Mohammad Aamir";
        System.out.println(name.lines().collect(Collectors.toList())); // [Mohammad Aamir]
        Stream<String> lines = name.lines(); // returns stream of string
    }
}
