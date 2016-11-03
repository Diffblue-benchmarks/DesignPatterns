package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

public class SaveButton extends AbstractWidget {

    public SaveButton(AbstractHelpHandler handler) {
	super(handler);
    }

    @Override
    public void draw() {
	LOGGER.info(new StringBuilder(32).append("Drawing a Save Button"));
    }

    @Override
    public void showHelp() {
	this.helpHandler.showHelp(HelpTopic.SAVE_BUTTON);
    }

}
