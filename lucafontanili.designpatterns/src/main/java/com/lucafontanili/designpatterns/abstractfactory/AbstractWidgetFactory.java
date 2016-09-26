package com.lucafontanili.designpatterns.abstractfactory;

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
