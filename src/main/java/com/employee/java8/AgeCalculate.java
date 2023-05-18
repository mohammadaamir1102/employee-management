package com.employee.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        String dob = br.readLine();
        LocalDate dateOfBirth = LocalDate.parse(dob);
        int year = calculateAge(dateOfBirth);
        System.out.println("Student age is = " + year);

    }
    public static int calculateAge(LocalDate dateOfBirth){
        LocalDate currentDate = LocalDate.now();
        if((dateOfBirth != null) && (currentDate !=null)){
            return Period.between(dateOfBirth, currentDate).getYears();
        }
        return 0;
    }
}
