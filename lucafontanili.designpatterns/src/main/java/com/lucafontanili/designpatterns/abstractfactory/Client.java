package com.lucafontanili.designpatterns.abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Client {

    private static final String MAC_OSX = "Mac OS X";
    private static final String WINDOWS = "Windows XP";

    private static final Logger LOGGER = Logger.getRootLogger();

    static {
	Properties props = new Properties();
	try (InputStream is = new FileInputStream("log4j.properties")) {
	    props.load(is);
	    PropertyConfigurator.configure(props);
	} catch (IOException e) {
	    LOGGER.error("Error during properties load", e);
	}

    }

    public static void main(String[] args) throws InvalidArgumentException {
	GUIBuilder builder = new GUIBuilder();
	AbstractWidgetFactory widgetFactory;
	String platformOS = System.getProperty("os.name");
	LOGGER.info("Running Client on " + platformOS + " platform");
	// check what platform we're on
	switch (platformOS) {
	case MAC_OSX:
	    widgetFactory = new MacOSXWidgetFactory();
	    break;
	case WINDOWS:
	    widgetFactory = new MsWindowsWidgetFactory();
	    break;
	default:
	    throw new InvalidArgumentException("Invalid platform");
	}

	builder.buildWindow(widgetFactory);
    }
}
