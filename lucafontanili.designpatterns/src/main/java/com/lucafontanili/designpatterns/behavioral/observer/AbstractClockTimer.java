package com.lucafontanili.designpatterns.behavioral.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

abstract class AbstractClockTimer {

    protected LocalDateTime now;
    protected List<AbstractObserver> observers = new ArrayList<>();

    public int getHour() {

	return this.now.getHour();
    }

    public int getMinute() {

	return this.now.getMinute();
    }

    public int getSecond() {

	return this.now.getSecond();
    }

    public void tick() {

	// This assures that the notify statement is executed AFTER the state of
	// the ClockTimer is set consistently
	body();
	this.observers.forEach(observer -> observer.update(this));
    }

    public void addObserver(AbstractObserver observer) {
	this.observers.add(observer);
    }

    protected abstract void body();
}
