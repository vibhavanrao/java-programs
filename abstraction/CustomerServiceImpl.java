package com.vibhavan.abstraction;

public class CustomerServiceImpl extends CustomerService{

    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addCustomerToDB(Customer customer) {
        repository.connectToDb();
        repository.addCustomerToDB(customer);
    }
}
