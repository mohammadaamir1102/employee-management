package com.employee.java11.convertToRecord;

import com.employee.java8.Employee;
import com.employee.java8.Student;

import java.util.*;

public class EmployeeMain {

    public static List<com.employee.java8.Employee> findListEmployee() {
        List<com.employee.java8.Employee> employees = Arrays.asList(
                new com.employee.java8.Employee(1, "Aamir Khan", 10000.0),
                new com.employee.java8.Employee(2, "Imran khan", 10000.0),
                new com.employee.java8.Employee(1, "Muzammil khan", 30000.0),
                new com.employee.java8.Employee(4, "Noman khan", 40000.0));
        return employees;
    }

    public static List<com.employee.java8.Employee> findListEmployee1() {
        List<com.employee.java8.Employee> employees1 = Arrays.asList(
                new com.employee.java8.Employee(1, "Salman Khan", 10000.0),
                new com.employee.java8.Employee(2, "Imran khan", 10000.0),
                new com.employee.java8.Employee(1, "Muzammil khan", 30000.0),
                new com.employee.java8.Employee(4, "Noman khan", 40000.0));
        return employees1;
    }

    public static Map<com.employee.java8.Employee, Integer> findMapEmployee() {
        Map<com.employee.java8.Employee, Integer> employeeMap = new HashMap<>();
        employeeMap.put(new com.employee.java8.Employee(3, "Aamir khan", 10000.0), 8111);
        employeeMap.put(new com.employee.java8.Employee(2, "Imran khan", 20000.0), 8112);
        employeeMap.put(new com.employee.java8.Employee(1, "Muzammil khan", 30000.0), 8113);
        employeeMap.put(new com.employee.java8.Employee(4, "Noman khan", 40000.0), 8114);
        return employeeMap;
    }

    public static List<com.employee.java8.Employee> findUniqueNameObjecdt(){
        List<com.employee.java8.Employee> employees = Arrays.asList(
                new com.employee.java8.Employee(1, "Aamir Khan", 10000.0),
                new com.employee.java8.Employee(2, "Imran khan", 10000.0),
                new com.employee.java8.Employee(3, "Aamir Khan", 30000.0),
                new Employee(4, "Noman khan", 40000.0));
        return employees;
    }
    public static void main(String[] args) {
        com.employee.java8.EmployeeMain.findListEmployee().forEach(System.out::println);
        System.out.println(com.employee.java8.EmployeeMain.findMapEmployee());
    }

    public static Optional<Student> findStudent(){
        Student student = new Student();
        student.setId(1);
        student.setAddress("MillatNager");
        return Optional.of(student);
    }

}
