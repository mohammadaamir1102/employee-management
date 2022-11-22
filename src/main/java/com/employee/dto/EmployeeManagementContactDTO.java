package com.employee.dto;

public class EmployeeManagementContactDTO {

    private String contact;
    private String isActive;

    public EmployeeManagementContactDTO() {
    }

    public EmployeeManagementContactDTO(String contact, String isActive) {
        this.contact = contact;
        this.isActive = isActive;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "EmployeeManagementContactDTO{" +
                "contact='" + contact + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
