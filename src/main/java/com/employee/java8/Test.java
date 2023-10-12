package com.employee.java8;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s1 = "[Hello]Ignore[World]";
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(s1);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group(1)).append(" ");
        }

        String finalResult = result.toString().trim();
        System.out.println(finalResult);
    }
}
