package com.employee.java8.predicate;

import java.util.function.Predicate;

public class PredicatePractice implements Predicate<Integer> {

    @Override
    public boolean test(Integer value) {
        if(value % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicatePractice();
        System.out.println(predicate.test(2 ));

    }


}
