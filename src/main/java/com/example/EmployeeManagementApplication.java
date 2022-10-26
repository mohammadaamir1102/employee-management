package com.example;

import com.example.entity.EmployeeManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
        List<EmployeeManagement> employeeManagements = gettingListData();
        employeeManagements.forEach(System.err::println);
    }

    private static List<EmployeeManagement> gettingListData() {
        List<EmployeeManagement> employeeManagements = List.of(new EmployeeManagement(1L, "mohammad", "aamir", "khanaamir1102@gmail.com", "bast", "basti", "34534" ,null));
        if (!CollectionUtils.isEmpty(employeeManagements)){
            System.out.println("inside the if block !!");
            return employeeManagements;
        }
        return null;
    }

}
