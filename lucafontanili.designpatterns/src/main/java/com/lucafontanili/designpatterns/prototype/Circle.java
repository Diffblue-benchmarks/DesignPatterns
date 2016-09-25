package com.lucafontanili.designpatterns.prototype;

import com.lucafontanili.designpatterns.Constants;

public class Circle extends AbstractShape {

    public Circle() {
	this.type = Constants.CIRCLE;
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(16).append("Drawing a Cricle"));
    }

}
