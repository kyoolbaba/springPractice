package com.springcore.core.compute;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("add")
public class Addition implements Compute {
    public int compute(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}
