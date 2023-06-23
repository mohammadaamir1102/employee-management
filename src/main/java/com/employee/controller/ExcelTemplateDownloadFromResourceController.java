package com.employee.controller;

import com.employee.dto.PhaseVo;
import com.employee.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/excel-template")
public class ExcelTemplateDownloadFromResourceController {


    @Autowired
    private EmployeeManagementService employeeManagementService;

    @PostMapping("/downloadTemplate")
    public ResponseEntity<Resource> downloadTemplate(@RequestBody PhaseVo phaseVo) {

        try {
            InputStreamResource stream = null;
            if (!StringUtils.hasText(phaseVo.getPhase())) {
                throw new RuntimeException("Phase can't be empty");
            }
            stream = employeeManagementService.getExcelTemplate(phaseVo);
            if (phaseVo.getPhase().equalsIgnoreCase("aamirKhan")) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; " + "filename=Aamir_Khan_Template.xlsx")
                        .contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(stream);
            } else {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; " + "filename=Salman_khan_Template.xlsx")
                        .contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(stream);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
