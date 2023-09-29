package com.employee.interview;

interface UnitedKingdom {
    int VAR = 0;

    void cal(int item);
}

class Bharat implements UnitedKingdom {
    int x;

    public void cal(int item) {
        if (item < 2) {
//            System.out.println(VAR);
            x = VAR;
        } else {
            x = item * item;
        }
    }
}

public class InterfaceMain1 {
    public static void main(String[] args) {
        Bharat[] arr = new Bharat[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = new Bharat();
        }
        arr[0].cal(0);
        arr[1].cal(1);
        arr[2].cal(2);
        System.out.print(arr[0].x + " " + arr[1].x + " " + arr[2].x);

    }
}
/*
a) 0 1 2
b) 0 2 4
c) 0 0 4 (CA)
d) 0 1 4
*/