package com.lucafontanili.designpatterns.structural.decorator;

public abstract class AbstractViewDecorator implements ViewInterface {

    protected final ViewInterface view;

    public AbstractViewDecorator(ViewInterface view) {
	this.view = view;
    }

    @Override
    public void draw() {
	this.view.draw();
    }

}
