package com.lucafontanili.designpatterns.behavioral.visitor;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class VisitorClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new VisitorClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	AbstractEquipment floppy = new FloppyDiskEquipment();
	floppy.setNetPrice(10);
	floppy.setDiscountPrice(7);
	FloppyDiskVisitor floppyDiskVisitor = new FloppyDiskVisitor();
	floppy.accept(floppyDiskVisitor);
	LOGGER.info(new StringBuilder(32).append("Total floppy price: ").append(floppyDiskVisitor.getTotal()));

	ChassisEquipment chassis = new ChassisEquipment();
	chassis.addComponent(new ComputerEquipment(), 8, 6, "Bus");
	chassis.addComponent(new ComputerEquipment(), 4, 2, "RAM");
	ChassisVisitor chassisVisitor = new ChassisVisitor();
	chassis.accept(chassisVisitor);
	LOGGER.info(new StringBuilder(32).append("Inventory: ").append(chassisVisitor.getInventory()));

    }

}
