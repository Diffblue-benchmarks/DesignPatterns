package com.lucafontanili.designpatterns.structural.decorator;

public class BorderDecorator extends AbstractViewDecorator {

    public BorderDecorator(ViewInterface view) {
	super(view);
    }

    @Override
    public void draw() {
	drawBorder(view);
    }

    private void drawBorder(ViewInterface view) {
	view.draw();
	logger.info("Adding border to the view");
    }
}
