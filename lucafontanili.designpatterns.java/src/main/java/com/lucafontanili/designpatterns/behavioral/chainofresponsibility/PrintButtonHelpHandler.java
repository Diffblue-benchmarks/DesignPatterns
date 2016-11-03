package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class PrintButtonHelpHandler extends AbstractHelpHandler {

    public PrintButtonHelpHandler(AbstractHelpHandler next, HelpTopic... topics) {
	super(next, topics);
    }

    @Override
    protected void showHelpMessage() {
	LOGGER.info(new StringBuilder(64).append("This is a print button, hit it if you want to print your document"));
    }

}
