package com.employee.java8.interview;

public class AAABBBCCACount {

    public static void main(String[] args) {

        String input = "aaabbbcca";
        String encoded = encodeString(input);
        System.out.println(encoded); // Output: "3a3b2c1a"

    }

    public static String encodeString(String input) {
        if (input == null || input.isEmpty()) {
            return ""; // Handle empty input
        }

        StringBuilder encodedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                encodedString.append(count).append(currentChar);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        // Append the count and character for the last consecutive characters
        encodedString.append(count).append(currentChar);

        return encodedString.toString();
    }
}
