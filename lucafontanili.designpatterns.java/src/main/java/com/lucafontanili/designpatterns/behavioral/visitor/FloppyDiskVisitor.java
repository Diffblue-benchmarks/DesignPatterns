package com.lucafontanili.designpatterns.behavioral.visitor;

public class FloppyDiskVisitor extends AbstractEquipmentVisitor {

    private int total = 0;

    public int getTotal() {
	return this.total;
    }

    @Override
    public void visitFloppyDisk(FloppyDiskEquipment floppyDisk) {
	this.total += floppyDisk.getNetPrice();
    }

    @Override
    public void visitChassis(ChassisEquipment chassis) {
	this.total += chassis.getDiscountPrice();

    }

}
