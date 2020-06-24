package com.springcore.core;

import com.springcore.core.compute.Compute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculateNumbersImpl {
    @Autowired
    private Compute computeNumber;

// Type 1 Constructor Injection
//    public CalculateNumbersImpl(Compute computeNumber) {
//        this.computeNumber = computeNumber;
//    }

// Type 2 Setter Injection

//    public void setComputeNumber(Compute computeNumber) {
//        this.computeNumber = computeNumber;
//    }

    // Type 3 Even though Constructor and setter are not used then also it is autowired
    public int computeNumbers(int firstNumber , int secondNumber){
//        need to add or multiply or subtract or divide
        int result=computeNumber.compute(firstNumber,secondNumber);
        System.out.println(computeNumber);
        return result;
    }

}
