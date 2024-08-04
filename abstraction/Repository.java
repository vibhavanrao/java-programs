package com.vibhavan.abstraction;

public interface Repository {
    void connectToDb();

    void addCustomerToDB(Customer customer);
}
