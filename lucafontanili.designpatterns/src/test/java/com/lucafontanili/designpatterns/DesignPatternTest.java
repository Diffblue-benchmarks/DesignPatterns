package com.lucafontanili.designpatterns;

import java.io.IOException;

import org.junit.Test;

import com.lucafontanili.designpatterns.abstractfactory.AbstractFactoryClient;
import com.lucafontanili.designpatterns.abstractfactory.InvalidArgumentException;
import com.lucafontanili.designpatterns.builder.BuilderClient;
import com.lucafontanili.designpatterns.factorymethod.FactoryMetodClient;
import com.lucafontanili.designpatterns.prototype.PrototypeClient;
import com.lucafontanili.designpatterns.utilities.AbstractClient;

public class DesignPatternTest extends AbstractClient {

    @Override
    @Test
    public void run() throws InvalidArgumentException, IOException {
	LOGGER.info(new StringBuilder(64).append("Abstract Factory Pattern"));
	main(new AbstractFactoryClient());
	LOGGER.info(new StringBuilder(64).append("\n\nBuilder Pattern"));
	main(new BuilderClient());
	LOGGER.info(new StringBuilder(64).append("\n\nFactory Method Pattern"));
	main(new FactoryMetodClient());
	LOGGER.info(new StringBuilder(64).append("\n\nPrototype Pattern"));
	main(new PrototypeClient());
    }
}
