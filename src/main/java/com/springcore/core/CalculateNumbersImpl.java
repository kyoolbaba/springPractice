package com.springcore.core;

import com.springcore.core.compute.Compute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculateNumbersImpl {
    @Autowired
    private Compute computeNumber;
    @Autowired
    public CalculateNumbersImpl(Compute computeNumber) {
        this.computeNumber = computeNumber;
    }

    public int computeNumbers(int firstNumber , int secondNumber){
//        need to add or multiply or subtract or divide
        int result=computeNumber.compute(firstNumber,secondNumber);
        System.out.println(computeNumber);
        return result;
    }

}
