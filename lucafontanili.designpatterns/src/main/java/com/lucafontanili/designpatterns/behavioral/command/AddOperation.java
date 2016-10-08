package com.lucafontanili.designpatterns.behavioral.command;

public class AddOperation extends AbstractOperation {

    @Override
    protected void doOperation() {
	LOGGER.info(new StringBuilder(32).append("Creating new file"));

	/*
	 * Performs all the necessary operations to add a new Object
	 */
    }

}
