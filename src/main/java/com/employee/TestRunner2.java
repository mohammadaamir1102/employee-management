package com.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class TestRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
     /*   List<String> list = new ArrayList<>();
        if(CollectionUtils.isEmpty(list)){
            System.out.println("if block");
        }*/
    }
}
