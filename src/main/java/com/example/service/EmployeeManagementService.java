package com.example.service;

import java.util.List;

import com.example.dto.EmployeManagementDTO;
import com.example.entity.EmployeeManagement;

public interface EmployeeManagementService {
	
	EmployeeManagement saveEmployeeManagement(EmployeeManagement employeeManagement);
	List<EmployeManagementDTO> findAllEmployee();
	List<EmployeManagementDTO> getIdEmployee(EmployeManagementDTO employeManagementDTO); 
	EmployeManagementDTO findEmployeManagementById(Long id);
	List<EmployeeManagement> findAllEmployee1();
		
	

}
