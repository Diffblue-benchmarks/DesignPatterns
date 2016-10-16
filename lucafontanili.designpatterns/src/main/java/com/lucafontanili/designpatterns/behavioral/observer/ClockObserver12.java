package com.lucafontanili.designpatterns.behavioral.observer;

public class ClockObserver12 extends AbstractObserver {

    @Override
    void update(AbstractClockTimer timer) {
	LOGGER.info(new StringBuilder(32).append(timer.getHour() % 12 == 0 ? 12 : timer.getHour() % 12).append(DASH)
		.append(timer.getMinute()).append(DASH).append(timer.getSecond())
		.append(timer.getHour() / 12 == 1 ? " PM" : " AM"));

    }

}
