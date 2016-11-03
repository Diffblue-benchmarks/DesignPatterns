package com.lucafontanili.designpatterns.behavioral.state;

public class TCPStateClose extends AbstracTCPState {

    @Override
    protected boolean doOperation(TCPState state) {
	if (state.equals(TCPState.ESTABLISH)) {
	    LOGGER.info(new StringBuilder(32).append("Connection closed"));
	} else {
	    LOGGER.error(new StringBuilder(32).append("Cannot close an non-established connection"));
	}
	return state.equals(TCPState.ESTABLISH);
    }

}
