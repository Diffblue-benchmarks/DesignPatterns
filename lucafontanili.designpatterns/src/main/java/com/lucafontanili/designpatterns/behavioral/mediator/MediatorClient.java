package com.lucafontanili.designpatterns.behavioral.mediator;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class MediatorClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new MediatorClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	Button button = new Button();
	TextBox textBox = new TextBox();

	button.clearText();
	textBox.enterText("Hi!");
	button.clearText();

    }

}
