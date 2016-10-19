package com.lucafontanili.designpatterns.behavioral.templatemethod;

import com.lucafontanili.designpatterns.utilities.Constants;

public class AudioFile extends AbstractFile {

    public AudioFile(String fileName) {
	super(fileName, Constants.FLAC_EXTENSION);
    }

    @Override
    public void openPlayer() {
	LOGGER.info(new StringBuilder(32).append("Opening iTunes"));
    }

}
