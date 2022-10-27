package com.example.service;

import java.util.List;

import com.example.dto.EmployeeManagementDTO;
import com.example.entity.EmployeeManagement;

public interface EmployeeManagementService {

    EmployeeManagement saveEmployeeManagement(EmployeeManagement employeeManagement);

    List<EmployeeManagementDTO> findAllEmployee();

    List<EmployeeManagementDTO> getIdEmployee(EmployeeManagementDTO employeManagementDTO);

    EmployeeManagementDTO findEmployeManagementById(Long id);

    List<EmployeeManagement> findAllEmployee1();

    List<EmployeeManagement> findByFirstNameAndLastName(String firstNameString, String lastName);

    List<EmployeeManagement> findByIdIn(List<Long> findByIdInDTOs);

    String deleteUserPermanently(Long id) throws Exception;

    String inActiveUser(Long id) throws Exception;
}
