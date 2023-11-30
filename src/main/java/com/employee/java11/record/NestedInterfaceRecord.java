package com.employee.java11.record;

public record NestedInterfaceRecord(int id, String name, Contact contact)  {
    public interface Contact {
        String getEmail();
    }
}
