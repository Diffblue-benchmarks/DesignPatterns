package com.lucafontanili.designpatterns.behavioral.templatemethod;

import com.lucafontanili.designpatterns.utilities.Constants;

public class VideoFile extends AbstractFile {

    public VideoFile(String fileName) {
	super(fileName, Constants.MKV_EXTENSION);
    }

    @Override
    public void openPlayer() {
	LOGGER.info(new StringBuilder(32).append("Opening VLC"));
    }

}
