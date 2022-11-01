package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.MultipleFileUpload;
import com.employee.repsitory.MultipleFileUploadRepo;
import com.employee.service.MultipleFileUploadService;

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
