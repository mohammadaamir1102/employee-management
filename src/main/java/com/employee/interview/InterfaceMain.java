package com.employee.interview;

interface Calculate {
    void cal(int item);
}

class Display implements Calculate {
    int x;

    public void cal(int item) {
        x = item * item;
    }
}

public class InterfaceMain {
    public static void main(String args[]) {
        Display arr = new Display();
        arr.x = 0;
        arr.cal(2);
        System.out.print(arr.x);
    }
}
/*
a) 0
b) 2
c) 4
d) None of the mentioned
*/