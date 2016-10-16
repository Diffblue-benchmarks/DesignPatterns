package com.lucafontanili.designpatterns.behavioral.observer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ClockTimer {

    private LocalDateTime now;
    private List<AbstractObserver> observers = new ArrayList<>();

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
	this.now = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
	this.observers.forEach(observer -> observer.update(this));
    }

    public void addObserver(AbstractObserver observer) {
	this.observers.add(observer);
    }
}
