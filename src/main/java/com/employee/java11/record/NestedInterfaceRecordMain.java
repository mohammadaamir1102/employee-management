package com.employee.java11.record;

public class NestedInterfaceRecordMain {

    public static void main(String[] args) {
        NestedInterfaceRecord nestedInterfaceRecord =
                new NestedInterfaceRecord(1, "Aamir", () -> "aamir@gmail.com");

        System.out.println(nestedInterfaceRecord);
        System.out.println(nestedInterfaceRecord.contact().getEmail());

    }
}
