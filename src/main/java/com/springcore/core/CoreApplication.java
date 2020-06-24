package com.springcore.core;


import com.springcore.core.compute.Subtraction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        CalculateNumbersImpl calculateNumbers=new CalculateNumbersImpl(new Subtraction());
        int result=calculateNumbers.computeNumbers(2,3);
        System.out.println(result+" is the value");
//        SpringApplication.run(CoreApplication.class, args);
    }

}
