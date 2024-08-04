package com.vibhavan.abstraction;

public class Main {
	public static void main(String[] args) {

		Customer customer1 = new Customer();

		PostGresPepo repository = new PostGresPepo();

		CustomerServiceImpl customerService = new CustomerServiceImpl(repository);
		customerService.addCustomerToDB(customer1);
		customerService.customerDetails(customer1);
	}
}
 