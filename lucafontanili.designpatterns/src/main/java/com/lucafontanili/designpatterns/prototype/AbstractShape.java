package com.lucafontanili.designpatterns.prototype;

import org.apache.log4j.Logger;

public abstract class AbstractShape implements Cloneable {
    protected static final Logger LOGGER = Logger.getRootLogger();
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
	return this.type;
    }

    public String getId() {
	return this.id;
    }

    public void setId(String id) {
	this.id = id;
    }

    @Override
    public Object clone() {
	Object clone = null;

	try {
	    clone = super.clone();

	} catch (CloneNotSupportedException e) {
	    LOGGER.error(new StringBuilder(246).append("Error cloning the object"), e);
	}

	return clone;
    }

}
