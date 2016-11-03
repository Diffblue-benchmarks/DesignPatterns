package com.lucafontanili.designpatterns.behavioral.mediator;

import org.apache.log4j.Logger;

public abstract class AbstractWidget {
    protected WidgetMediator mediator = WidgetMediator.getInstance();

    protected static final Logger LOGGER = Logger.getRootLogger();

}
