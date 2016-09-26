package com.lucafontanili.designpatterns.factorymethod;

import java.io.IOException;

import com.lucafontanili.designpatterns.Constants;
import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class FactoryMetodClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new FactoryMetodClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	TraceInterface systemLog = TraceFactory.getTrace(Constants.SYSTEM_TRACE);
	systemLog.error("System error example");
	TraceInterface fileLog = TraceFactory.getTrace(Constants.FILE_TRACE);
	fileLog.error("File error example");
    }

}
