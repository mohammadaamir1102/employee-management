package com.employee.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {

        Consumer<Integer> consumer =
                (value) -> System.out.println("value is: " + value);

        //        consumer.accept(10);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//      numbers.forEach(consumer);
        numbers.forEach(itr -> System.out.println(itr));
    }

}
