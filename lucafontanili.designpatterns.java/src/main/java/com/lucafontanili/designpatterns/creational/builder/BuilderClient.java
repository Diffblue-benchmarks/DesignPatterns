package com.lucafontanili.designpatterns.creational.builder;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class BuilderClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new BuilderClient());
    }

    @Override
    public void run() throws InvalidArgumentException {
	User user = new UserBuilder("Luca", "Fontanili").age(26).address("Parma").phone("+39 0521 888888").build();
	LOGGER.info("User created with the Builder Pattern: " + user.toString());
    }
}
