package com.employee.java8;

public class StudentCrud {
    private int id;
    private String name;

    public StudentCrud(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public StudentCrud() {
        super();

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

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}
