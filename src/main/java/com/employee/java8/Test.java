package com.employee.java8;


import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(1, "Aamir", 4400d),
                new Employee(2, "Asad", 4400d),
                new Employee(5, "Zaki", 3200d),
                new Employee(6, "Aamir", 4400d),
                new Employee(4, "Zaki", 3200d),
                new Employee(3, "Asad", 4400d)
        );

        Map.Entry<Double, List<String>> nthHightSalary = getNthHightSalary(empList, 2);
        System.out.println(nthHightSalary);

    }

    private static Map.Entry<Double, List<String>> getNthHightSalary(List<Employee> empList, int i) {

//        Map<Double, List<String>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));
//        List<Map.Entry<Double, List<String>>> list = collect.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList();
//        return list.get(i-1);
        return empList.stream().collect(Collectors.groupingBy(
                Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())
        )).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().get(i-1);
    }
}
