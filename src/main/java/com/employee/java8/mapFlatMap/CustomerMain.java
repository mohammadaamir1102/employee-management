package com.employee.java8.mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerMain {

    public static List<Customer> findAllCustomer() {
        return Stream.of(new Customer(1, "Aamir", "aamir@gmail.com", Arrays.asList("4523453243", "45236234532")), new Customer(2, "Aasim", "aasim@gmail.com", Arrays.asList("34534345", "679647536")), new Customer(3, "Aaquib", "aaquib@gmail.com", Arrays.asList("42645543", "67546425")), new Customer(4, "Altaf", "altaf@gmail.com", Arrays.asList("134234645", "97584645")), new Customer(5, "Ajmal", "ajmal@gmail.com", Arrays.asList("234125346", "576535645"))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Customer> customers = CustomerMain.findAllCustomer();
        //      converting list of customer name into List<String> -> data transformation
        //      one-to-one mapping because one customer have to one name
        List<String> customersName = customers.stream().map(Customer::getName).collect(Collectors.toList());
        customersName.forEach(System.out::println);

        System.out.println("___________________________");
        List<List<String>> customerPhonesWithMap = customers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
        System.out.println(customerPhonesWithMap);
        //      by this way we are getting list of list out put
        //      output = [[4523453243, 45236234532], [34534345, 679647536], [42645543, 67546425], [134234645, 97584645], [234125346, 576535645]]


        System.out.println("___________________________");
        List<String> customerPhonesWithFlatMap = customers.stream().flatMap(phones -> phones.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(customerPhonesWithFlatMap);
        //      If we want to single stream then follow flatMap()
        //      output = [4523453243, 45236234532, 34534345, 679647536, 42645543, 67546425, 134234645, 97584645, 234125346, 576535645]


    }
}
