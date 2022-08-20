package com.example.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeeManagement;
@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement,Long>{

}
