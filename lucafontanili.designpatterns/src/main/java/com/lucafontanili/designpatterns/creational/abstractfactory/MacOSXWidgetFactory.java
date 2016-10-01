package com.lucafontanili.designpatterns.creational.abstractfactory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

    // create a MacOSXWindow
    @Override
    public Window createWindow() {
	return new MacOSXWindow();
    }

}
