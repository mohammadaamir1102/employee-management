package com.employee.java8;

import java.util.*;

public class Inter {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("f");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        list2.add("e");
        list2.add("h");
        list2.add("g");
        list2.add("c");

        for(String l1 : list1){

            for(String l2: list2){

                if(l1.equals(l2)){
                    if(!set.contains(l1)){
                        set.add(l1);
                    }

                }

            }
        }

        System.out.println(set);

        long commontCountCharacter = list1.stream().filter(list2::contains).count();
        System.out.println("common elements are :" + commontCountCharacter);
    }
}
