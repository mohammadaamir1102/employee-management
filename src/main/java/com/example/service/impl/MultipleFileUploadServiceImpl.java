package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.MultipleFileUpload;
import com.example.repsitory.MultipleFileUploadRepo;
import com.example.service.MultipleFileUploadService;

@Service
public class MultipleFileUploadServiceImpl implements MultipleFileUploadService {

	@Autowired
	private MultipleFileUploadRepo multipleFileUploadRepo;

	@Override
	public void saveMultipleFile(List<MultipleFileUpload> multipleFileUploads) {
		for (MultipleFileUpload multipleFileUpload : multipleFileUploads) {
			multipleFileUploadRepo.save(multipleFileUpload);
		}

	}

}
