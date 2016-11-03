package com.lucafontanili.designpatterns.creational.prototype;

import com.lucafontanili.designpatterns.utilities.Constants;

public class Circle extends AbstractShape {

    public Circle() {
	this.type = Constants.CIRCLE;
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(16).append("Drawing a Cricle"));
    }

}
