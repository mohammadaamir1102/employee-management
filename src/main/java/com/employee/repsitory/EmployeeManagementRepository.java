package com.employee.repsitory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeManagement;
@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement,Long>{

	Optional<EmployeeManagement> findByIdAndIsActive(Long id, String isActive);
	List<EmployeeManagement> findByFirstNameAndLastName(String firstName, String lastName);
	List<EmployeeManagement> findByIdIn(List<Long> ids);
}
