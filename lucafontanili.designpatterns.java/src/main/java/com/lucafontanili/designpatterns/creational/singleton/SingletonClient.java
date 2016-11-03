package com.lucafontanili.designpatterns.creational.singleton;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;
import com.lucafontanili.designpatterns.utilities.SingletonException;

public class SingletonClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new SingletonClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	try {
	    Singleton pdfSingleton = Singleton.getInstance(Constants.PDF);
	    pdfSingleton.printType();
	    Singleton rtfSingleto = Singleton.getInstance(Constants.RTF);
	    rtfSingleto.printType();
	} catch (SingletonException e) {
	    LOGGER.error(new StringBuilder(256).append("Error on SingletonClient.run"), e);
	}

    }

}
