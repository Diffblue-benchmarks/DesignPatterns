package com.lucafontanili.designpatterns.creational.factorymethod;

public interface TraceInterface {

    public void setDebug(boolean debug);

    public void debug(String message);

    public void error(String message);
}
