package com.employee.java8.switchlambda;

public class SwitchArrowKey {
    /*
     *  1- From Java 12 we do not need to break keyword in switch
     *  2- If you use arrow then do not need to use colon(:) in switch
     *  3- We can use switch as an expression
     * */

    public static void main(String[] args) {
        String day = "Sunday";

        switch (day) {
            case "Sunday" -> System.out.println(day);
            case "Monday" -> System.out.println(day);
            case "Tuesday" -> System.out.println(day);
            case "Wednesday" -> System.out.println(day);
            default -> System.out.println("put valid day");
        }
    }
}
