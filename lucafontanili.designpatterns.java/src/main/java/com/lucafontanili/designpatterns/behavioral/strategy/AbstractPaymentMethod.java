package com.lucafontanili.designpatterns.behavioral.strategy;

import org.apache.log4j.Logger;

public abstract class AbstractPaymentMethod {

    protected static final Logger LOGGER = Logger.getRootLogger();

    public abstract void pay(String paymentAccount, double d);
}
