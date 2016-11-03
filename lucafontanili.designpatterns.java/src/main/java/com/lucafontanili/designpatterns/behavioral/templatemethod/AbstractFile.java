package com.lucafontanili.designpatterns.behavioral.templatemethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public abstract class AbstractFile {

    protected final String fileName;
    protected final String extension;
    protected final Map<String, AbstractFile> files = new ConcurrentHashMap<>();
    protected static final Logger LOGGER = Logger.getRootLogger();

    protected AbstractFile(String fileName, String extension) {
	this.fileName = fileName;
	this.extension = extension;
    }

    public String getFileName() {
	return this.fileName;
    }

    public abstract void openPlayer();

    public void play() {

	LOGGER.info(new StringBuilder(32).append("Playing ").append(this.fileName).append(this.extension));
    }

    public void open() {
	openPlayer();
	play();
    }

}
