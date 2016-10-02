package com.lucafontanili.designpatterns.structural.bridge;

public class UbuntuWindow implements WindowInterface {

    @Override
    public void createWindow() {
	LOGGER.info(new StringBuilder(32).append("Creating an Ubuntu window"));

    }

}
