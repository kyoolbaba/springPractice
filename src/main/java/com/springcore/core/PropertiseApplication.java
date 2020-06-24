package com.springcore.core;

import com.springcore.components.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springcore.core")
// Load external properties
@PropertySource("classpath:app.properties")
public class PropertiseApplication {

    private static Logger LOGGER= LoggerFactory.getLogger(PropertiseApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiseApplication.class);
        ReadExternalProperties read=applicationContext.getBean(ReadExternalProperties.class);
        System.out.println(read);
        System.out.println(read.getUrl());
    }

}
