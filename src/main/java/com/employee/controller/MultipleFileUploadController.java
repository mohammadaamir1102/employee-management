package com.employee.controller;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.employee.entity.MultipleFileUpload;
import com.employee.service.MultipleFileUploadService;

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

                MultipleFileUpload multipleFileUpload = new MultipleFileUpload(fileName, sourceFileContent, fileContentType);
                multiFileUploadList.add(multipleFileUpload);
            }


//            Arrays.stream(files).forEach(file -> {
//                try {
//                    MultipleFileUpload multipleFileUpload = new MultipleFileUpload();
//                    multipleFileUpload.setFileName(file.getOriginalFilename());
//
//                    multipleFileUpload.setContent(new String(file.getBytes()));
//                    multipleFileUpload.setFileType(new String(file.getBytes()));
//
//                    multiFileUploadList.add(multipleFileUpload);
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//
//            });
            multipleFileUploadService.saveMultipleFile(multiFileUploadList);
            return "File Upload Successfully !!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error Occured File Uploading Time !!";
        }
    }
}
