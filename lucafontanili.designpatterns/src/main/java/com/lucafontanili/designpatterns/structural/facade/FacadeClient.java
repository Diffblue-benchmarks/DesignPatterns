package com.lucafontanili.designpatterns.structural.facade;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class FacadeClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new FacadeClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ImageFacade facade = ImageFacade.getInstance();
	facade.zipImage(Constants.SOURCE_PATH, Constants.OUTPUT_PATH);
    }
}
