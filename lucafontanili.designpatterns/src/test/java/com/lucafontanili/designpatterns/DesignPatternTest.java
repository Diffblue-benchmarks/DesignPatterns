package com.lucafontanili.designpatterns;

import java.io.IOException;

import org.junit.Test;

import com.lucafontanili.designpatterns.creational.abstractfactory.AbstractFactoryClient;
import com.lucafontanili.designpatterns.creational.builder.BuilderClient;
import com.lucafontanili.designpatterns.creational.factorymethod.FactoryMetodClient;
import com.lucafontanili.designpatterns.creational.prototype.PrototypeClient;
import com.lucafontanili.designpatterns.creational.singleton.SingletonClient;
import com.lucafontanili.designpatterns.structural.adapter.AdapterClient;
import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

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
	LOGGER.info(new StringBuilder(64).append("\n\nSingleton Pattern"));
	main(new SingletonClient());
	LOGGER.info(new StringBuilder(64).append("\n\nAdapter Pattern"));
	main(new AdapterClient());
    }
}
