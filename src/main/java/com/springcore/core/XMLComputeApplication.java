package com.springcore.core;

import com.springcore.core.xml_Compute.XMLSetter_CalculateNumbersImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class XMLComputeApplication {
    Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    ClassPathXmlApplicationContext applicationContext=new
            ClassPathXmlApplicationContext("applicationContext.xml");
    public static void main(String[] args) {
        XMLComputeApplication xmlComputeApplication= new XMLComputeApplication();
        xmlComputeApplication.setterMethod();
    }

    public void setterMethod(){

        System.out.println("Adding Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForAddition=applicationContext.
                getBean("addNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForAddition.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForAddition);

        System.out.println("Subtracting Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForSubtraction=applicationContext.
                getBean("subtractNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForSubtraction.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForSubtraction);

        System.out.println("Multiplying Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForMultiplication=applicationContext.
                getBean("multiplyNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForMultiplication.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForMultiplication);

        System.out.println("Dividing Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForDivision=applicationContext.
                getBean("divideNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForDivision.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForDivision);
    }

}
