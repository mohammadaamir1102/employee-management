package com.employee.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws IOException {

       /* Eg. (factorial of 4 is 4 * 3 * 2 * 1 = 24)
        Eg. (factorial of 8 is 40320)
        Eg. (factorial of 6 is 720)*/

        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        System.out.println("input no for factorial ..");
        int no = scanner.nextInt();
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        System.out.println("factorial no is :" + fact);
    }
}
