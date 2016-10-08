package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

import org.apache.log4j.Logger;

public abstract class AbstractWidget {

    protected static final Logger LOGGER = Logger.getRootLogger();
    protected AbstractHelpHandler helpHandler;

    public AbstractWidget(AbstractHelpHandler handler) {
	this.helpHandler = handler;
    }

    public abstract void draw();

    public abstract void showHelp();
}
