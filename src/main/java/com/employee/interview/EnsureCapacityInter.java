package com.employee.interview;

import java.util.ArrayList;

public class EnsureCapacityInter {
    public static void main(String[] args) {
        {
            ArrayList obj = new ArrayList();
            obj.add("A");
            obj.ensureCapacity(3);
            System.out.println(obj.size());
        }
    }
}
/*
a) 1 (CA)
b) 2
c) 3
d) 4
*/