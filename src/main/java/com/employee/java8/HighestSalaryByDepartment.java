package com.employee.java8;


import java.util.*;
import java.util.stream.Collectors;

record BankEmployee(String name, int salary, String department) {
}

public class HighestSalaryByDepartment {

    public static void main(String[] args) {
        List<BankEmployee> bankEmployees = Arrays.asList(
                new BankEmployee("Aamir", 76767, "Counter"),
                new BankEmployee("Aasim", 78655, "Counter"),
                new BankEmployee("Sakib", 76767, "Manager"),
                new BankEmployee("Salman", 76544, "Manager")
        );
        Map<String, BankEmployee> collect = bankEmployees.stream().collect(Collectors.groupingBy(BankEmployee::department,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(BankEmployee::salary)), Optional::get)));
        collect.entrySet().forEach(System.out::println);

    }
}
