package com.lucafontanili.designpatterns.structural.decorator;

import org.apache.log4j.Logger;

@FunctionalInterface
interface ViewInterface {

    final Logger logger = Logger.getRootLogger();

    public void draw();

}
