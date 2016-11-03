package com.lucafontanili.designpatterns.behavioral.strategy;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class StrategyClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new StrategyClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ShoppingCart shoppingCart = new ShoppingCart();
	shoppingCart.addItem("Pasta", 1.0);
	shoppingCart.addItem("Basil", 0.5);
	shoppingCart.addItem("Tomatoes", 0.7);

	shoppingCart.pay(PaymentMethod.CREDIT_CARD, "xxxx-xxxx-xxxx-xxxx");
	shoppingCart.pay(PaymentMethod.PAYPAL, "test@paypal.com");
    }

}
