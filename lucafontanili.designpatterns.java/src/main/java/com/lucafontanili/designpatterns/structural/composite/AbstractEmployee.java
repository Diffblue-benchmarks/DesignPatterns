package com.lucafontanili.designpatterns.structural.composite;

public abstract class AbstractEmployee {
    protected final String name;
    protected int salary;

    public AbstractEmployee(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public int getSalary() {
	return this.salary;
    }

}
