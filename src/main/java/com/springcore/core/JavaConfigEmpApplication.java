package com.springcore.core;

import com.springcore.core.javaconfig.Employee;
import com.springcore.core.javaconfig.EmployeeDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JavaConfigEmpApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(EmployeeDAO.class);
        Employee employee=applicationContext.getBean("getEmployee", Employee.class);
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());

        ClassPathXmlApplicationContext appcCntext=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDAO employee1= (EmployeeDAO) appcCntext.getBean("employeeDao");
        System.out.println(employee1.getEmployee().getEmployeeName());
        System.out.println(employee1.getEmployee().getEmployeeId());


    }
}
