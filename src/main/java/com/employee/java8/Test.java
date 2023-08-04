package com.employee.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StudentMark {
    String name;
    int rollNo;
    int mark1;
    int mark2;
    int mark3;

    public StudentMark(String name, int rollNo, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public float calculate() {
        int totalMark = mark1 + mark2 + mark3;
        return totalMark / 3.0f;
    }
}

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        int i = list.indexOf("d");
        System.out.println("index value is "+ i);
        System.out.println(list.get(-1));


        int[] ar1 = {1, 5, 10, 20, 40, 80};
        int[] ar2 = {6, 7, 20, 80, 100};
        int[] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.print("Common elements are ");
        findCommon(ar1, ar2, ar3);

    }

    public static void findCommon(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;

        // Iterate through three arrays while all arrays
        // have elements
        while (i < ar1.length && j < ar2.length
                && k < ar3.length) {
            // If x = y and y = z, print any of them and
            // move ahead in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }

            // x < y
            else if (ar1[i] < ar2[j])
                i++;

                // y < z
            else if (ar2[j] < ar3[k])
                j++;

                // We reach here when x > y and z < y, i.e., z
                // is smallest
            else
                k++;
        }
    }
}
