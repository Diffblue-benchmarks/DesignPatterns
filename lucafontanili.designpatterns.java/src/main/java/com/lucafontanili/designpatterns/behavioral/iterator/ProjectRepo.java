package com.lucafontanili.designpatterns.behavioral.iterator;

public class ProjectRepo implements ContainerInterface {
    public String repoNames[] = { "WebServices", "Back-End", "Front-End", "Scripts" };

    @Override
    public IteratorInterface getIterator() {
	return new RepoIterator();
    }

    private class RepoIterator implements IteratorInterface {

	int index;

	public RepoIterator() {
	}

	@Override
	public boolean hasNext() {

	    if (this.index < ProjectRepo.this.repoNames.length) {
		return true;
	    }
	    return false;
	}

	@Override
	public Object next() {

	    if (this.hasNext()) {
		return ProjectRepo.this.repoNames[this.index++];
	    }
	    return null;
	}
    }

}
