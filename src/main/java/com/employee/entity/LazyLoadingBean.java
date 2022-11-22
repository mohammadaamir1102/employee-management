package com.employee.entity;

import org.springframework.stereotype.Component;

@Component
public class LazyLoadingBean {

    LazyLoadingBean(){
        System.out.println("This is lazy loading bean or object Created !");
    }
}
