package com.employee.controller;

import com.employee.entity.User;
import com.employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRestTemplate")
public class UserRestTemplateCallingController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getUser() {
        return userService.getUser();
    }
}
