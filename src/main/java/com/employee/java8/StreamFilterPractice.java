package com.employee.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterPractice {

    public static void main(String[] args) {
        List<String> studentName = new ArrayList<>();
        Collections.addAll(studentName, "aamir", "aasim", "imran", "ibaad");
//      without using filter using
        for (String stname : studentName) {
            if (stname.startsWith("a")) {
                System.out.println(stname);
            }
        }
//      with filter

        System.out.println("below filter example______________");

        List<String> filteredStudents = studentName.stream().filter(t -> t.startsWith("a")).collect(Collectors.toList());
        filteredStudents.forEach(System.out::println);

        System.out.println("below map example -----------------");

//      without using filter method
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("UK", "United Kingdom");
        studentMap.put("IND", "India");
        studentMap.put("MK", "Makka");

        for (Map.Entry<String, String> map : studentMap.entrySet()) {
            if (map.getKey().startsWith("UK")) {
                System.out.println(map.getKey() + " " + map.getValue());
            }
        }

        System.out.println("below filter method example ________");


        studentMap.entrySet().stream()
                .filter(t -> t.getKey().startsWith("MK"))
                .forEach(out -> System.out.println(out));

//      project level example (filter out tax payer employee)
        List<Employee> employees = EmployeeMain.findListEmployee();
        List<Employee> taxableEmployees = employees.stream()
                .filter(taxableEmployee -> taxableEmployee.getSalary() > 20000)
                .collect(Collectors.toList());

//        taxableEmployees.forEach(System.out::println);
        System.out.println(StreamFilterPractice.evaluateTaxUser("tax"));


    }

    public static List<Employee> evaluateTaxUser(String input) {
        List<Employee> employees = EmployeeMain.findListEmployee();
        return (input.equalsIgnoreCase("tax")) ? employees.stream()
                .filter(taxableEmployee -> taxableEmployee.getSalary() > 20000)
                .collect(Collectors.toList()) : employees.stream()
                .filter(taxableEmployee -> taxableEmployee.getSalary() < 20000)
                .collect(Collectors.toList());

    }
}
