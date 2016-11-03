package com.lucafontanili.designpatterns.behavioral.observer;

import org.apache.log4j.Logger;

abstract class AbstractObserver {
    protected static final Logger LOGGER = Logger.getRootLogger();
    protected static final String DASH = "-";

    abstract void update(AbstractClockTimer timer);
}
