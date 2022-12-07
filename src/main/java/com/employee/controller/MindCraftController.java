package com.employee.controller;

import com.employee.entity.Developer;
import com.employee.entity.MindCraftCompany;
import com.employee.service.MindCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mindCraft")
public class MindCraftController {

    @Autowired
    private MindCraftService mindCraftService;

    @PostMapping("/saveMindCraft")
    public MindCraftCompany saveDeveloper(@RequestBody MindCraftCompany mindCraftCompany) {
        System.out.println("mindCraft " + mindCraftCompany);
        return mindCraftService.saveDeveloper(mindCraftCompany);
    }
}
