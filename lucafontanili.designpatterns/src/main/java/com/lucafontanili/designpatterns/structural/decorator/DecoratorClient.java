package com.lucafontanili.designpatterns.structural.decorator;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class DecoratorClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new DecoratorClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ViewInterface simpleView = new ImageView();
	simpleView.draw();

	ViewInterface decoratedView = new BorderDecorator(new TextView());
	decoratedView.draw();
    }

}
