package com.springcore.core;

import com.springcore.core.compute.CalculateNumbersImpl;
import com.springcore.core.user.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CoreApplication {

    private static Logger LOGGER= LoggerFactory.getLogger(CoreApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreApplication.class);
        CalculateNumbersImpl calculateNumbers=applicationContext.getBean(CalculateNumbersImpl.class);
        UserDAO userDAO= applicationContext.getBean(UserDAO.class);
        UserDAO userDAO1=applicationContext.getBean(UserDAO.class);
        LOGGER.info("{}",userDAO);
        LOGGER.info("{}",userDAO.getJdbcConnection());
        LOGGER.info("{}",userDAO.getJdbcConnection());
        LOGGER.info("{}",userDAO1);
        LOGGER.info("{}",userDAO1.getJdbcConnection());

    }

}
