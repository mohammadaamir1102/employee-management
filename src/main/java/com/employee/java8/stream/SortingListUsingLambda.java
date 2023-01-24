package com.employee.java8.stream;

import com.employee.java8.Employee;
import com.employee.java8.EmployeeMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Employee> employees = EmployeeMain.findListEmployee();
        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));
        employees.forEach(System.out::println);

        System.out.println("___________________");
        employees.stream().sorted(Comparator.comparing(empName -> empName.getName()))
                .forEach(System.out::println);

        System.out.println("___________________");
        employees.stream().sorted(Comparator.comparing(Employee::getId)) //method reference
                .forEach(System.out::println);

        System.out.println("____________________");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()) //method reference , Descending
                .forEach(System.out::println);

        System.out.println("_____________________");
        //finding 2nd highest salary record
        List<Employee> secondHighestSalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary)
                .reversed()).skip(1).collect(Collectors.toList());
        System.out.println("Second highest salary"+secondHighestSalary);


        System.out.println("_____________________");
        Long count = employees.stream().count();
        System.out.println("count is "+count);

        System.out.println("_____________________");
        Integer collect = employees.stream().collect(Collectors.summingInt(Employee::getId));
        System.out.println("count is "+collect);

        System.out.println("_____________________");

    }
}
