package com.employee.interview;

class A {
    public int i;
    private int j;
}

class B extends A {
    void display() {
//        super.j = super.i + 1; CTE
//        System.out.println(super.i + " " + super.j); CTE
    }
}

public class InheritanceMain {
    public static void main(String args[]) {

        B obj = new B();
        obj.i = 1;
//        obj.j = 2; CTE
        obj.display();
    }
}

/*
a) 2 2
b) 3 3
c) Runtime Error
d) Compilation Error (CA)
*/