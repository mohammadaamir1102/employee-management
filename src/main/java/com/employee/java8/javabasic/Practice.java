package com.employee.java8.javabasic;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int cond = 1;
        int[] a = { 6,4,3,2,1,8 };
        int [] miss = new int[10];
        System.out.println("Ascending is: ");
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
           if(a[i] != cond){
               miss[i]=cond;
           }
           cond++;
        }
        for (int i = 0; i < a.length; i++) {
            if(miss[i] > 0) {
                System.out.println(miss[i]);
            }
        }
    }

}
