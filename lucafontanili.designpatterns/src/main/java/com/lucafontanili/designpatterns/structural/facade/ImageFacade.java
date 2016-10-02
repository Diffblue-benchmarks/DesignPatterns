package com.lucafontanili.designpatterns.structural.facade;

import java.io.IOException;

public class ImageFacade {

    private static volatile ImageFacade INSTANCE;

    private ImageFacade() {

    }

    public static ImageFacade getInstance() {
	ImageFacade result = INSTANCE;
	if (result == null) {
	    synchronized (ImageFacade.class) {
		result = INSTANCE;
		if (result == null) {
		    result = INSTANCE = new ImageFacade();
		}
	    }
	}
	return result;
    }

    public void zipImage(String imageName, String outputFile) throws IOException {
	ImageCompressor.compressImage(ImageReader.readImage(imageName), outputFile, imageName);
    }

}
