package com.lucafontanili.designpatterns.structural.facade;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;

public class ImageCompressor {

    private static final Logger LOGGER = Logger.getRootLogger();

    private ImageCompressor() {

    }

    public static void compressImage(FileInputStream image, String outputFile, String imageName) throws IOException {
	LOGGER.info(new StringBuilder(16).append("Compressing image"));
	byte[] buffer = new byte[1024];
	try (ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outputFile))) {
	    ZipEntry entry = new ZipEntry(imageName.substring(imageName.lastIndexOf('/') + 1, imageName.length()));
	    out.putNextEntry(entry);
	    int len;
	    while ((len = image.read(buffer)) > 0) {
		out.write(buffer, 0, len);
	    }
	    out.closeEntry();
	    image.close();
	}
	LOGGER.info(new StringBuilder(16).append("Image compressed"));
    }
}
