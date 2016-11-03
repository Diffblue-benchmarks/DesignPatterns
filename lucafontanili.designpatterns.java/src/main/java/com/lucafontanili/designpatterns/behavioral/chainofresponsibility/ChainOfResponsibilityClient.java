package com.lucafontanili.designpatterns.behavioral.chainofresponsibility;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class ChainOfResponsibilityClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new ChainOfResponsibilityClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	AbstractHelpHandler applicationHandler = new ApplicationHelpHandler(null, HelpTopic.values());
	AbstractHelpHandler buttonHandler = new ButtonHelpHandler(applicationHandler, HelpTopic.PRINT_BUTTON,
		HelpTopic.SAVE_BUTTON);
	AbstractHelpHandler printButtonHandler = new PrintButtonHelpHandler(buttonHandler, HelpTopic.PRINT_BUTTON);

	AbstractWidget printButton = new PrintButton(printButtonHandler);
	printButton.draw();
	printButton.showHelp();

	AbstractWidget saveButton = new SaveButton(buttonHandler);
	saveButton.showHelp();

	AbstractWidget button = new GenericButton(buttonHandler);
	button.showHelp();
    }

}
