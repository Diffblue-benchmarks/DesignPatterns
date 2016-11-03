package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public abstract class AbstractHelpHandler {

    protected static final Logger LOGGER = Logger.getRootLogger();
    protected final AbstractHelpHandler nextHandler;
    protected final List<HelpTopic> topics;

    public AbstractHelpHandler(AbstractHelpHandler next, HelpTopic... topics) {
	this.topics = Arrays.asList(topics);
	this.nextHandler = next;
    }

    public void showHelp(HelpTopic topic) {
	if (this.topics.contains(topic)) {
	    showHelpMessage();
	} else {
	    this.nextHandler.showHelp(topic);
	}

    }

    protected abstract void showHelpMessage();
}
