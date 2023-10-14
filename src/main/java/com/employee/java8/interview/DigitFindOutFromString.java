package com.employee.java8.interview;

public class DigitFindOutFromString {

    public static void main(String[] args) {
        String input = "Aamir123Khan";
        String digit = findoutNumber(input);
        System.out.println(digit);
        System.out.println("_____________");
        String string = findoutString(input);
        System.out.println(string);
    }

    private static String findoutNumber(String input) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    private static String findoutString(String input) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
