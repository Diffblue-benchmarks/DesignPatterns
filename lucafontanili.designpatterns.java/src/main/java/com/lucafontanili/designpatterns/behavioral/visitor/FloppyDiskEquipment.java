package com.lucafontanili.designpatterns.behavioral.visitor;

public class FloppyDiskEquipment extends AbstractEquipment {

    @Override
    public void accept(AbstractEquipmentVisitor visitor) {
	visitor.visitFloppyDisk(this);

    }

}
