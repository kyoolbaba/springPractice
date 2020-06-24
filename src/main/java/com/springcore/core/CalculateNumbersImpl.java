package com.springcore.core;

public class CalculateNumbersImpl {

    public int computeNumbers(int firstNumber ,int secondNumber){
//        need to add or multiply or subtract or divide
        Addition addition= new Addition();
        int result=addition.compute(firstNumber,secondNumber);
        return result;
    }

}
