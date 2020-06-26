package com.springcore.core.xml_Compute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class XMLSetter_CalculateNumbersImpl {

    private XML_Compute division;

    public void setDivision(XML_Compute division) {
        this.division = division;
    }

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public int computeNumbers(int firstNumber, int secondNumber) {
//        need to add or multiply or subtract or divide
        int result = division.compute(firstNumber, secondNumber);
        System.out.println(division);
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