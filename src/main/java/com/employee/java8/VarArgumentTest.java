package com.employee.java8;

import org.springframework.util.CollectionUtils;

import java.util.*;

public class VarArgumentTest {

    public static void main(String[] args) {

        Optional<String> outOneArgument = findOutOneArgument("Aamir Khan", "Salman Khan", "Imran Khan");
        System.out.println(outOneArgument);

    }

    public static Optional<String> findOutOneArgument(String ... name){
        Optional<String> result = Optional.empty();
        if(!CollectionUtils.isEmpty(Arrays.asList(name))){
            for(String n : name){
                if(n.equals("Imran Khan")){
                    System.out.println("Imran is exist !");
                }
            }
            result =  Arrays.stream(name).filter(Objects::nonNull).findFirst();
        }
        return result;
    }
}
