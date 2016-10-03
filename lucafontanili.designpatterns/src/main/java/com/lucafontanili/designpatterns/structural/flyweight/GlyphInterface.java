package com.lucafontanili.designpatterns.structural.flyweight;

import org.apache.log4j.Logger;

@FunctionalInterface
interface GlyphInterface {

    final Logger logger = Logger.getRootLogger();

    public void draw();
}
