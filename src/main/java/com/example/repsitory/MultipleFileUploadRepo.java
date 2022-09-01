package com.example.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MultipleFileUpload;

@Repository
public interface MultipleFileUploadRepo extends JpaRepository<MultipleFileUpload, Long> {

}
