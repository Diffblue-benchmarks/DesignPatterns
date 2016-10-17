package com.lucafontanili.designpatterns.behavioral.strategy;

public class CreditCardPaymentMethod extends AbstractPaymentMethod {

    @Override
    public void pay(String paymentAccount, double total) {
	LOGGER.info(new StringBuilder(32).append("Paying $").append(total).append(" with credit card number ")
		.append(paymentAccount));
    }

}
