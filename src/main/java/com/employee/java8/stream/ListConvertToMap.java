package com.employee.java8.stream;

import com.employee.java8.Employee;
import com.employee.java8.EmployeeMain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListConvertToMap {
    public static void main(String[] args) {
        List<Employee> employee = EmployeeMain.findListEmployee();

        List<User> users = List.of(
                new User(1L, "Aamir", 23),
                new User(2L, "Aman", 42),
                new User(3L, "Imran", 29),
                new User(4L, "Furqan", 30),
                new User(5L, "Salman", 18),
                new User(6L, "Gufran", 19)
//                new User(1L, "Aamir", 23)
        );

        /*
         * Let’s stream the List and collect it to a Map using Collectors.toMap(keyMapper, valueMapper)
         * where key is unique id of user and value is name of the user which may duplicate.
         */
        Map<Long, String> map = users.stream()
                .collect(Collectors.toMap(User::getId, User::getName));
        map.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("______________________");

        /*
        Another example to create a Map using unique user id as key and user object as value
        */

        Map<Long, User> map1 = users.stream()
                .collect(Collectors.toMap(User::getId, Function.identity()));
        map1.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("_______________________");

        /*
        * Let’s see what happens when we use user-name
        * as a key which is not unique and user age as value.
        *
        * Note:- It throws IllegalStateException which is expected since key of a Map should be unique
        */

        Map<String, Integer> map3 = users.stream()
                .collect(Collectors.toMap(User::getName, User::getAge));
        map1.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println("________________________");
    }
}
