package com.employee.java11.record;

import com.employee.java8.Employee;

import java.util.List;

public class EmployeeOperations {

    public static void main(String[] args) {
        List<Employee> listEmployee = EmployeeMain.findListEmployee();
        List<EmployeeRecord> list = listEmployee.stream()
                .map(item -> new EmployeeRecord(item.getId(), item.getName(), item.getSalary())).toList();
        System.out.println(list);
    }
}
