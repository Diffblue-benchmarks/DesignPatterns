package com.lucafontanili.designpatterns.behavioral.memento;

public class Memento {

    private final String state;

    public Memento(String state) {
	this.state = state;
    }

    public String getState() {
	return this.state;
    }

    @Override
    public String toString() {
	return new StringBuilder(32).append("[state=").append(getState()).append("]").toString();
    }
}
