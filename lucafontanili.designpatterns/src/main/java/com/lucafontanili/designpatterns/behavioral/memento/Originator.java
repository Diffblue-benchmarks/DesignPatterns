package com.lucafontanili.designpatterns.behavioral.memento;

import java.util.List;

public class Originator {

    private String state;
    private int count = 0;
    private CareTaker careTaker = new CareTaker();

    public String getState() {
	return this.state;
    }

    public void setState(String state) {
	this.count++;
	this.careTaker.add(new Memento(state));
	this.state = state;
    }

    public List<Memento> getHistory() {
	return this.careTaker.getHistory();
    }

    public void undo() {
	this.careTaker.remove(--this.count);
	this.state = this.careTaker.get(this.count - 1).getState();
    }
}
