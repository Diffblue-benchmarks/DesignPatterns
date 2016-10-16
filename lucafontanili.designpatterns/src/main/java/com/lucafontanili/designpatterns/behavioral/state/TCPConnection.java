package com.lucafontanili.designpatterns.behavioral.state;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class TCPConnection {

    private static final Map<TCPState, AbstracTCPState> STATE_MAP = new ConcurrentHashMap<>();
    protected static final Logger LOGGER = Logger.getRootLogger();
    protected TCPState state;

    public TCPConnection() {
	this.state = TCPState.EMPTY;
	initMap();
    }

    private static void initMap() {
	STATE_MAP.put(TCPState.CLOSE, new TCPStateClose());
	STATE_MAP.put(TCPState.OPEN, new TCPStateOpen());
	STATE_MAP.put(TCPState.ESTABLISH, new TCPStateEstablish());
    }

    public void execute(TCPState state) {
	if (STATE_MAP.get(state).execute(this.state)) {
	    this.state = state;
	}
    }

}
