package com.springcore.core.compute;

import org.springframework.stereotype.Component;


public class Subtraction implements Compute {
    public int compute(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}
