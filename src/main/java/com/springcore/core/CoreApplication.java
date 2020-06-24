package com.springcore.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        CalculateNumbersImpl calculateNumbers=new CalculateNumbersImpl();
        int result=calculateNumbers.computeNumbers(2,3);
        System.out.println(result+" is the value");
        SpringApplication.run(CoreApplication.class, args);
    }

}
