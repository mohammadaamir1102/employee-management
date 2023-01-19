package com.employee.java8;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {

    public static List<Employee> findEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "Aamir khan", 10000.0),
                new Employee(2, "Imran khan", 20000.0),
                new Employee(1, "Muzammil khan", 30000.0),
                new Employee(4, "Noman khan", 40000.0)
        );
        return employees;
    }

    public static void main(String[] args) {
        EmployeeMain.findEmployees().forEach(System.out::println);
    }
}
