package com.lucafontanili.designpatterns;

public class Constants {
    public static final String LOG4J_PROPERTIES = new StringBuilder(32).append("log4j.properties").toString();
    public static final String PROPERTIES_LOAD_ERROR = new StringBuilder(32).append("Error loading properties")
	    .toString();
    public static final String SYSTEM_TRACE = "system";
    public static final String FILE_TRACE = "file";
    public static final String TRACE_LOG = new StringBuilder(32).append("trace.log").toString();

    public static final String MAC_OSX = "Mac OS X";
    public static final String WINDOWS = "Windows XP";
    public static final String OS_NAME = new StringBuilder(32).append("os.name").toString();
}
