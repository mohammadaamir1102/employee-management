package com.example.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.MultipleFileUpload;
import com.example.service.MultipleFileUploadService;

@RestController
@RequestMapping("/multiple-file-upload")
public class MultipleFileUploadController {

	/**
	 * @author Mohammad Aamir
	 */
	
	@Autowired
	private MultipleFileUploadService multipleFileUploadService;

	@PostMapping("/filesUpload")
	public String uploadMultipleFile(@RequestParam("files") MultipartFile[] files) {
		String fileName = null;
		String fileContentType = null;
		String sourceFileContent = null;
		ArrayList<MultipleFileUpload> multiFileUploadList = new ArrayList<MultipleFileUpload>();
		try {
			for (MultipartFile multipartFile : files) {
				fileContentType = new String(multipartFile.getBytes(), StandardCharsets.UTF_8);
				fileName = multipartFile.getOriginalFilename();
				sourceFileContent = new String(multipartFile.getBytes(), StandardCharsets.UTF_8);

				MultipleFileUpload multipleFileUpload = new MultipleFileUpload(fileName, sourceFileContent,
						fileContentType);
				multiFileUploadList.add(multipleFileUpload);
			}
			multipleFileUploadService.saveMultipleFile(multiFileUploadList);
			return "File Upload Successfully !!";
		} catch (IOException e) {
			e.printStackTrace();
			return "Error Occured File Uploading Time !!";
		}
	}
}
