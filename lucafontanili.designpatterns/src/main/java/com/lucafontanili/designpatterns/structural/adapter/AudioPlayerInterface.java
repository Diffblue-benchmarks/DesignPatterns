package com.lucafontanili.designpatterns.structural.adapter;

import org.apache.log4j.Logger;

@FunctionalInterface
public interface AudioPlayerInterface {

    final Logger LOGGER = Logger.getRootLogger();

    public void playSong(String trackName);
}
