package com.lucafontanili.designpatterns.abstractfactory;

public class GUIBuilder {

    private static final String TITLE = "New Window";

    public void buildWindow(AbstractWidgetFactory widgetFactory) {
	Window window = widgetFactory.createWindow();
	window.setTitle(TITLE);
    }
}
