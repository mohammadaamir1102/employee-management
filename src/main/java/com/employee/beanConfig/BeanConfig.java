package com.employee.beanConfig;

import com.employee.entity.BeanClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    /*
    @Configuration & @Bean :- When I want to use java base configuration. it means we don't want handle the
    spring bean life cycle either using annotations or XML.
    Both annotation indicates the class can be used by IOC container as a source of bean definitions.
    */

    /*
    here we can get the object of BeanClass from This class by xml or @ComponentScan
    */

    /*
    here we start our application then spring ioc search both @Configuration & @Bean annotations
    then spring ioc create the bean of BeanClass and will maintain the life-cycle itself.
    * */
    @Bean
    public BeanClass beanClass(){
        return new BeanClass();
    }
}
