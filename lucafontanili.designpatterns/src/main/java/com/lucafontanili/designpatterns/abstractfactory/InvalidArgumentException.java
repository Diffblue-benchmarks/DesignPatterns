package com.lucafontanili.designpatterns.abstractfactory;

public class InvalidArgumentException extends Exception {

    private static final long serialVersionUID = 8470877749348175243L;

    public InvalidArgumentException(String message) {
	super(message);
    }

}
