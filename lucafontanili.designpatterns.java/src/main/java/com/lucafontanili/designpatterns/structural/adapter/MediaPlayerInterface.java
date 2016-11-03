package com.lucafontanili.designpatterns.structural.adapter;

import org.apache.log4j.Logger;

@FunctionalInterface
public interface MediaPlayerInterface {
    final Logger LOGGER = Logger.getRootLogger();

    public void play(String fileName);
}
