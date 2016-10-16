package com.lucafontanili.designpatterns.behavioral.state;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class StateClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new StateClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	TCPConnection tcpConnection = new TCPConnection();
	tcpConnection.execute(TCPState.CLOSE);
	tcpConnection.execute(TCPState.OPEN);
	tcpConnection.execute(TCPState.CLOSE);
	tcpConnection.execute(TCPState.ESTABLISH);
	tcpConnection.execute(TCPState.CLOSE);
    }

}
