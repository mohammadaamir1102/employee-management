package com.employee.java11.record;

public record BookRecord(int id, String name, int age) {
    static int actualAge;

    public BookRecord { // compact constructor
        if(age < 18){
            throw new RuntimeException("Age should be greater than 18");
        }
    }

    public int getActualAge(){
       return  actualAge = age;
    }

    public static void staticMethod(){
        System.out.println("static method ");
    }

}
