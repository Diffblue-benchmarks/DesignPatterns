package com.lucafontanili.designpatterns.behavioral.observer;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClockTimer extends AbstractClockTimer {

    @Override
    protected void body() {
	this.now = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    }

}
