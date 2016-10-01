package com.lucafontanili.designpatterns.creational.factorymethod;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class TraceFactory {

    private TraceFactory() {

    }

    public static TraceInterface getTrace(String traceType) throws IOException, InvalidArgumentException {
	switch (traceType) {
	case Constants.SYSTEM_TRACE:
	    return new SystemTrace();
	case Constants.FILE_TRACE:
	    return new FileTrace();
	default:
	    throw new InvalidArgumentException(
		    new StringBuilder(64).append("Invalid trace type ").append(traceType).toString());
	}
    }
}
