package com.springcore.core;


import com.springcore.core.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.core.cdi")
public class CoreCDIApplication {

    private static Logger LOGGER= LoggerFactory.getLogger(CoreCDIApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreCDIApplication.class);
        CdiBusiness cdiBusiness= applicationContext.getBean(CdiBusiness.class);
        LOGGER.info("{} dao-{}",cdiBusiness,cdiBusiness.getCdiDao());

    }
}
