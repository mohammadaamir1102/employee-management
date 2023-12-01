package com.employee.java11.record;

public class EntityRefRecordMain {
    public static void main(String[] args) {
        Address address = new Address("23434", "Basti");
        EntityRefRecord entityRefRecord = new EntityRefRecord(1, "Aamir", address);
        System.out.println(entityRefRecord);
    }
}
