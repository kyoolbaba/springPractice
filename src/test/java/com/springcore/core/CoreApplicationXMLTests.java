package com.springcore.core;

import com.springcore.core.xml_Compute.XMLSetter_CalculateNumbersImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CoreApplicationXMLTests {

    Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    ClassPathXmlApplicationContext applicationContext=new
            ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    @Test
    public void givenSetterInjection_whenInjected_ShouldReturnAddingFeature() {
        XMLSetter_CalculateNumbersImpl setterMethodForAddition=applicationContext.
                getBean("addNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForAddition.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForAddition);
    }

}
