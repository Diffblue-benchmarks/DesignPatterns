package com.lucafontanili.designpatterns.prototype;

import java.io.IOException;

import com.lucafontanili.designpatterns.Constants;
import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class PrototypeClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new PrototypeClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ShapeCache.loadCache();
	AbstractShape circleShape = ShapeCache.getShape(Constants.CIRCLE);
	LOGGER.info(new StringBuilder(128).append("Draw circle -> "));
	circleShape.draw();
	AbstractShape rectangleShape = ShapeCache.getShape(Constants.RECTANGLE);
	LOGGER.info(new StringBuilder(128).append("Draw rectangle -> "));
	rectangleShape.draw();
    }

}
