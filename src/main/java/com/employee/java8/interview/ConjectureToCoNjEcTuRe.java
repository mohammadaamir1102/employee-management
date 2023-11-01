package com.employee.java8.interview;

public class ConjectureToCoNjEcTuRe {
    public static String formatConjecture(String input) {
        StringBuilder formattedConjecture = new StringBuilder();

        boolean isUpperCase = true;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isUpperCase) {
                    formattedConjecture.append(Character.toUpperCase(c));
                } else {
                    formattedConjecture.append(Character.toLowerCase(c));
                }
                isUpperCase = !isUpperCase;
            } else {
                formattedConjecture.append(c);
                isUpperCase = true;
            }
        }

        return formattedConjecture.toString();
    }

    public static void main(String[] args) {
        String input = "conjecture presented to me";
        String output = formatConjecture(input);
        System.out.println(output); // Output: CoNjEcTuRe PrEsEnTeD To Me
    }
}
