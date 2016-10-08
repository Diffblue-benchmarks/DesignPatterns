package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class GenericButton extends AbstractWidget {

    public GenericButton(AbstractHelpHandler handler) {
	super(handler);
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(32).append("Drawing a button"));
    }

    @Override
    public void showHelp() {
	this.helpHandler.showHelp(HelpTopic.WIDGET);
    }

}
