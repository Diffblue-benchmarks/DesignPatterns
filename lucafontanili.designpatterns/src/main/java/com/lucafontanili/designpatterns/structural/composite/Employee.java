package com.lucafontanili.designpatterns.structural.composite;

public class Employee extends AbstractEmployee {

    private final String office;
    private final String role;

    public String getOffice() {
	return this.office;
    }

    public String getRole() {
	return this.role;
    }

    public Employee(String name, String office, String role) {
	super(name);
	this.office = office;
	this.role = role;
    }
}
