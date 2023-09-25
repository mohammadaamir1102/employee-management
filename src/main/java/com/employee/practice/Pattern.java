package com.employee.practice;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of no !");
        int row = scanner.nextInt();
        for (int i = 0; i <= row-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*" + " ");
                for (j = 0; j <= i - 1; j++) {
                    System.out.println("*" + " ");
                }
                System.out.println("");
            }
        }
        scanner.close();
    }
}
