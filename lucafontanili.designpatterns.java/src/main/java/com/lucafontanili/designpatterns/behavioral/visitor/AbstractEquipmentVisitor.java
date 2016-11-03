package com.lucafontanili.designpatterns.behavioral.visitor;

import org.apache.log4j.Logger;

public abstract class AbstractEquipmentVisitor {

    protected static final Logger LOGGER = Logger.getRootLogger();

    public abstract void visitFloppyDisk(FloppyDiskEquipment floppyDisk);

    public abstract void visitChassis(ChassisEquipment chassis);

    public void visitComputerComponent(ComputerEquipment computerEquipment) {

	LOGGER.info(new StringBuilder(32).append("Added ").append(computerEquipment.getName()));

    }
}
