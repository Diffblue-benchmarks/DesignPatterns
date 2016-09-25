package com.lucafontanili.designpatterns;

import java.io.IOException;

import org.junit.Test;

import com.lucafontanili.designpatterns.abstractfactory.AbstractFactoryClient;
import com.lucafontanili.designpatterns.abstractfactory.InvalidArgumentException;
import com.lucafontanili.designpatterns.builder.BuilderClient;
import com.lucafontanili.designpatterns.factorymethod.FactoryMetodClient;
import com.lucafontanili.designpatterns.utilities.AbstractClient;

public class DesignPatternTest extends AbstractClient {

    @Override
    @Test
    public void run() throws InvalidArgumentException, IOException {
	main(new AbstractFactoryClient());
	main(new BuilderClient());
	main(new FactoryMetodClient());
    }
}
