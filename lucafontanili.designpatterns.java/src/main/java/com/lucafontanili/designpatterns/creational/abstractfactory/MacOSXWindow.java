package com.lucafontanili.designpatterns.creational.abstractfactory;

/**
 * A single ConcreteProduct
 * 
 * @author lucafontanili
 *
 */
public class MacOSXWindow implements Window {

    public void setTitle(String text) {
	// Mac OSX specific behaviour
    }

    public void repaint() {
	// Mac OSX specific behaviour
    }

}
