package com.lucafontanili.designpatterns.behavioral.iterator;

public class ProjectRepo implements ContainerInterface {
    protected static final String[] REPO_NAMES = { "WebServices", "Back-End", "Front-End", "Scripts" };

    @Override
    public IteratorInterface getIterator() {
	return new RepoIterator();
    }

    private class RepoIterator implements IteratorInterface {

	int index;

	@Override
	public boolean hasNext() {

	    if (this.index < REPO_NAMES.length) {
		return true;
	    }
	    return false;
	}

	@Override
	public Object next() {

	    if (this.hasNext()) {
		return REPO_NAMES[this.index++];
	    }
	    return null;
	}
    }

}
