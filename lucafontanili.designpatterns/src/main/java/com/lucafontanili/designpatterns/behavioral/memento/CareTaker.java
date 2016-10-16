package com.lucafontanili.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> states = new ArrayList<>();

    public void add(Memento state) {
	this.states.add(state);
    }

    public Memento get(int index) {
	return this.states.get(index);
    }

    public void remove(int index) {
	this.states.remove(index);
    }

    public List<Memento> getHistory() {
	return this.states;
    }
}
