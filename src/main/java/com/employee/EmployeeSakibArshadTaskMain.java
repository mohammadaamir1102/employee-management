package com.employee;

import com.employee.java8.EmployeeSakibArshadTask;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeSakibArshadTaskMain {

    public static void main(String[] args) {
        List<EmployeeSakibArshadTask> employeeData = EmployeeSakibArshadTaskMain.findAllData();
        System.out.println();
        employeeData.forEach(System.out::println);
    }


    public static List<EmployeeSakibArshadTask> findAllData() {
        return Arrays.asList(
                new EmployeeSakibArshadTask(1, "Aamir", LocalDate.of(1999, 2, 11), new BigDecimal("100545")),
                new EmployeeSakibArshadTask(10, "Aasim", LocalDate.of(2001, 7, 26), new BigDecimal("200843")),
                new EmployeeSakibArshadTask(5, "Aaquib", LocalDate.of(1998, 7, 26), new BigDecimal("556765")),
                new EmployeeSakibArshadTask(2, "Irshan", LocalDate.of(1997, 7, 26), new BigDecimal("748937")),
                new EmployeeSakibArshadTask(4, "Salman", LocalDate.of(1996, 7, 26), new BigDecimal("13434.867")),
                new EmployeeSakibArshadTask(3, "Ehtesham", LocalDate.of(1995, 7, 26), new BigDecimal("987647.54")),
                new EmployeeSakibArshadTask(7, "Kamran", LocalDate.of(1994, 7, 26), new BigDecimal("677143")),
                new EmployeeSakibArshadTask(6, "Israr", LocalDate.of(1993, 7, 26), new BigDecimal("234764")),
                new EmployeeSakibArshadTask(9, "Mubeen", LocalDate.of(1992, 7, 26), new BigDecimal("876544")),
                new EmployeeSakibArshadTask(8, "Dawood", LocalDate.of(2000, 7, 26), new BigDecimal("886649"))
        );
    }

}
