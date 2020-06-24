package com.springcore.core;


import com.springcore.core.compute.Multiplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CoreApplication.class, args);
        CalculateNumbersImpl calculateNumbers=applicationContext.getBean(CalculateNumbersImpl.class);
        int result=calculateNumbers.computeNumbers(2,3);
        System.out.println(result+" is the value");
    }

}
