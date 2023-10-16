package com.employee.java8;


public class Test {
    public void add(Object obj) {
        System.out.println("i am in Object block");
    }
    public void add(String str) {
        System.out.println("i am in String block");
    }

    public static void main(String[] args) {
        Test exmp = new Test();
        exmp.add(null);
    }

}
