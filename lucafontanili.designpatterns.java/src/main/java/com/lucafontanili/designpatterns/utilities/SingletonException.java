package com.lucafontanili.designpatterns.utilities;

public class SingletonException extends Exception {

    private static final long serialVersionUID = 4118079944940675957L;

    public SingletonException(String message, Exception e) {
	super(message, e);
    }

}
