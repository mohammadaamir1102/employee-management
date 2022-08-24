package com.example.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.FileUploadDB;

@Repository
public interface FileUploadDBRepository extends JpaRepository<FileUploadDB, Long> {

}
