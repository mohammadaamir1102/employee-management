package com.employee.interview;

class X {
    public int i;
    protected int j;
}

class Y extends X {
    int j;

    void display() {
        super.j = 3;
        System.out.println(i + " " + j);
    }
}

public class Output {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
}

/*
a) 1 2 (CA)
b) 2 1
c) 1 3
d) 3 1
*/
