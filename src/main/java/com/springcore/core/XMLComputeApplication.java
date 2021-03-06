package com.springcore.core;

import com.springcore.components.ComponentDAO;
import com.springcore.core.javaconfig.Employee;
import com.springcore.core.xml_Compute.XMLConstructor_CalculateNumbersImpl;
import com.springcore.core.xml_Compute.XMLSetter_CalculateNumbersImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLComputeApplication {
    Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    ClassPathXmlApplicationContext applicationContext=new
            ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        XMLComputeApplication xmlComputeApplication= new XMLComputeApplication();
        xmlComputeApplication.setterMethodInjection();
        xmlComputeApplication.constructorDependencyInjection();
        xmlComputeApplication.componentScan();
        xmlComputeApplication.singletonCheck();
        xmlComputeApplication.beanPrototypeAndDependencySingleton();
        xmlComputeApplication.beanAndDependencyArePrototype();
        xmlComputeApplication.beanIsSingletonAndDependencyIsPrototype();
        xmlComputeApplication.loadEmployee();
    }

    private void loadEmployee() {
        Employee employee=(Employee) applicationContext.getBean("employee1");
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getEmployeeName());
    }

    public void setterMethodInjection(){

        System.out.println("Adding Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForAddition=applicationContext.
                getBean("(SetterMethod)addNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForAddition.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForAddition);

        System.out.println("Subtracting Numbers");
        XMLSetter_CalculateNumbersImpl setterMethodForSubtraction=applicationContext.
                getBean("(SetterMethod)subtractNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(setterMethodForSubtraction.computeNumbers(10,20));
        LOGGER.info("{}",setterMethodForSubtraction);

        XMLSetter_CalculateNumbersImpl autoWireByNameForDivision=
                applicationContext.getBean("(AutowireByName)divideNumbers",XMLSetter_CalculateNumbersImpl.class);
        System.out.println(autoWireByNameForDivision.computeNumbers(100,50));
        LOGGER.info("{}",autoWireByNameForDivision);

    }

    public void constructorDependencyInjection(){
        System.out.println("Constructor dependency injection");
        XMLConstructor_CalculateNumbersImpl constructorForAddition=
                applicationContext.getBean("(Constructor)addNumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForAddition.computeNumbers(10,50));
        LOGGER.info("{}",constructorForAddition);

        XMLConstructor_CalculateNumbersImpl constructorForSubtraction=
                applicationContext.getBean("(Constructor)SubtractNumbers",XMLConstructor_CalculateNumbersImpl.class);
        System.out.println(constructorForSubtraction.computeNumbers(10,50));
        LOGGER.info("{}",constructorForSubtraction);
    }

    private void componentScan() {
        ComponentDAO componentDAO=applicationContext.getBean("ComponentDAO",ComponentDAO.class);
        LOGGER.info("{}" ,componentDAO);
        LOGGER.info("{}",componentDAO.getComponentJdbcConnection());
    }

    private void singletonCheck() {
        System.out.println("SINGLETON SCOPE");
        ComponentDAO componentDAO1=applicationContext.getBean("ComponentDAO",ComponentDAO.class);
        ComponentDAO componentDAO2=applicationContext.getBean("ComponentDAO",ComponentDAO.class);
        System.out.println(componentDAO1);
        System.out.println(componentDAO1.getComponentJdbcConnection());
        System.out.println(componentDAO2);
        System.out.println(componentDAO2.getComponentJdbcConnection());
//        LOGGER.info("{}" ,componentDAO1);
//        LOGGER.info("{}",componentDAO1.getComponentJdbcConnection());
//        LOGGER.info("{}" ,componentDAO2);
//        LOGGER.info("{}",componentDAO2.getComponentJdbcConnection());
    }

    private void beanPrototypeAndDependencySingleton() {
        System.out.println("PROTOTYPE SCOPE");
        ComponentDAO componentDAO1=applicationContext.getBean("ComponentDAOPrototype",ComponentDAO.class);
        ComponentDAO componentDAO2=applicationContext.getBean("ComponentDAOPrototype",ComponentDAO.class);
        System.out.println(componentDAO1);
        System.out.println(componentDAO1.getComponentJdbcConnection());
        System.out.println(componentDAO2);
        System.out.println(componentDAO2.getComponentJdbcConnection());
    }

    private void beanAndDependencyArePrototype() {
        System.out.println("BOTH BEANS ARE PROTOTYPE SCOPE");
        ComponentDAO componentDAO1=applicationContext.getBean("ComponentDaoAndJDBCArePrototype",ComponentDAO.class);
        ComponentDAO componentDAO2=applicationContext.getBean("ComponentDaoAndJDBCArePrototype",ComponentDAO.class);
        System.out.println(componentDAO1);
        System.out.println(componentDAO1.getComponentJdbcConnection());
        System.out.println(componentDAO2);
        System.out.println(componentDAO2.getComponentJdbcConnection());
    }

    private void beanIsSingletonAndDependencyIsPrototype(){
        System.out.println("BEAN IS SINGLETON AND DEPENDENCY IS PROTOTYPE");
        ComponentDAO componentDAO1=applicationContext.getBean("ComponentDaoSingleAndJDBCPrototype",ComponentDAO.class);
        ComponentDAO componentDAO2=applicationContext.getBean("ComponentDaoSingleAndJDBCPrototype",ComponentDAO.class);
        System.out.println(componentDAO1);
        System.out.println(componentDAO1.getComponentJdbcConnection());
        System.out.println(componentDAO2);
        System.out.println(componentDAO2.getComponentJdbcConnection());
    }

}
