package com.springcore.core;

import com.springcore.components.ComponentDAO;
import com.springcore.core.compute.CalculateNumbersImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.components")
public class CoreAppComponentScanner {

    private static Logger LOGGER= LoggerFactory.getLogger(CoreAppComponentScanner.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreAppComponentScanner.class);
        ComponentDAO componenetDao= applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}",componenetDao);

    }

}
