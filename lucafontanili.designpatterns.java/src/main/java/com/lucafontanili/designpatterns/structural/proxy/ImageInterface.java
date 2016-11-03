package com.lucafontanili.designpatterns.structural.proxy;

import org.apache.log4j.Logger;

interface ImageInterface {

    final Logger logger = Logger.getRootLogger();

    public void draw();

}
