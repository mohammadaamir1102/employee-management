package com.example.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.FileUploadDB;
import com.example.repsitory.FileUploadDBRepository;
import com.example.service.FileStorageService;

@Service
public class FileStorageServiceImpl implements FileStorageService {

	@Autowired
	private FileUploadDBRepository fileUploadDBRepository;

	@Override
	public FileUploadDB store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileUploadDB fileUploadDB = new FileUploadDB(file.getContentType(), file.getBytes(), fileName);
		return fileUploadDBRepository.save(fileUploadDB);
	}

}
