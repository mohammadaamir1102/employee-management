package com.employee.java11.utilityMethod;

public class IsBlankMethod {

    public static void main(String[] args) {
        System.out.println(" ".isBlank()); //true
        String s = "Aamir Khan";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }
}
