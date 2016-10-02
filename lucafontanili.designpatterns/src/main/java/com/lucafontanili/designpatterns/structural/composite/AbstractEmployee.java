package com.lucafontanili.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEmployee {
    protected final String name;
    protected int salary;
    protected List<AbstractEmployee> people = new ArrayList<>();

    public String getName() {
	return this.name;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public int getSalary() {
	return this.salary;
    }

    public void add(AbstractEmployee person) {
	this.people.add(person);
    }

    public void remove(AbstractEmployee person) {
	this.people.remove(person);
    }

    public List<AbstractEmployee> getSubordinates() {
	return this.people;
    }

    public AbstractEmployee(String name) {
	this.name = name;
    }

}
