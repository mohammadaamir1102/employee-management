package com.employee.java8.interview;

public class EmployeeBean {

    private String srno;
    private String name;
    private String gender;
    private String score;
    private String locateion;
    private String departmentId;

    public EmployeeBean(){

    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "srno='" + srno + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score='" + score + '\'' +
                ", locateion='" + locateion + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    public String getSrno() {
        return srno;
    }

    public void setSrno(String srno) {
        this.srno = srno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getLocateion() {
        return locateion;
    }

    public void setLocateion(String locateion) {
        this.locateion = locateion;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
