package com.lucafontanili.designpatterns.utilities;

public class Constants {

    public static final String LOG4J_PROPERTIES = "log4j.properties";
    public static final String PROPERTIES_LOAD_ERROR = new StringBuilder(32).append("Error loading properties")
	    .toString();
    public static final String SYSTEM_TRACE = "system";
    public static final String FILE_TRACE = "file";
    public static final String TRACE_LOG = new StringBuilder(32).append("trace.log").toString();

    public static final String MAC_OSX = "Mac OS X";
    public static final String WINDOWS = "Windows XP";
    public static final String UBUNTU = "Ubuntu";
    public static final String OS_NAME = new StringBuilder(32).append("os.name").toString();
    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String PDF = "pdf.xml";
    public static final String RTF = "rtf.xml";
    public static final String AUDIO_EXTENSIONS = "mp3;flac";

    private Constants() {

    }
}
