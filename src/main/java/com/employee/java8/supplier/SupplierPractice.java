package com.employee.java8.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierPractice  {
   /* @Override
    public String get() {
        return "Hi Aamir khan";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierPractice();
        System.out.println(supplier.get());

    }*/
   public static void main(String[] args) {
      /* Supplier<String> supplier = ()-> {
           return "Hi Aamir khan";
       };

       System.out.println(supplier.get());*/
       List<String> letters = Arrays.asList("a","b");
       String value = letters.stream().findAny().orElseGet(() -> "Empty Data");
       System.out.println(value);
   }
}
