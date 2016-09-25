package com.lucafontanili.designpatterns.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.lucafontanili.designpatterns.abstractfactory.InvalidArgumentException;

public abstract class AbstractClient {

    protected static final Logger LOGGER = Logger.getRootLogger();

    static {
	Properties props = new Properties();
	try (InputStream is = new FileInputStream("log4j.properties")) {
	    props.load(is);
	    PropertyConfigurator.configure(props);
	} catch (IOException e) {
	    LOGGER.error("Error loading properties", e);
	}
    }

    public static void main(AbstractClient client) throws InvalidArgumentException {
	client.run();
    }

    public abstract void run() throws InvalidArgumentException;
}
