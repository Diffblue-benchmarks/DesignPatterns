package com.lucafontanili.designpatterns.behavioral.observer;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class ObserverClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new ObserverClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ClockTimer clockTimer = new ClockTimer();
	clockTimer.addObserver(new ClockObserver12());
	clockTimer.addObserver(new ClockObserver24());
	for (int count = 0; count < 5; ++count) {
	    clockTimer.tick();
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		LOGGER.error(new StringBuilder(32).append("Error during sleep"), e);
	    }
	}
    }

}
