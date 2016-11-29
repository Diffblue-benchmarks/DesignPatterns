package com.lucafontanili.designpatterns.structural.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class ImageReader {

    private static final Logger LOGGER = Logger.getRootLogger();

    private ImageReader() {

    }

    public static FileInputStream readImage(String imageName) throws FileNotFoundException {
	LOGGER.info(new StringBuilder(32).append("Reading image ").append(imageName));
	try {
	    return new FileInputStream(imageName);
	} catch (FileNotFoundException e) {
	    LOGGER.error(new StringBuilder(256).append("Caught exception").toString(), e);
	    throw e;
	}
    }

}
