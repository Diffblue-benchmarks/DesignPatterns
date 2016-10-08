package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class ApplicationHelpHandler extends AbstractHelpHandler {

    public ApplicationHelpHandler(AbstractHelpHandler next, HelpTopic... topics) {
	super(next, topics);
    }

    @Override
    protected void showHelpMessage() {
	LOGGER.info(new StringBuilder(32).append("Application general help message"));
    }

}
