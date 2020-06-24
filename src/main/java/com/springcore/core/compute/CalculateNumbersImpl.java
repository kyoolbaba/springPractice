package com.springcore.core.compute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Scope annotation also can be written like (@Scope("prototype"))

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CalculateNumbersImpl {
    @Autowired
    @Qualifier("multiply")
    private Compute multiplication;

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

// Type 1 Constructor Injection
//    public CalculateNumbersImpl(Compute computeNumber) {
//        this.computeNumber = computeNumber;
//    }

// Type 2 Setter Injection

//    public void setComputeNumber(Compute computeNumber) {
//        this.computeNumber = computeNumber;
//    }

//     Type 3 Even though Constructor and setter are not used then also it is autowired

//    Type 4 If you give more than 1 bean an Components you will get an error so while autowiring
//    if you define the instance as class name this type is called autowiring by Name

//    Type 5 There is another annotation called qualifier from we can use to specify the type of dependency
//    to be injected
