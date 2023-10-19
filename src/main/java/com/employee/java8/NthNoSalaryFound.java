package com.employee.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class NthNoSalaryFound {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the nth salary....");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nth = Integer.parseInt(br.readLine());
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Aamir", 4400d),
                new Employee(2, "Asad", 4400d),
                new Employee(5, "Zaki", 3200d),
                new Employee(6, "Aamir", 4400d),
                new Employee(4, "Zaki", 3200d),
                new Employee(3, "Asad", 4400d)
        );
        try {

            Map.Entry<Double, List<String>> nthHighestSalary2 = getNthHighestSalary(empList, nth);
            System.out.println("Test Case 2: " + nthHighestSalary2);

            System.out.println("_________________________________");
            List<Employee> nthHighestSalaryEmployeeAllData = getNthHighestSalaryEmployeeAllData(empList);
            System.out.println("second highest salary Employee Data " + nthHighestSalaryEmployeeAllData);
        } catch (Exception e) {
            System.out.println("Not Exist......");
        }
    }

    private static Map.Entry<Double, List<String>> getNthHighestSalary(List<Employee> empList, int nth) {

        if (empList.isEmpty() || nth <= 0 || empList.size() < nth) {
            throw new IllegalArgumentException("Please validate your inputs.");
        }

        return empList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(nth - 1);
    }


    private static List<Employee> getNthHighestSalaryEmployeeAllData(List<Employee> empList) {
        return empList.stream().collect(Collectors.groupingBy(Employee::getSalary))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .map(Map.Entry::getValue).skip(1).findFirst().orElse(null);
    }


}
