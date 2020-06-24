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
        CalculateNumbersImpl calculateNumbers1=applicationContext.getBean(CalculateNumbersImpl.class);
//        this kind of bean is called singleton bean
//        When requested prototype bean new instance of bean is given
        System.out.println(calculateNumbers);
        System.out.println(calculateNumbers1);

        int result=calculateNumbers.computeNumbers(2,3);
        System.out.println(result+" is the value");
    }

}
