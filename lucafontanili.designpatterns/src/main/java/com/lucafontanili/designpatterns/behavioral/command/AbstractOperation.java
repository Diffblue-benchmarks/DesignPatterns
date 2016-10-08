package com.lucafontanili.designpatterns.behavioral.command;

import org.apache.log4j.Logger;

public abstract class AbstractOperation {

    protected static final Logger LOGGER = Logger.getRootLogger();

    protected abstract void doOperation();

    public void execute() {
	OperationExecutor.execute(() -> doOperation());
    }

    protected static class OperationExecutor {
	public interface Command {
	    public void doWork();
	}

	public static void execute(Command command) {
	    command.doWork();
	}
    }

}
