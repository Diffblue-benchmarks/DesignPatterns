package com.lucafontanili.designpatterns.factorymethod;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.lucafontanili.designpatterns.Constants;

public class FileTrace implements TraceInterface {

    private PrintWriter pw;
    private boolean debug;

    public FileTrace() throws IOException {
	this.pw = new PrintWriter(new FileWriter(Constants.TRACE_LOG));
    }

    @Override
    public void setDebug(boolean debug) {
	this.debug = debug;
    }

    @Override
    public void debug(String message) {
	if (this.debug) {
	    this.pw.println("DEBUG: " + message);
	    this.pw.flush();
	}
    }

    @Override
    public void error(String message) {
	this.pw.println("ERROR: " + message);
	this.pw.flush();
    }

}
