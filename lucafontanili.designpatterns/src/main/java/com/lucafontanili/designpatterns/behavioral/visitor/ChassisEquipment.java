package com.lucafontanili.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ChassisEquipment extends AbstractEquipment {

    private final List<ComputerEquipment> components = new ArrayList<>();

    public ChassisEquipment() {

    }

    public void addComponent(ComputerEquipment component, int netPrice, int discountPrice, String name) {
	component.setNetPrice(netPrice);
	component.setDiscountPrice(discountPrice);
	component.setName(name);
	this.components.add(component);
    }

    @Override
    public void accept(AbstractEquipmentVisitor visitor) {
	this.components.forEach(component -> {
	    component.accept(visitor);
	});
	visitor.visitChassis(this);
    }

    public List<ComputerEquipment> getComponents() {
	return this.components;
    }
}
