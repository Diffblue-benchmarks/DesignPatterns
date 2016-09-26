package com.lucafontanili.designpatterns.abstractfactory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

    // create a MacOSXWindow
    @Override
    public Window createWindow() {
	return new MacOSXWindow();
    }

}
