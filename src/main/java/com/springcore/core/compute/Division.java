package com.springcore.core.compute;

import org.springframework.stereotype.Component;


public class Division implements Compute {
    public int compute(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}
