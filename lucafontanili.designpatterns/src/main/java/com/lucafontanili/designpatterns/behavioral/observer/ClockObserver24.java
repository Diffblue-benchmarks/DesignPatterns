package com.lucafontanili.designpatterns.behavioral.observer;

public class ClockObserver24 extends AbstractObserver {

    @Override
    void update(AbstractClockTimer timer) {
	LOGGER.info(new StringBuilder(32).append(timer.getHour()).append(DASH).append(timer.getMinute()).append(DASH)
		.append(timer.getSecond()));
    }

}
