package com.employee.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.employee.entity.FileUploadDB;

public interface FileStorageService {
	
	 FileUploadDB store(MultipartFile file) throws IOException;

}
