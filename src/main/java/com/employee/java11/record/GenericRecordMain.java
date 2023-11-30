package com.employee.java11.record;

public class GenericRecordMain {

    public static void main(String[] args) {
        GenericRecord<String, String> genericRecord = new GenericRecord<>("IND", "India");
        System.out.println(genericRecord);

    }
}
