package com.employee.java11.utilityMethod;

public class StripTrailingMethod {
    public static void main(String[] args) {
        String name = "(Mohammad ";
        System.out.println(name.concat("Aamir)")); // (Mohammad Aamir)

        String myName = "(Mohammad       ";
        System.out.print(myName.stripTrailing());
        System.out.print("Aamir)"); // (MohammadAamir) -> removes space end of string
    }
}
