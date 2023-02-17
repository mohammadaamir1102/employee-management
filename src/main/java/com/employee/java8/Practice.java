package com.employee.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<String> listOfPhones = new ArrayList<String>(Arrays.asList(
                "iPhone 6S", "iPhone 6", "iPhone 5", "Samsung Galaxy 4",
                "Lumia Nokia"));
        for (Iterator<String> itr = listOfPhones.iterator();
             itr.hasNext(); ) {
            String phone = itr.next();
            if (phone.equals("iPhone")) {
                itr.remove(); // right call
            }
        }
        System.out.println(listOfPhones);
    }

}
