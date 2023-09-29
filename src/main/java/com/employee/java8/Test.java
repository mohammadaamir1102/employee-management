package com.employee.java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        int[] a = {1, 4, 4, 5, 63, 2, 1};
        int[] b = {63, 5, 2};
        Map<Integer, Long> collect = Arrays.stream(a).boxed().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(collect);

        List<Integer> list1 = Arrays.stream(a).boxed().toList();
        List<Integer> list2 = Arrays.stream(b).boxed().toList();

        List<Integer> duplicatesBetweenTwoList = list1.stream().filter(list2::contains).toList();
        System.out.println(duplicatesBetweenTwoList);

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = list1.stream().filter(item -> !set.add(item)).collect(Collectors.toSet());


        Integer max = list2.stream().max(Integer::compare).get();
        Integer min = list2.stream().min(Integer::compare).orElseGet(null);
        System.out.println(max);
        System.out.println(min);
    }

}
