package com.employee.java8;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class EmployeeSakibArshadTask {

    private int id;
    private String name;
    private int age;
    private LocalDate dob;

    private BigDecimal salary;

    public EmployeeSakibArshadTask() {
    }

    public EmployeeSakibArshadTask(int id, String name, LocalDate dob, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = calculateAge(dob);
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        this.age = calculateAge(dob);
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    private int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    @Override
    public String toString() {
        return "EmployeeSakibArshadTask{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", salary=" + salary +
                '}';
    }
}

