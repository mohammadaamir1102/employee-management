package com.example.mapper;

import org.springframework.stereotype.Service;

import com.example.dto.EmployeeManagementDTO;
import com.example.entity.EmployeeManagement;

@Service
public class EmployeeManagementMapper {

	public EmployeeManagementDTO employeeManagementToEmpployeeManagementDto(EmployeeManagement employeeManagement) {
		if (employeeManagement == null) {
			return null;
		} else {
			EmployeeManagementDTO employeeManagementDTO = new EmployeeManagementDTO();
			employeeManagementDTO.setId(employeeManagement.getId());
			employeeManagementDTO.setFirstName(employeeManagement.getFirstName());
			employeeManagementDTO.setLastName(employeeManagement.getLastName());
			employeeManagementDTO.setEmail(employeeManagement.getEmail());
			employeeManagementDTO.setContact(employeeManagement.getContact());
			employeeManagementDTO.setCity(employeeManagement.getCity());
			employeeManagementDTO.setAddress(employeeManagement.getAddress());
			employeeManagementDTO.setIsActive(employeeManagement.getIsActive());
			return employeeManagementDTO;
		}

	}
}
