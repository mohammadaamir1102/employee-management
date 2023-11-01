package com.employee.java8;


public class Test {
    public static void main(String[] args) {
        String input = "conjecture presented to me";
        String[] split = input.split("//");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String s = convertUpperCase(split[i]);
            output.append(s);
        }
        System.out.println(output.toString());
    }

    private static String convertUpperCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0 && !Character.isWhitespace(charArray[i])) {
                stringBuilder.append(Character.toUpperCase(charArray[i]));
            } else {
                stringBuilder.append(charArray[i]);
            }
        }
        return stringBuilder.toString();
    }


}