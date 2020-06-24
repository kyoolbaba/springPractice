package com.springcore.core.compute;

import org.springframework.stereotype.Component;

@Component
public class Addition implements Compute {
    public int compute(int firstNumber, int secondNumber) {

        return firstNumber+secondNumber;
    }
}
