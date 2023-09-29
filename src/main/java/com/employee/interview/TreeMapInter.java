package com.employee.interview;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapInter {
    public static void main(String[] args) {
        Map<Integer, Object> sampleMap = new TreeMap<>();
        sampleMap.put(1, null);
        sampleMap.put(5, null);
        sampleMap.put(3, null);
        sampleMap.put(2, null);
        sampleMap.put(4, null);

        Collections.synchronizedMap(sampleMap);
        System.out.println(sampleMap);
    }
}
/*
a) {1=null, 2=null, 3=null, 4=null, 5=null} (CA)
b) {5=null}
c) Exception is thrown
d) {1=null, 5=null, 3=null, 2=null, 4=null}
*/