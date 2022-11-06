package com.employee;

import com.employee.entity.EmployeeManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
