package com.employee.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListUsingLambda {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 3, 4, 6, 7, 9, 2, 10, 1, 8);

        System.out.println("----------------");
        Collections.sort(list);
        System.out.println(list); // Ascending

        System.out.println("----------------");
        Collections.reverse(list); //Descending
        System.out.println(list);

        System.out.println("_________________");
        list.stream().sorted().forEach(System.out::println); //Ascending

        System.out.println("_________________");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //Descending

        System.out.println("_________________");
        List<Employee> employees = EmployeeMain.findEmployees();
        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));
        employees.forEach(System.out::println);

        System.out.println("___________________");
        employees.stream().sorted(Comparator.comparing(empName -> empName.getName()))
                .forEach(System.out::println);

        System.out.println("___________________");
        employees.stream().sorted(Comparator.comparing(Employee::getId)) //method reference
                .forEach(System.out::println);

    }
}
