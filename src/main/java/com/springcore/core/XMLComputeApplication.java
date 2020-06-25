package com.springcore.core;

import com.springcore.core.xml_Compute.XMLConstructor_CalculateNumbersImpl;
import com.springcore.core.xml_Compute.XMLSetter_CalculateNumbersImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLComputeApplication {
    Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    ClassPathXmlApplicationContext applicationContext=new
            ClassPathXmlApplicationContext("applicationContext.xml");
    public static void main(String[] args) {
        XMLComputeApplication xmlComputeApplication= new XMLComputeApplication();
        xmlComputeApplication.setterMethodInjection();
        xmlComputeApplication.constructorDependencyInjection();
    }

    public void setterMethodInjection(){

        System.out.println("Adding Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForAddition=applicationContext.
                getBean("(SetterMethod)addNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForAddition.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForAddition);

        System.out.println("Subtracting Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForSubtraction=applicationContext.
                getBean("(SetterMethod)subtractNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForSubtraction.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForSubtraction);

        System.out.println("Multiplying Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForMultiplication=applicationContext.
                getBean("(SetterMethod)multiplyNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForMultiplication.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForMultiplication);

        System.out.println("Dividing Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForDivision=applicationContext.
                getBean("(SetterMethod)divideNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForDivision.computeNumbers(100,20));
        LOGGER.info("{}",setterMethodForDivision);
    }

    public void constructorDependencyInjection(){
        System.out.println("Constructor dependency injection");
        XMLConstructor_CalculateNumbersImpl constructorForAddition=
                applicationContext.getBean("(Constructor)addNumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForAddition.computeNumbers(10,50));
        LOGGER.info("{}",constructorForAddition);

        XMLConstructor_CalculateNumbersImpl constructorForSubtraction=
                applicationContext.getBean("(Constructor)SubtractNumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForSubtraction.computeNumbers(10,50));
        LOGGER.info("{}",constructorForSubtraction);

        XMLConstructor_CalculateNumbersImpl constructorForMultiplication=
                applicationContext.getBean("(Constructor)multiplynumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForMultiplication.computeNumbers(10,50));
        LOGGER.info("{}",constructorForMultiplication);

        XMLConstructor_CalculateNumbersImpl constructorForDivision=
                applicationContext.getBean("(Constructor)divideNumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForDivision.computeNumbers(100,50));
        LOGGER.info("{}",constructorForDivision);
    }



}
