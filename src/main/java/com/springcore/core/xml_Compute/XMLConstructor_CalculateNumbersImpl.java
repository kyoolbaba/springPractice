package com.springcore.core.xml_Compute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class XMLConstructor_CalculateNumbersImpl {

    private XML_Compute multiplication;

    public XMLConstructor_CalculateNumbersImpl(XML_Compute multiplication) {
        this.multiplication = multiplication;
    }

    public void setMultiplication(XML_Compute multiplication) {
        this.multiplication = multiplication;
    }

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public int computeNumbers(int firstNumber, int secondNumber) {
//        need to add or multiply or subtract or divide
        int result = multiplication.compute(firstNumber, secondNumber);
        System.out.println(multiplication);
        return result;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("Pre Destroy");
    }

}