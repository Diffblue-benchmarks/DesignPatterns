package com.lucafontanili.designpatterns.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class ShoppingCart {

    private final Map<String, Double> basket = new HashMap<>();

    public void addItem(String item, double price) {
	this.basket.put(item, price);
    }

    public void pay(PaymentMethod method, String account) throws InvalidArgumentException {
	AbstractPaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(method);
	paymentMethod.pay(account, basket.values().stream().mapToDouble(Double::doubleValue).sum());
    }

}
