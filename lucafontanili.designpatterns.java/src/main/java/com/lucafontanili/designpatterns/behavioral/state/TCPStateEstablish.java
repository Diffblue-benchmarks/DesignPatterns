package com.lucafontanili.designpatterns.behavioral.state;

public class TCPStateEstablish extends AbstracTCPState {

    @Override
    protected boolean doOperation(TCPState state) {
	if (state.equals(TCPState.OPEN)) {
	    LOGGER.info(new StringBuilder(32).append("Connection established"));
	} else {
	    LOGGER.error(new StringBuilder(32).append("Cannot establish a non-opened connection"));
	}
	return state.equals(TCPState.OPEN);
    }

}
