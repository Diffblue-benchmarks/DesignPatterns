package com.lucafontanili.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ChassisVisitor extends AbstractEquipmentVisitor {

    private final List<ComputerEquipment> inventory = new ArrayList<>();

    public List<ComputerEquipment> getInventory() {
	return this.inventory;
    }

    @Override
    public void visitFloppyDisk(FloppyDiskEquipment floppyDisk) {
	// unused method
    }

    @Override
    public void visitChassis(ChassisEquipment chassis) {
	this.inventory.addAll(chassis.getComponents());
    }

}
