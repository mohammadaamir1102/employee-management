package com.employee.java8;

import java.util.*;

public class SortingMapUsingLambda {

    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("UK", "United Kingdom");
        studentMap.put("IND", "India");
        studentMap.put("MK", "Makka");

        for (Map.Entry<String, String> map : studentMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        System.out.println("________________________");
        studentMap.forEach((key, value) -> System.out.println(key + " " + value));

//      Before the sorting convert to map into list because Collections class accept the list
        List<Map.Entry<String, String>> entries = new ArrayList<>(studentMap.entrySet());
        Collections.sort(entries, (st1, st2) -> st1.getKey().compareTo(st2.getKey())); //traditional approach

        System.out.println("_________________________");
        for (Map.Entry<String, String> map : entries) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println("___________________________");
//      by stream sorting
        studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println); //ascending

        System.out.println("_____________________________");
        studentMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue((st1,st2)->st2.compareTo(st1)))
                    .forEach(System.out::println); // descending


        System.out.println("_____________________________");
        Map<Employee, Integer> mapEmployee = EmployeeMain.findMapEmployee(); // object sorting in ascending format
        mapEmployee.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
                    .forEach(System.out::println);

        System.out.println("_____________________________");
         // object sorting in descending format
        mapEmployee.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed()))
                    .forEach(System.out::println);

    }
}
