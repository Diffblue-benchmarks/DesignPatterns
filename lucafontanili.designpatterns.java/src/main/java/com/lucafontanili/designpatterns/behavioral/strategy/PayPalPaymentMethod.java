package com.lucafontanili.designpatterns.behavioral.strategy;

public class PayPalPaymentMethod extends AbstractPaymentMethod {

    @Override
    public void pay(String paymentAccount, double total) {
	LOGGER.info(new StringBuilder(32).append("Paying $").append(total).append(" with PayPal account ")
		.append(paymentAccount));

    }

}
