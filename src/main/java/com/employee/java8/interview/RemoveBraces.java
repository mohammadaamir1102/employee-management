package com.employee.java8.interview;

public class RemoveBraces {

    public static void main(String[] args) {
        /*
         * String s1 = "[Hello]Ignore[World]";
         * out put = Hello World
         */

        String input = "[Hello]Ignore[World]";
        String output = removeBraces(input);
        System.out.println(output);


    }

    private static String removeBraces(String input) {
        StringBuilder output = new StringBuilder();
        boolean insideTheBraces = false;
        for (char c : input.toCharArray()) {
            if (c == '[') {
                insideTheBraces = true;
            } else if (c == ']') {
                output.append(" ");
                insideTheBraces = false;
            } else if (insideTheBraces) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
