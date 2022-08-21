package com.example.repsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeeManagement;
@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement,Long>{

	Optional<EmployeeManagement> findByIdAndIsActive(Long id, String isActive);
}
