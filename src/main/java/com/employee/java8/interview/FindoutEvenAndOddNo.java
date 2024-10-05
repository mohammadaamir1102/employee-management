package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(item -> item % 2 == 0));
        System.out.println("Even numbers are " + collect.get(true));
        System.out.println("Odd number are " + collect.get(false));

        /*
        *  outputs are below
        *  Even numbers are [2, 4, 6, 8]
        *  Odd number are [1, 3, 5, 7, 9]
        *
        * */

    }
}
