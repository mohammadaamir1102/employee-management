package com.employee.java11.utilityMethod;

public class StripLeadingMethod {
    public static void main(String[] args) {
        String name = "     (Mohammad Aamir)";
        System.out.println(name.stripLeading()); // Removes the white space beginning of string.
    }
}
