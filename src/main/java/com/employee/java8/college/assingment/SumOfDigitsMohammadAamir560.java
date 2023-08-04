package com.employee.java8.college.assingment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigitsMohammadAamir560 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer  -> number can not be less than 5 digit.... ");
        int number = Integer.parseInt(br.readLine());

        if (number < 10000) {
            System.out.println("Number should be at least five digits.");
            return;
        }

        int sum = 0;
        int userGivenNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Sum of the digits of " + userGivenNumber + " is: " + sum);
    }
}
