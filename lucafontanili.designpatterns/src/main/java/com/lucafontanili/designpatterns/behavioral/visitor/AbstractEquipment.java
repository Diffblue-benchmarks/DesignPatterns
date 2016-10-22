package com.lucafontanili.designpatterns.behavioral.visitor;

public abstract class AbstractEquipment {

    protected int netPrice;
    protected int discountPrice;
    protected String name;

    public int getNetPrice() {
	return this.netPrice;
    }

    public void setNetPrice(int price) {
	this.netPrice = price;
    }

    public int getDiscountPrice() {
	return this.discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
	this.discountPrice = discountPrice;
    }

    public String getName() {
	return this.name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public abstract void accept(AbstractEquipmentVisitor visitor);
}
