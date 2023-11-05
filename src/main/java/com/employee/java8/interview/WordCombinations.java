package com.employee.java8.interview;

public class WordCombinations {
    public static void main(String[] args) {
        String word = "abcd";
        generateCombinations("", word);
    }

    public static void generateCombinations(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char nextChar = remaining.charAt(i);
            String newPrefix = prefix + nextChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateCombinations(newPrefix, newRemaining);
        }
    }
}

