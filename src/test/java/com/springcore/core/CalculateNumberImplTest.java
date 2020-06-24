package com.springcore.core;

import com.springcore.core.compute.CalculateNumbersImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CoreApplication.class)
public class CalculateNumberImplTest {

    @Autowired
    CalculateNumbersImpl calculateNumbers;

    @Test
    public void givenTwoNumber_whenComputed_ShouldReturnResult() {
    Assert.assertEquals(16, calculateNumbers.computeNumbers(2,8));
    }
}
