package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.dto.EmployeeManagementDTO;
import com.example.dto.FindByFirstNameAndLastNameDTO;
import com.example.entity.EmployeeManagement;
import com.example.service.EmployeeManagementService;

import javax.validation.Valid;

@RestController
@RequestMapping("/employeeManagement")
public class EmployeeManagementController {

    @Autowired
    private EmployeeManagementService employeeManagementService;

    @PostMapping("/save")
    public EmployeeManagement saveEmployeeManagement(@RequestBody @Valid EmployeeManagement employeeManagement) {
        employeeManagement.getId();
        employeeManagement.getAddress();
        return employeeManagementService.saveEmployeeManagement(employeeManagement);

    }

    // return DTO not Entity
    @GetMapping("/findAllEmployee")
    public List<EmployeeManagementDTO> findAllEmployee() {
        return employeeManagementService.findAllEmployee();

    }

    // return entity not DTO
    // notes (Return ENTITY is not a good way)
    @GetMapping("/findAllEmployee1")
    public List<EmployeeManagement> findAllEmpoEmployeeManagements() {
        return employeeManagementService.findAllEmployee1();
    }

    @PutMapping("/update")
    List<EmployeeManagementDTO> getIdEmployee(EmployeeManagementDTO employeManagementDTO) {
        return employeeManagementService.getIdEmployee(employeManagementDTO);

    }

    @GetMapping("/findEmployee/{id}")
    public EmployeeManagementDTO findEmployeManagementById(@PathVariable Long id) {
        return employeeManagementService.findEmployeManagementById(id);
    }

    @PostMapping("/findByFirstNameAndLastName")
    public List<EmployeeManagement> findByFirstNameAndLastName(
            @RequestBody FindByFirstNameAndLastNameDTO findByFirstNameAndLastNameDTO) {
        return employeeManagementService.findByFirstNameAndLastName(findByFirstNameAndLastNameDTO.getFirstName(),
                findByFirstNameAndLastNameDTO.getLastName());
    }

    @PostMapping("/findByIdIn")
    public List<EmployeeManagement> findByIdIn(@RequestBody List<Long> findByIdInDTOs) {
        return employeeManagementService.findByIdIn(findByIdInDTOs);
    }

    @DeleteMapping("/deleteUserPermanently/{id}")
    public String deleteUserPermanently(@PathVariable Long id) throws Exception {
        return employeeManagementService.deleteUserPermanently(id);
    }

    @DeleteMapping("/inActiveUser/{id}")
    public String inActiveUser(@PathVariable Long id) throws Exception {
        return employeeManagementService.inActiveUser(id);
    }

}
