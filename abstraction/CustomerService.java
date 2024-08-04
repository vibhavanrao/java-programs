package com.vibhavan.abstraction;

public abstract class CustomerService {

    abstract void  addCustomerToDB(Customer customer);

    void customerDetails(Customer customer){
        System.out.println("ID: "+customer.id);
        System.out.println("NAME: "+customer.name);
        System.out.println("AGE : "+customer.age);
        System.out.println("PHONE NUMBER : "+customer.phoneNumber);
    }
}

