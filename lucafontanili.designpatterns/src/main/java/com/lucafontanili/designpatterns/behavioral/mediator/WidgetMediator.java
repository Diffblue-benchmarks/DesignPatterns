package com.lucafontanili.designpatterns.behavioral.mediator;

import org.apache.log4j.Logger;

public class WidgetMediator {

    private Button button;
    private TextBox textBox;
    private static final Logger LOGGER = Logger.getRootLogger();

    private static volatile WidgetMediator INSTANCE;

    private WidgetMediator() {
    }

    public static WidgetMediator getInstance() {
	WidgetMediator result = INSTANCE;
	if (result == null) {
	    synchronized (WidgetMediator.class) {
		result = INSTANCE;
		if (result == null) {
		    result = INSTANCE = new WidgetMediator();
		}

	    }
	}
	return result;
    }

    void buttonClicked(Button button) {
	this.textBox.clearText();
	this.button.setEnabled(false);
	LOGGER.info(new StringBuilder(32).append("Text cleared"));
    }

    public void enteredValidText(TextBox textBox) {
	if (!textBox.getMessage().isEmpty()) {
	    this.button.setEnabled(true);
	    LOGGER.info(new StringBuilder(32).append("Entered: ").append(textBox.getMessage()));
	}

    }

    public void setButton(Button button) {
	this.button = button;

    }

    public void setTextBox(TextBox textBox) {
	this.textBox = textBox;

    }
}
