package com.lucafontanili.designpatterns.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.lucafontanili.designpatterns.Constants;

public abstract class AbstractClient {

    protected static final Logger LOGGER = Logger.getRootLogger();

    static {
	Properties props = new Properties();
	try (InputStream is = new FileInputStream(Constants.LOG4J_PROPERTIES)) {
	    props.load(is);
	    PropertyConfigurator.configure(props);
	} catch (IOException e) {
	    LOGGER.error(new StringBuilder(64).append(Constants.PROPERTIES_LOAD_ERROR).toString(), e);
	}
    }

    public static void main(AbstractClient client) throws InvalidArgumentException, IOException {
	client.run();
    }

    public abstract void run() throws InvalidArgumentException, IOException;
}
