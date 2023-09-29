package com.employee.interview;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInter {
    public static void main(String[] args) {
        List<String> obj = new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D");
        System.out.println(obj);
    }
}
/*
a) [A, B, C, D]
b) [A, D, B, C]
c) [A, D, C]
d) [A, B, C]
*/