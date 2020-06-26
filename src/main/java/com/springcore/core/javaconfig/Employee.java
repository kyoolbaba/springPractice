package com.springcore.core.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
    @Value(value = "Milan")
    private String employeeName;

    @Value(value = "1001")
    private int employeeId;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
