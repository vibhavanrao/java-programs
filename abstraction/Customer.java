package com.vibhavan.abstraction;

public class Customer {
	int id;
	String name;
	byte age;
	String phoneNumber;
	int pincode;

	//customer constructor without args
	Customer() {
		System.out.println("customer class is called.....");
		id = 111;
		name = "vibhavan";
		age = 19;
		phoneNumber = "+91 8522890785";
		pincode = 535005;
	}

	//customer constructor with args
	Customer(int id, String name, byte age, String phoneNumber, int pinCode) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.pincode = pinCode;
	}
	
}
