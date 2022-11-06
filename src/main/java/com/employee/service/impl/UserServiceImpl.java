package com.employee.service.impl;

import com.employee.entity.User;
import com.employee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    final String URL = "https://jsonplaceholder.typicode.com/users";
    //Above URL Copy from https://jsonplaceholder.typicode.com/ this website it is dummy url

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getUser() {
        System.out.println("url is =" + URL);
        List<User> users = null;
        try {
            User[] userResponse = restTemplate.getForObject(URL, User[].class);
            users = Arrays.asList(userResponse);
        } catch (RestClientException | NullPointerException ex) {
            ex.printStackTrace();
        }
        return users;
    }
}
