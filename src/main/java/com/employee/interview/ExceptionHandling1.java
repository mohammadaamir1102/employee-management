package com.employee.interview;

public class ExceptionHandling1 {
    public static void main(String[] args) {
//        try {
        int a = args.length;
        System.out.println(a);
        int b = 10 / a;
        System.out.print(a);
        try {
            if (a == 1)
                a = a / a - a;
            if (a == 2) {
                int[] c = {1};
                c[8] = 9;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("TypeA");
        } catch (ArithmeticException e) {
            System.out.println("TypeB");
        }
//        } got CTE, If use try bcz need to use catch or finally.
    }
}

/*
a) TypeA
b) TypeB
c) Compile Time Error (CA)
d) 0TypeB
*/