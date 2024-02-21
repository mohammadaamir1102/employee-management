package com.employee.java8;

public record RecordTest(int id, String name, int age) {

    public RecordTest {

    }
    public RecordTest(String name, int age){
        this(0,name,age);
    }
    public static void main(String[] args) {
    }
}
