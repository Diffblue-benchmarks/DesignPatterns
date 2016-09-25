package com.lucafontanili.designpatterns.abstractfactory;

import com.lucafontanili.designpatterns.utilities.AbstractClient;

public class AbstractFactoryClient extends AbstractClient {

    private static final String MAC_OSX = "Mac OS X";
    private static final String WINDOWS = "Windows XP";

    public static void main(String[] args) throws InvalidArgumentException {

	main(new AbstractFactoryClient());
    }

    @Override
    public void run() throws InvalidArgumentException {
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
