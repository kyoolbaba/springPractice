package com.springcore.core.compute;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("divide")
public class Division implements Compute {
    public int compute(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}
