package com.example.service;

import java.util.List;

import com.example.entity.MultipleFileUpload;

public interface MultipleFileUploadService {
	void saveMultipleFile(List<MultipleFileUpload> multipleFileUploads);
}
