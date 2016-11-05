package com.lucafontanili.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Office extends AbstractEmployee {

    private List<AbstractEmployee> people = new ArrayList<>();

    public Office(String name) {
	super(name);
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

    @Override
    public int getSalary() {
	return people.stream().mapToInt(AbstractEmployee::getSalary).sum();
    }

}
