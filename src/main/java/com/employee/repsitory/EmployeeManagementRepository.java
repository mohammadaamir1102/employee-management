package com.employee.repsitory;

import com.employee.entity.EmployeeManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement, Long>, JpaSpecificationExecutor<EmployeeManagement> {

    Optional<EmployeeManagement> findByIdAndIsActive(Long id, String isActive);

    List<EmployeeManagement> findByFirstNameAndLastName(String firstName, String lastName);

    List<EmployeeManagement> findByIdIn(List<Long> ids);

    Optional<EmployeeManagement> findByContactAndIsActive(String contact, String isActive);

}
