package com.lucafontanili.designpatterns.builder;

public class User {

    private static final String SEPARATOR = " ";
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    User(UserBuilder builder) {
	this.firstName = builder.firstName;
	this.lastName = builder.lastName;
	this.age = builder.age;
	this.phone = builder.phone;
	this.address = builder.address;
    }

    public String getFirstName() {
	return this.firstName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public int getAge() {
	return this.age;
    }

    public String getPhone() {
	return this.phone;
    }

    public String getAddress() {
	return this.address;
    }

    @Override
    public String toString() {
	return new StringBuilder(256).append(getFirstName()).append(SEPARATOR).append(getLastName()).append(SEPARATOR)
		.append(getAge()).append(SEPARATOR).append(getPhone()).append(SEPARATOR).append(getAddress())
		.toString();
    }

    public static class UserBuilder {
	final String firstName;
	final String lastName;
	int age;
	String phone;
	String address;

	public UserBuilder(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	}

	public UserBuilder age(int age) {
	    this.age = age;
	    return this;
	}

	public UserBuilder phone(String phone) {
	    this.phone = phone;
	    return this;
	}

	public UserBuilder address(String address) {
	    this.address = address;
	    return this;
	}

	public User build() {
	    User user = new User(this);
	    return user;
	}
    }
}
