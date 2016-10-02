package com.lucafontanili.designpatterns.structural.decorator;

public class TextView implements ViewInterface {

    @Override
    public void draw() {
	logger.info(new StringBuilder(16).append("Creating a TextView"));
    }

}
