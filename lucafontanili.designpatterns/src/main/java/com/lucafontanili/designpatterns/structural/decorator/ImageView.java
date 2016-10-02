package com.lucafontanili.designpatterns.structural.decorator;

public class ImageView implements ViewInterface {

    @Override
    public void draw() {
	logger.info(new StringBuilder(16).append("Creating an ImageView"));
    }

}
