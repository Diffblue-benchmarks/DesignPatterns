package com.lucafontanili.designpatterns.creational.abstractfactory;

/**
 * The actual AbstractFactory
 *
 * @author lucafontanili
 *
 */

@FunctionalInterface
public interface AbstractWidgetFactory {
    public Window createWindow();

}
