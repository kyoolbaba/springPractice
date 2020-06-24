package com.springcore.core;

import com.springcore.components.ComponentDAO;
import com.springcore.core.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoreCDIApplication {

    private static Logger LOGGER= LoggerFactory.getLogger(CoreCDIApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CoreCDIApplication.class, args);
        CdiBusiness cdiBusiness= applicationContext.getBean(CdiBusiness.class);
        LOGGER.info("{} dao-{}",cdiBusiness,cdiBusiness.getCdiDao());

    }
}
