package com.employee.java8.college.assingment;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidExceptionMohammadAamir560 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();

        try {
            if (age < 21) {
                throw new InvalidAgeException("Invalid Age Exception: Employee must be at least 21 years old.");
            }
            System.out.println("Employee name: " + name);
            System.out.println("Employee age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
