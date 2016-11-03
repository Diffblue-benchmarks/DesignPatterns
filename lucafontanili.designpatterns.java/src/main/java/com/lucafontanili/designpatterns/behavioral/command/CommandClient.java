package com.lucafontanili.designpatterns.behavioral.command;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class CommandClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new CommandClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	AbstractOperation copy = new CopyOperation();
	copy.execute();

	new AddOperation().execute();

    }

}
