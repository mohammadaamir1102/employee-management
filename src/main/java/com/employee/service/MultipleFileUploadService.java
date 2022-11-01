package com.employee.service;

import java.util.List;

import com.employee.entity.MultipleFileUpload;

public interface MultipleFileUploadService {
	void saveMultipleFile(List<MultipleFileUpload> multipleFileUploads);
}
