package com.lucafontanili.designpatterns.structural.proxy;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.Constants;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class ProxyClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new ProxyClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ProxyImage image = new ProxyImage(Constants.SOURCE_PATH);
	image.draw();
	image.draw();

    }

}
