package com.employee.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class JavaEightDate {

    public static void main(String[] args) {
        // get current date and time
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println(currentDateAndTime);
        System.out.println("___________________");

        // get current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println("___________________");

        // extract date properties
        Month mnt = currentDateAndTime.getMonth();
        System.out.println("Month: "+mnt.getValue());

        int dayOfMonth = currentDateAndTime.getDayOfMonth();
        System.out.println("Day of the month: "+dayOfMonth);

        int year = currentDateAndTime.getYear();
        System.out.println("Year: "+year);

        System.out.println();
        System.out.println("______________________");

        // extract time properties
        int hour = currentDateAndTime.getHour();
        System.out.println("current hour: "+hour);
        int minutes = currentDateAndTime.getMinute();
        System.out.println("current minutes: "+minutes);
        int seconds = currentDateAndTime.getSecond();
        System.out.println("current seconds: "+seconds);

        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println("current date time with zone: "+zoneDateTime);

    }
}
