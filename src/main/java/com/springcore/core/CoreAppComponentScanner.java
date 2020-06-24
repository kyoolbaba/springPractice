package com.springcore.core;

import com.springcore.components.ComponentDAO;
import com.springcore.core.compute.CalculateNumbersImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springcore.components")
public class CoreAppComponentScanner {

    private static Logger LOGGER= LoggerFactory.getLogger(CoreApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CoreApplication.class, args);
        ComponentDAO componenetDao= applicationContext.getBean(ComponentDAO.class);
        LOGGER.info("{}",componenetDao);

    }

}
