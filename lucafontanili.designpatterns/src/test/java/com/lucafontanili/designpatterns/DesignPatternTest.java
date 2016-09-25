package com.lucafontanili.designpatterns;

import org.junit.Test;

import com.lucafontanili.designpatterns.abstractfactory.AbstractFactoryClient;
import com.lucafontanili.designpatterns.abstractfactory.InvalidArgumentException;
import com.lucafontanili.designpatterns.builder.BuilderClient;
import com.lucafontanili.designpatterns.utilities.AbstractClient;

public class DesignPatternTest extends AbstractClient {

    @Override
    @Test
    public void run() throws InvalidArgumentException {
	main(new AbstractFactoryClient());
	main(new BuilderClient());
    }
}
