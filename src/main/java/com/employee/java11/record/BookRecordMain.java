package com.employee.java11.record;

public class BookRecordMain {
    public static void main(String[] args) {
        BookRecord aamir = new BookRecord(1, "Aamir", 33);
        System.out.println(aamir);
        System.out.println("___________");

        System.out.println(aamir.getActualAge());
        System.out.println("___________");

        BookRecord.staticMethod();
    }
}
