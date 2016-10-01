package com.lucafontanili.designpatterns.creational.prototype;

import com.lucafontanili.designpatterns.utilities.Constants;

public class Rectangle extends AbstractShape {

    public Rectangle() {
	this.type = Constants.RECTANGLE;
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(16).append("Drawing a Rectangle"));
    }
}
