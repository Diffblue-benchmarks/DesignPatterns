package com.lucafontanili.designpatterns.behavioral.mediator;

public class Button extends AbstractWidget {

    private boolean enabled;

    public Button() {
	this.enabled = false;
	this.mediator.setButton(this);
    }

    public void click() {

	this.mediator.buttonClicked(this);
    }

    void setEnabled(boolean enabled) {
	this.enabled = enabled;

    }

    boolean getEnabled() {
	return this.enabled;

    }

}
