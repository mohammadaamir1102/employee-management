package com.employee.java8.mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerMain {

    public static List<Customer> findAllCustomer(){
        return Stream.of(
                new Customer(1,"Aamir","aamir@gmail.com", Arrays.asList("4523453243","45236234532")),
                new Customer(2,"Aasim","aasim@gmail.com", Arrays.asList("34534345","679647536")),
                new Customer(3,"Aaquib","aaquib@gmail.com", Arrays.asList("42645543","67546425")),
                new Customer(4,"Altaf","altaf@gmail.com", Arrays.asList("134234645","97584645")),
                new Customer(5,"Ajmal","ajmal@gmail.com", Arrays.asList("234125346","576535645"))
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Customer> allCustomer = CustomerMain.findAllCustomer();
        System.out.println(allCustomer.size());
        allCustomer.forEach(System.out::println);
    }
}
