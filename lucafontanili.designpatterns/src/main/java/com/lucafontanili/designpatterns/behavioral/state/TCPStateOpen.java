package com.lucafontanili.designpatterns.behavioral.state;

public class TCPStateOpen extends AbstracTCPState {

    @Override
    protected boolean doOperation(TCPState state) {
	if (state.equals(TCPState.EMPTY)) {
	    LOGGER.info(new StringBuilder(32).append("Connection opened"));
	} else {
	    LOGGER.error(new StringBuilder(32).append("Cannot open a non-empty connection"));
	}
	return state.equals(TCPState.EMPTY);

    }

}
