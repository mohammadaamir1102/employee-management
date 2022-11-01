package com.employee.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.FileUploadDB;

@Repository
public interface FileUploadDBRepository extends JpaRepository<FileUploadDB, Long> {

}
