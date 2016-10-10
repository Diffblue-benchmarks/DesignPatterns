package com.lucafontanili.designpatterns.behavioral.mediator;

public class Button extends AbstractWidget {

    private boolean enabled;

    public Button() {
	this.enabled = false;
	this.mediator.setButton(this);
    }

    public void clearText() {
	if (!getEnabled()) {
	    LOGGER.warn(new StringBuilder(32).append("Button disabled, please enter some text"));
	    return;
	}
	this.mediator.buttonClicked(this);
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;

    }

    public boolean getEnabled() {
	return this.enabled;

    }

}
