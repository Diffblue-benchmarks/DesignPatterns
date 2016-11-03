package com.lucafontanili.designpatterns.behavioral.state;

import org.apache.log4j.Logger;

public abstract class AbstracTCPState {
    protected static final Logger LOGGER = Logger.getRootLogger();

    protected abstract boolean doOperation(TCPState state);

    public boolean execute(TCPState state) {
	return State.execute(() -> doOperation(state));
    }

    protected static class State {
	public interface Command {
	    public boolean doWork();
	}

	public static boolean execute(Command command) {
	    return command.doWork();
	}
    }
}
