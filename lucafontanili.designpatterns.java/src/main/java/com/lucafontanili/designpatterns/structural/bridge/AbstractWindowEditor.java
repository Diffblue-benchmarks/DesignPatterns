package com.lucafontanili.designpatterns.structural.bridge;

import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public abstract class AbstractWindowEditor {
    protected WindowInterface window;

    protected AbstractWindowEditor(WindowInterface windowInterface) {
	this.window = windowInterface;
    }

    public static AbstractWindowEditor getEditor(String platform) throws InvalidArgumentException {

	switch (platform) {
	case Constants.MAC_OSX:
	    return new MacOsXWindowEditor(new MacOsXWindow());
	case Constants.UBUNTU:
	    return new UbuntuWindowEditor(new UbuntuWindow());
	default:
	    throw new InvalidArgumentException(new StringBuilder("Invalid platform: ").append(platform).toString());
	}

    }

    public void makeWindow() {
	window.createWindow();
    }
}
