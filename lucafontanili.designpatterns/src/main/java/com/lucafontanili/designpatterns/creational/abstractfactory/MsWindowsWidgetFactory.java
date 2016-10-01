package com.lucafontanili.designpatterns.creational.abstractfactory;

/**
 * A single ConcreteFactory
 *
 * @author lucafontanili
 *
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

    // create an MSWindow
    @Override
    public Window createWindow() {
	return new MSWindow();
    }
}
