package com.employee.controller;

import java.util.List;
import java.util.Optional;

import com.employee.dto.EmployeeManagementContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import com.employee.dto.EmployeeManagementDTO;
import com.employee.dto.FindByFirstNameAndLastNameDTO;
import com.employee.entity.EmployeeManagement;
import com.employee.service.EmployeeManagementService;

import javax.validation.Valid;

@RestController
@PropertySource("classpath:custom.properties")
@RequestMapping("/employeeManagement")
public class EmployeeManagementController {

    @Autowired
    private EmployeeManagementService employeeManagementService;

    @Value("${developer-name}")
    private String developerName;

    @Value("${custom-properties}")
    private String customProperties;

    @PostMapping("/save")
    public EmployeeManagement saveEmployeeManagement(@RequestBody @Valid EmployeeManagement employeeManagement) {
        employeeManagement.getId();
        employeeManagement.getAddress();
        return employeeManagementService.saveEmployeeManagement(employeeManagement);

    }

    // return DTO not Entity
    @GetMapping("/findAllEmployee")
    public List<EmployeeManagementDTO> findAllEmployee() {
        System.out.println("developer name is "+ developerName);
        System.out.println("custom "+customProperties);
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

    @PostMapping("/getEmployeeByContactAndActivity")
    public Optional<EmployeeManagement> getEmployeeBasedOnContact(@RequestBody EmployeeManagementContactDTO employeeManagementContactDTO){
            return employeeManagementService.getEmployeeBasedOnContact(employeeManagementContactDTO);
    }

}
