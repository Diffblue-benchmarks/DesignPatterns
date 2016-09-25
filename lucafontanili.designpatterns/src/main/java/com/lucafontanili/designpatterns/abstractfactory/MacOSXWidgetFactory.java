package com.lucafontanili.designpatterns.abstractfactory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

    // create a MacOSXWindow
    public Window createWindow() {
	MacOSXWindow window = new MacOSXWindow();
	return window;
    }

}
