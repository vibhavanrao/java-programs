package com.vibhavan.amazon;

public class Main {
    public static void main(String[] args) {
        PremiumCustomer customer1 = new PremiumCustomer(1,"uttej",(byte)16,"85229785",53505,"Gold");

        RegularCustomer customer2 = new RegularCustomer(2,"teja",(byte)20,"85220885",53505,200);

        Customer customer3 = new Customer(1,"customer1",(byte)40,"85289785",53505);

        CustomerService customerService = new CustomerService();
        customerService.printCustomerDetails(customer3);

    }
}