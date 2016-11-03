package com.lucafontanili.designpatterns.behavioral.strategy;

import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class PaymentMethodFactory {
    private PaymentMethodFactory() {

    }

    public static AbstractPaymentMethod getPaymentMethod(PaymentMethod method) throws InvalidArgumentException {
	switch (method) {
	case PAYPAL:
	    return new PayPalPaymentMethod();
	case CREDIT_CARD:
	    return new CreditCardPaymentMethod();
	default:
	    throw new InvalidArgumentException(
		    new StringBuilder(32).append("Invalid payment method:").append(method).toString());
	}
    }
}
