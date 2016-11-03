package com.lucafontanili.designpatterns.structural.flyweight;

public class GlyphContext {

    enum FontType {
	BOLD, ITALIC, UNDERLINED;
    }

    private int xVal;
    private int yVal;
    private FontType fontType;

    public GlyphContext(int x, int y, FontType type) {
	this.xVal = x;
	this.yVal = y;
	this.fontType = type;
    }

    public int getxVal() {
	return this.xVal;
    }

    public void setxVal(int xVal) {
	this.xVal = xVal;
    }

    public int getyVal() {
	return this.yVal;
    }

    public void setyVal(int yVal) {
	this.yVal = yVal;
    }

    public FontType getFontType() {
	return this.fontType;
    }

    public void setFontType(FontType fontType) {
	this.fontType = fontType;
    }

    @Override
    public String toString() {
	return new StringBuilder(64).append("xVal: ").append(getxVal()).append(", yVal: ").append(getyVal())
		.append(", fontType: ").append(getFontType()).toString();
    }

}
