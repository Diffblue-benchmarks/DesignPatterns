package com.lucafontanili.designpatterns.behavioral.visitor;

public class ComputerEquipment extends AbstractEquipment {

    @Override
    public void accept(AbstractEquipmentVisitor visitor) {
	visitor.visitComputerComponent(this);

    }

    @Override
    public String toString() {
	return new StringBuilder(16).append(this.getName()).toString();
    }

}
