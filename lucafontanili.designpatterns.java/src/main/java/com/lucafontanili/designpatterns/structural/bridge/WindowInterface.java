package com.lucafontanili.designpatterns.structural.bridge;

import org.apache.log4j.Logger;

@FunctionalInterface
public interface WindowInterface {

    final Logger LOGGER = Logger.getRootLogger();

    public void createWindow();
}
