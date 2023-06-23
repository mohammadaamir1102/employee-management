package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.dto.EmployeeManagementContactDTO;
import com.employee.dto.EmployeeManagementDTO;
import com.employee.dto.PhaseVo;
import com.employee.entity.EmployeeManagement;
import org.springframework.core.io.InputStreamResource;

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

    Optional<EmployeeManagement> getEmployeeBasedOnContact(EmployeeManagementContactDTO employeeManagementContactDTO);

    List<EmployeeManagement> dynamicSearchWithMultipleFields(String searchKey);

    InputStreamResource getExcelTemplate(PhaseVo phaseVo);
}
