package com.lucafontanili.designpatterns.structural.composite;

import java.io.IOException;

import com.lucafontanili.designpatterns.utilities.AbstractClient;
import com.lucafontanili.designpatterns.utilities.InvalidArgumentException;

public class CompositeClient extends AbstractClient {

    public static void main(String[] args) throws InvalidArgumentException, IOException {
	main(new CompositeClient());

    }

    @Override
    public void run() throws InvalidArgumentException, IOException {
	Employee employee = new Employee(new StringBuilder(16).append("Luca Fontanili").toString(),
		new StringBuilder(16).append("Red Room").toString(),
		new StringBuilder(16).append("Software Engineer").toString());
	employee.setSalary((int) (Math.random() * 100));
	LOGGER.info(new StringBuilder(64).append("Luca's salary: ").append(employee.getSalary()).append("k€"));

	Office office = new Office(new StringBuilder("Cool Office").toString());
	Employee employee1 = new Employee(new StringBuilder(16).append("Luca Fontanili").toString(),
		new StringBuilder(16).append("Red Room").toString(),
		new StringBuilder(16).append("Software Engineer").toString());
	employee1.setSalary(30);

	Employee employee2 = new Employee(new StringBuilder(16).append("Luca Fontanili").toString(),
		new StringBuilder(16).append("Red Room").toString(),
		new StringBuilder(16).append("Software Engineer").toString());
	employee2.setSalary(35);
	office.add(employee1);
	office.add(employee2);

	LOGGER.info(new StringBuilder(128).append(office.getName()).append("'s salary: ").append(office.getSalary())
		.append("k€"));

    }

}
