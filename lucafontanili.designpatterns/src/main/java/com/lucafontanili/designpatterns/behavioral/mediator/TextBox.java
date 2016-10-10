package com.lucafontanili.designpatterns.behavioral.mediator;

public class TextBox extends AbstractWidget {
    private String message;

    public TextBox() {
	this.message = "";
	this.mediator.setTextBox(this);
    }

    public void enterText(String message) {
	this.message = message;
	this.mediator.enteredValidText(this);
    }

    public void clearText() {
	enterText("");
    }

    public String getMessage() {
	return this.message;
    }

}
