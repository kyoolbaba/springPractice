package com.springcore.core;

import com.springcore.core.compute.Compute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CalculateNumbersImpl {
    @Autowired
    @Qualifier("multiply")
    private Compute multiplication;

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

    public int computeNumbers(int firstNumber , int secondNumber){
//        need to add or multiply or subtract or divide
        int result=multiplication.compute(firstNumber,secondNumber);
        System.out.println(multiplication);
        return result;
    }

}
