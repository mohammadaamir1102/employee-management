package com.employee.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeMain {

    public static List<Employee> findListEmployee() {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aamir khan", 10000.0),
                new Employee(2, "Imran khan", 20000.0),
                new Employee(1, "Muzammil khan", 30000.0),
                new Employee(4, "Noman khan", 40000.0));
        return employees;
    }

    public static Map<Employee, Integer> findMapEmployee() {
        Map<Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(3, "Aamir khan", 10000.0), 8111);
        employeeMap.put(new Employee(2, "Imran khan", 20000.0), 8112);
        employeeMap.put(new Employee(1, "Muzammil khan", 30000.0), 8113);
        employeeMap.put(new Employee(4, "Noman khan", 40000.0), 8114);
        return employeeMap;
    }

    public static void main(String[] args) {
        EmployeeMain.findListEmployee().forEach(System.out::println);
        System.out.println(EmployeeMain.findMapEmployee());
    }
}
