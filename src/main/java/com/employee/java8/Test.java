package com.employee.java8;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static String generateLuckyString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        int length = input.length();

        if (length == 1) {
            return input;
        }

        if (length % 2 == 0) {
            // If the length is even, divide the string into two equal parts.
            int middle = length / 2;
            String part1 = input.substring(0, middle);
            String part2 = input.substring(middle);
            return generateLuckyString(part1) + generateLuckyString(part2);
        } else {
            // If the length is odd, remove the middle character and divide the remaining string.
            int middle = length / 2;
            String part1 = input.substring(0, middle);
            String part2 = input.substring(middle + 1);
            return input.charAt(middle) + generateLuckyString(part1) + generateLuckyString(part2);
        }
    }

    public static void main(String[] args) {
        String input = "strings";
        String luckyString = generateLuckyString(input);
        System.out.println("Lucky String: " + luckyString);
    }
}
