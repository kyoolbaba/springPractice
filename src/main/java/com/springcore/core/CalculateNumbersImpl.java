package com.springcore.core;

import com.springcore.core.compute.Addition;
import com.springcore.core.compute.Compute;

public class CalculateNumbersImpl {
    private Compute computeNumber;

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
