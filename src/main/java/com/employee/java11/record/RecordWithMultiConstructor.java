package com.employee.java11.record;

public record RecordWithMultiConstructor(int id, String name, boolean isActive, int age) {

    public RecordWithMultiConstructor(String name, boolean isActive){
        this(0,name,isActive,0);
//        System.out.println(name + " " + isActive);
    }

    public RecordWithMultiConstructor(int age){
        this(0,null,false,age);
//        System.out.println(age);
    }

    public static void main(String[] args) {
        RecordWithMultiConstructor recordWithMultiConstructor = new RecordWithMultiConstructor(10);
        System.out.println(recordWithMultiConstructor);
        RecordWithMultiConstructor recordWithMultiConstructor1 = new RecordWithMultiConstructor("aamir", true);
        System.out.println(recordWithMultiConstructor1);
        RecordWithMultiConstructor recordWithMultiConstructor2 = new RecordWithMultiConstructor(1, "ak", true, 33);
        System.out.println(recordWithMultiConstructor2);
    }
}
