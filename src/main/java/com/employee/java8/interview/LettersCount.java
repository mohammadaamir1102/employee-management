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
// -------------------------------------------------------------------------------------------------------------------------
        // Most occurrence character.
        List<String> strings = Arrays.asList("b", "bbb", "aaaaaaaaaaabbb", "abcbb");
        // Flatten the list of strings into a single stream of characters
        Optional<Character> maxChar = strings.stream()
                .flatMapToInt(String::chars)  // Convert each string to an IntStream of chars
                .mapToObj(c -> (char) c)      // Map each int to its corresponding character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Count occurrences
                .entrySet().stream()          // Convert map entries to a stream
                .max(Map.Entry.comparingByValue())  // Find the entry with the maximum count
                .map(Map.Entry::getKey);      // Get the character with the maximum count

        maxChar.ifPresent(c -> System.out.println("Max occurring character: " + c));
//      out put will be = a
    }
}
