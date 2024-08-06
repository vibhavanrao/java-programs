package com.vibhavan.collections;

public class CustomerService {
    void getCustomerDetails(Customer customer){
        System.out.println("ID: "+customer.getId());
        System.out.println("NAME: "+customer.getName());
        System.out.println("EMAIL: "+customer.getEmail());
    }
}
