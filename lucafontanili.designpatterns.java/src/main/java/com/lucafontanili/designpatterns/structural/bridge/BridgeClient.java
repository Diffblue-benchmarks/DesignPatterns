package com.lucafontanili.designpatterns.structural.bridge;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class BridgeClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new BridgeClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	AbstractWindowEditor macOsXWindowEditor = AbstractWindowEditor.getEditor(System.getProperty(Constants.OS_NAME));
	macOsXWindowEditor.makeWindow();

    }

}
