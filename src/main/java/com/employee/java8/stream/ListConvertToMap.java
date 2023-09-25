package com.employee.java8.stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListConvertToMap {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User(1L, "Aamir", 23),
                new User(2L, "Aamir", 42),
                new User(3L, "Imran", 29),
                new User(4L, "Furqan", 30),
                new User(5L, "Furqan", 18),
                new User(6L, "Gufran", 19)
        );
        List<User> modifiedList = users.stream().filter(items -> items.getAge() > 29).collect(Collectors.toList());
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
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

        Map<Long, Integer> map3 = users.stream()
                .collect(Collectors.toMap(User::getId, User::getAge));
        map3.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println("________________________");

        /*
        * Java 8 Streams provide Collectors.toMap(keyMapper, valueMapper, mergeFunction) overloaded
        * method where you can specify which value to consider when duplicate key issue occur.

        Let’s    collect a Map having user-name as a key, merge function indicate
        that keep the old value for the same key:-
        *
        * We don’t see any error this time and a Map is created with unique user-names.
        * Duplicate user-names are merged having age value whichever comes first in the list
        *
        */

        Map<String, Long> idValueMap = users.stream()
                .collect(Collectors.toMap(User::getName, User::getId, (oldValue, newValue) -> oldValue));
        idValueMap.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("_______________________");


        /*
         * Java 8 Streams provide Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory)
         * overloaded method where you can specify the type using mapFactory to return ConcurrentHashMap,
         * LinkedHashMap or TreeMap.
         */

        Map<String, Integer> concurrentHashMap = users.stream()
                .collect(Collectors.toMap(User::getName, User::getAge, (o1, o2) -> o1, ConcurrentHashMap::new));
        concurrentHashMap.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("_______________________");

        Map<String, Integer> linkedHashMap = users.stream()
                .collect(Collectors.toMap(User::getName, User::getAge, (o1, o2) -> o1, LinkedHashMap::new));
        linkedHashMap.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("________________________");

        Map<String, Integer> treeMap = users.stream()
                .collect(Collectors.toMap(User::getName, User::getAge, (o1, o2) -> o1, TreeMap::new));
        treeMap.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("________________________");

        /*
         * Let’s group the stream of user object by name using Collectors.groupingBy(keyMapper)
         * which returns a Map having key as user-name and value as List of user object matching that key
         */

        Map<String, List<User>> groupByName = users.stream()
                .collect(Collectors.groupingBy(User::getName));
        groupByName.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println(" above grouping___________________________");

        /*
         * Count the users having the same name, where key is user-name and value is count.
         */

        Map<String, Long> countByName = users.stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.counting()));
        countByName.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("___________________________");

        /*
         * Sum of the age of users having the same name, where key is user-name and value is sum of age.
         */

        Map<String, Integer> sumAgeByName = users.stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.summingInt(User::getAge)));
        sumAgeByName.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("______________________________");
        /*
         * counting user ages
         */
        Integer sumOfAge = users.stream()
                .collect(Collectors.summingInt(User::getAge));
        System.out.println("user ages sum " + sumOfAge);

        System.out.println("________________________________");

        // anyMatch accept the input as predicate and return boolean

        boolean anyMatch = users.stream().anyMatch(item -> item.getName().matches("Aamir"));
        System.out.println("any match out put is = " + anyMatch);

        // allMatch accept the input as predicate and return boolean

        boolean allMatch = users.stream().allMatch(item -> item.getName().matches("Aamir"));
        System.out.println("all match out put is = " + allMatch);

        // nonMatch accept the input as predicate and return boolean
        boolean noneMatch = users.stream().noneMatch(item -> item.getName().matches("Salman"));
        System.out.println("none match out put is = " + noneMatch);

        System.out.println("............");

        List<String> collect = users.stream().map(item -> item.getName().toUpperCase()).collect(Collectors.toList());
        List<String> uppercase = users.stream().filter(item -> item.getName().startsWith("A")).
                map(item -> item.getName().toUpperCase()).collect(Collectors.toList());

        List<User> modi = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith("A")) {
                user.setName(user.getName().toUpperCase());
                modi.add(user);
            } else {
                modi.add(user);
            }
        }
        System.out.println(collect);
        System.out.println(uppercase);
        modi.forEach(System.out::println);

        System.out.println("________________________");
        long count = users.stream().map(item -> item.getAge()).count();
        System.out.println("count is " + count);

        //age summing
        Integer summing = users.stream().map(User::getAge).reduce(0, Integer::sum);
        System.out.println("age summing is " + summing);


        boolean anyMatchExample = users.stream().anyMatch(item -> item.getAge() <= 23 && item.getName().equals("Imran"));
        System.out.println("any match example " + anyMatchExample);
        boolean allMatchExample = users.stream().allMatch(item -> item.getAge() <= 23 || item.getName().equals("Aamir"));
        System.out.println("all match example "+ allMatchExample);

    }


}
