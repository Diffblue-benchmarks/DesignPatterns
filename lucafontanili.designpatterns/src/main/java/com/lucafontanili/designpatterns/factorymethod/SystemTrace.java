package com.lucafontanili.designpatterns.factorymethod;

import org.apache.log4j.Logger;

public class SystemTrace implements TraceInterface {
    private boolean debug;
    private static final Logger LOGGER = Logger.getRootLogger();

    @Override
    public void setDebug(boolean debug) {
	this.debug = debug;
    }

    @Override
    public void debug(String message) {
	if (this.debug) { // only print if debug is true
	    System.out.println("DEBUG: " + message);
	}
    }

    @Override
    public void error(String message) {
	LOGGER.error("ERROR: " + message);
    }
}
