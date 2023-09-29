package com.employee.interview;

public class Ambiguity {
    public void m1(int i, float f) {
        System.out.println(" int float method");
    }
    public void m1(float f, int i) {
        System.out.println("float int method");
    }
    public static void main(String[] args) {
        Ambiguity ambiguity = new Ambiguity();
//        ambiguity.m1(20.20); got CTE bcz of ambiguity.
    }
}

/*
a) int float method
b) float int method
c) compile time error
d) run time error
* */