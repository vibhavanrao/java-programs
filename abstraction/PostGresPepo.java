package com.vibhavan.abstraction;

public class PostGresPepo implements Repository{

    @Override
    public void connectToDb() {
        System.out.println("customer is connected to PostGreSQL successfully");
    }

    @Override
    public void addCustomerToDB(Customer customer) {
        System.out.println("customer is added to PostGreSQL successfully");
    }
}
