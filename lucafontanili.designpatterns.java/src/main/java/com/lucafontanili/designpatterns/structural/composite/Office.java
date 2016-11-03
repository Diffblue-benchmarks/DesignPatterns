package com.lucafontanili.designpatterns.structural.composite;

public class Office extends AbstractEmployee {

    public Office(String name) {
	super(name);
    }

    @Override
    public int getSalary() {
	return people.stream().mapToInt(AbstractEmployee::getSalary).sum();
    }

}
