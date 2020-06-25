package com.springcore.core;

import com.springcore.core.xmluser.XmlUserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLContextApplication {

public static Logger LOGGER= LoggerFactory.getLogger(XMLContextApplication.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext= new
                ClassPathXmlApplicationContext("applicationContext.xml");
        XmlUserDAO userDAO=applicationContext.getBean(XmlUserDAO.class);
        LOGGER.info("{} {}",userDAO,userDAO.getXmljdbcConnection());
        LOGGER.info("Beans Loaded ->{}",(Object)applicationContext.getBeanDefinitionNames());

    }

}
