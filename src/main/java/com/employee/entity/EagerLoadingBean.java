package com.employee.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EagerLoadingBean {

    //when I use @Component annotation then automatically spring ioc container create the object
    EagerLoadingBean(){
        System.out.println("This is eager loading bean or object Created !");
    }
}
