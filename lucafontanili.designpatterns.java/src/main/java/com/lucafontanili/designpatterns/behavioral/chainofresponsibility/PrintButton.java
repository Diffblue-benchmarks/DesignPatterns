package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class PrintButton extends AbstractWidget {

    public PrintButton(AbstractHelpHandler handler) {
	super(handler);
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(32).append("Drawing a Print Button"));
    }

    @Override
    public void showHelp() {
	this.helpHandler.showHelp(HelpTopic.PRINT_BUTTON);
    }

}
