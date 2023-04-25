package com.employee.java8.record;

record Aamir(int id, String name) {
    public Aamir(int id, String name) {
        if (id <= 0) {
            throw new IllegalArgumentException("id cannot be zero or negative");
        }
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println("show method called !");
    }
}

public class RecordClass {
    public static void main(String[] args) {
        Aamir aamir1 = new Aamir(1, "salman khan");
        Aamir aamir2 = new Aamir(2, "Aamir khan");
        System.out.println(aamir1.equals(aamir2));
        System.out.println(aamir1);
        System.out.println(aamir2);
        System.out.println(aamir1.id());
        System.out.println(aamir2.name());
        if(aamir1.name().equals("salman khan")){
            aamir1.show();
        }
    }
}
