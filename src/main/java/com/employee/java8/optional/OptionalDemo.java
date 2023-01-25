package com.employee.java8.optional;

import com.employee.java8.mapFlatMap.Customer;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    private final static String EMPTY ="";
    public static void main(String[] args) {
        Customer customer =
                new Customer(1, "Aamir khan", null, Arrays.asList("3242343,534324123"));
        //empty
        //of
        //ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println("_________________     "+emptyOptional);

        // if customer.getEmail is null then got emptyOptional bcz Optional.ofNullable() method
        Optional<String> customerEmail = Optional.ofNullable(customer.getEmail());
        System.out.println("__________________     "+customerEmail);


        // if customer.getEmail is null then got NullPointerException bcz Optional.of() method
        Optional<String> emailOptional = Optional.of(customer.getEmail());
        System.out.println("__________________       "+emailOptional);


    }
}
