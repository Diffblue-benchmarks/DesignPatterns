package com.lucafontanili.designpatterns.structural.proxy;

public class ProxyImage implements ImageInterface {

    private final String fileName;
    private RealImage image;

    public ProxyImage(String fileName) {
	this.fileName = fileName;
    }

    @Override
    public void draw() {
	if (this.image == null) {
	    this.image = new RealImage(this.fileName);
	}
	this.image.draw();
    }

}
