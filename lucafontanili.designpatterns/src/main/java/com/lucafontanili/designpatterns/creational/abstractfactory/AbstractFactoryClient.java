package com.lucafontanili.designpatterns.creational.abstractfactory;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class AbstractFactoryClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {

	main(new AbstractFactoryClient());
    }

    @Override
    public void run() throws InvalidArgumentException {
	GUIBuilder builder = new GUIBuilder();
	AbstractWidgetFactory widgetFactory;
	String platformOS = System.getProperty(Constants.OS_NAME);
	LOGGER.info(new StringBuilder(64).append("Running Client on ").append(platformOS).append(" platform"));
	// check what platform we're on
	switch (platformOS) {
	case Constants.MAC_OSX:
	    widgetFactory = new MacOSXWidgetFactory();
	    break;
	case Constants.WINDOWS:
	    widgetFactory = new MsWindowsWidgetFactory();
	    break;
	default:
	    throw new InvalidArgumentException(new StringBuilder(64).append("Invalid platform").toString());
	}

	builder.buildWindow(widgetFactory);
    }
}
