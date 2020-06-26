package com.springcore.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDAO {

    Employee employee;

    public EmployeeDAO(Employee employee) {
        this.employee = employee;
    }

    @Bean
    public Employee getEmployee(){
        return new Employee();
    }

}
