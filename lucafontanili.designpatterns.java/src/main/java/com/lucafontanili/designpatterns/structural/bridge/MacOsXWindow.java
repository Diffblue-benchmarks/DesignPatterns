package com.lucafontanili.designpatterns.structural.bridge;

public class MacOsXWindow implements WindowInterface {

    @Override
    public void createWindow() {
	LOGGER.info(new StringBuilder(32).append("Creating a Mac OsX window"));
    }

}
