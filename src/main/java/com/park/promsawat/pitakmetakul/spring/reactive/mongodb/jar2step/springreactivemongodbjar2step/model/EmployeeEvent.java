package com.park.promsawat.pitakmetakul.spring.reactive.mongodb.jar2step.springreactivemongodbjar2step.model;

import java.util.Date;

public class EmployeeEvent {

    private Employee employee;
    private Date date;

    public EmployeeEvent() {
    }

    public EmployeeEvent(Employee employee, Date date) {
        this.employee = employee;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EmployeeEvent{" +
                "employee=" + employee +
                ", date=" + date +
                '}';
    }
}
