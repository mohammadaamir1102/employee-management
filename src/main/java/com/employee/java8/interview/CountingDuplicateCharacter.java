package com.employee.java8.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingDuplicateCharacter {
    public static void main(String[] args) {
        String firstInput = "aaaaabbbbbbcccddddd";
        String secondInput = "daf";
        List<String> firstList = Arrays.stream(firstInput.split("")).toList();
        List<String> secondList = Arrays.stream(secondInput.split("")).toList();
        Set<String> set = new HashSet<>();

        long count = firstList.stream().filter(secondList::contains)
                .filter(set::add).count();
        System.out.println(count); // output = 2
    }
}
