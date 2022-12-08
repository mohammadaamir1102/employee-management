package com.employee.controller;

import com.employee.entity.Developer;
import com.employee.entity.MindCraftCompany;
import com.employee.service.MindCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/getDeveloper/{companyId}")
    public Optional<MindCraftCompany> getDeveloper(@PathVariable Long companyId) throws Exception {
        return mindCraftService.getDeveloper(companyId);
    }
}
