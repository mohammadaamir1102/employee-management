package com.example.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.entity.FileUploadDB;

public interface FileStorageService {
	
	 FileUploadDB store(MultipartFile file) throws IOException;

}
