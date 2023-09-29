package com.employee.interview;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.print("A");
            throw new NullPointerException("Hello");
        } catch (ArithmeticException e) {
            System.out.print("B");
        }
    }
}
/*
a) A
b) B
c) Hello
d) Runtime Exception (CA)
*/