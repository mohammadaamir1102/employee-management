package com.employee.java8.switchlambda;

import java.util.Arrays;
import java.util.List;


class SalaryEmployee{
    String name;
    double salary;
    String department;

    public SalaryEmployee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
public class IncreaseSalaryUsingSwitchArrowByDepartment {
    public static void main(String[] args) {
        List<SalaryEmployee> salaryEmployees = Arrays.asList(
                new SalaryEmployee("Aamir", 1000, "IT"),
                new SalaryEmployee("Aasim", 1000, "HRD")
        );
        increaseSalary(salaryEmployees);
    }

    private static void increaseSalary(List<SalaryEmployee> salaryEmployees) {

        salaryEmployees.forEach(item -> {
            double increasePercentage = switch (item.getDepartment()) {
                case "IT" -> 0.20;
                case "HRD" -> 0.10;
                default -> 0.0;
            };
            item.setSalary(item.getSalary() + (item.getSalary() * increasePercentage));
        });
        salaryEmployees.forEach(System.out::println);

    }
}
