package com.lucafontanili.designpatterns.structural.flyweight;

public class GlyphCharacter implements GlyphInterface {

    private final GlyphContext context;
    private final Character c;

    GlyphCharacter(GlyphContext context, Character c) {
	this.context = context;
	this.c = c;
    }

    public GlyphContext getContext() {
	return this.context;
    }

    public char getCharacter() {
	return this.c.charValue();
    }

    @Override
    public void draw() {
	logger.info(new StringBuilder(64).append("Drawing character ").append(getCharacter()).append(" in context ")
		.append(getContext()));
    }

}
