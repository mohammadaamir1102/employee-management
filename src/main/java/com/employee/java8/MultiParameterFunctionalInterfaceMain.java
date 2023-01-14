package com.employee.java8;

interface MultiParameterFunctionalInterface {
    int sum(int a, int b);
}

public class MultiParameterFunctionalInterfaceMain {

    public static void main(String[] args) {
        MultiParameterFunctionalInterface multiParameterFunctionalInterface = (a,b)-> {
            if (b > a){
                throw new RuntimeException("b should not greater than or equal to a");
            }
            return a + b;
        };
        System.out.println(multiParameterFunctionalInterface.sum(10, 99));
    }
}
