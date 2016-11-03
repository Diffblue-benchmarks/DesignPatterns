package com.lucafontanili.designpatterns.behavioral.iterator;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class IteratorClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new IteratorClient());
    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	ProjectRepo projectRepository = new ProjectRepo();

	for (IteratorInterface iter = projectRepository.getIterator(); iter.hasNext();) {
	    String name = (String) iter.next();
	    LOGGER.info(new StringBuilder(32).append("Repository name: ").append(name));
	}

    }

}
