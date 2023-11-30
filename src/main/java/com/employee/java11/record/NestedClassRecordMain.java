package com.employee.java11.record;

public class NestedClassRecordMain {

    public static void main(String[] args) {
        NestedClassRecord nestedClassRecord = new NestedClassRecord(1, "Aamir",
                new NestedClassRecord.Contact("aamir@gmail.com", "45342534"));
        System.out.println(nestedClassRecord);
        System.out.println(nestedClassRecord.contact());
        System.out.println(nestedClassRecord.contact().getPhone());
    }
}
