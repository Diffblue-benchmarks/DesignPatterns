package com.lucafontanili.designpatterns.structural.adapter;

public class AudioPlayer implements AudioPlayerInterface {

    @Override
    public void playSong(String trackName) {
	LOGGER.info(new StringBuilder(64).append("Playing track: ").append(trackName).toString());
    }

}
