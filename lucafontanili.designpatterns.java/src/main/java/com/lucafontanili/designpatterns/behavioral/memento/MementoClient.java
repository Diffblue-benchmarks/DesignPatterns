package com.lucafontanili.designpatterns.behavioral.memento;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class MementoClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new MementoClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	Originator originator = new Originator();
	originator.setState("First");
	LOGGER.info(originator.getState());
	originator.setState("Second");
	LOGGER.info(originator.getState());
	LOGGER.info(originator.getHistory());
	LOGGER.info(new StringBuilder(8).append("Undo"));
	originator.undo();
	LOGGER.info(originator.getState());
	originator.setState("Third");
	LOGGER.info(originator.getState());

	LOGGER.info(originator.getHistory());
    }
}
