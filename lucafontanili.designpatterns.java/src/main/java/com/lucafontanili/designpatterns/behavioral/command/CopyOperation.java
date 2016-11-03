package com.lucafontanili.designpatterns.behavioral.command;

public class CopyOperation extends AbstractOperation {

    @Override
    protected void doOperation() {
	LOGGER.info(new StringBuilder(32).append("Copying file"));

	/*
	 * Performs all the necessary operations to copy an Object
	 */
    }

}
