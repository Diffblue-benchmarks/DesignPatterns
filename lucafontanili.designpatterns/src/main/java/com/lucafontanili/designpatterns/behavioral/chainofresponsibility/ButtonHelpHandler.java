package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class ButtonHelpHandler extends AbstractHelpHandler {

    public ButtonHelpHandler(AbstractHelpHandler next, HelpTopic... topics) {
	super(next, topics);
    }

    @Override
    protected void showHelpMessage() {
	LOGGER.info(new StringBuilder(32).append("This is a button"));
    }

}
