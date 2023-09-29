package com.employee.interview;

class Parent {
    public int i;
    public int j;

    Parent() {
        i = 1;
        j = 2;
    }
}

class Child extends Parent {
    int a;

    Child() {
        super();
    }
}

public class SuperMain {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.i + " " + obj.j);
    }
}
/*
a) 1 2 (CA)
b) 2 1
c) Runtime Error
d) Compilation Error
*/