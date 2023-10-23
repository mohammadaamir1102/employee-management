package com.employee.java8.interview;

import java.util.Arrays;

public class RangeDataStructure {

    private int[] arr;

    public RangeDataStructure(int size) {
        arr = new int[size];
    }

    public void update(int i, int v) {
        arr[i] = v; //[0,0,6,0,0]
    }

    public int query(int l, int r) {
        return Arrays.stream(arr, l, r + 1).sum(); //[0,6,0] then sum will be 6
    }

    public void set(int l, int r, int v) {
        Arrays.fill(arr, l, r + 1, v); // [0,4,4,4,0]

    }

    public static void main(String[] args) {
        RangeDataStructure dataStructure = new RangeDataStructure(5);

        dataStructure.update(2, 6);

        System.out.println("Query [1, 3]: " + dataStructure.query(1, 3)); // Output: 6

        dataStructure.set(1, 3, 4);

        System.out.println("Query [1, 3] after set: " + dataStructure.query(1, 3)); // Output: 12
    }
}
