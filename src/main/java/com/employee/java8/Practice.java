package com.employee.java8;

import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        Predicate<Integer> predicate = t -> Boolean.parseBoolean(t % 2 == 0 ? "Odd" : "Even");
    }
}

