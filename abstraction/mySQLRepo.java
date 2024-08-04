package com.vibhavan.abstraction;

public class mySQLRepo implements Repository{
    @Override
    public void connectToDb() {
        System.out.println("customer is connected to mySQL successfully");
    }

    @Override
    public void addCustomerToDB(Customer customer) {
        System.out.println("customer is added to mySQL successfully");
    }
}
