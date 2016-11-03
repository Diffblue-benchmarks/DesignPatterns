package com.lucafontanili.designpatterns.structural.adapter;

import com.lucafontanili.designpatterns.utilities.Constants;

public class MediaPlayer implements MediaPlayerInterface {

    private final AudioPlayerInterface audioPlayer = new AudioPlayer();

    @Override
    public void play(String fileName) {
	if (Constants.AUDIO_EXTENSIONS.contains(fileName.split("\\.")[1])) {
	    audioPlayer.playSong(fileName);
	} else {
	    LOGGER.info(new StringBuilder(32).append("Playing movie: ").append(fileName).toString());
	}

    }

}
