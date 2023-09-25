package com.employee.java8.switchlambda;

public class SwitchExpression {
    public static void main(String[] args) {
        String day = "Wednesday";
        String result = "";
        int currentDay = 0;
        switch (day) {
            case "Sunday" -> result = day;
            case "Monday" -> result = day;
            case "Tuesday" -> result = day;
            case "Wednesday" -> currentDay = 10;
            default -> System.out.println("put valid day");
        }
        System.out.println("The day is " + result);
        System.out.println("The day in digit based on day is " + currentDay);
        System.out.println();

        System.out.println("______________________________________________");
        result = switch (day) {
            case "Sunday" -> day;
            case "Monday" -> day;
            case "Tuesday" -> day;
            case "Wednesday", "Thrusday" -> day;
            default -> "put correct input";
        };
        System.out.println(result);
        System.out.println();

        System.out.println("______________________________________________");
        result = switch (day) {
            case "Sunday":
                yield day;
            case "Monday":
                yield day;
            case "Tuesday":
                yield day;
            case "Wednesday", "Thrusday":
                yield day;
            default:
                yield "put correct input";
        };
        System.out.println(result);
    }
}
