package com.vibhavan.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetImplementation {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("customer 1");
        customer1.setEmail("customer1@gmail.com");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("customer 2");
        customer2.setEmail("customer2@gmail.com");

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setName("customer 3");
        customer3.setEmail("customer3@gmail.com");

        Customer customer4 = new Customer();
        customer4.setId(3);
        customer4.setName("customer 4");
        customer4.setEmail("customer3@gmail.com");

        LinkedHashSet<Customer> customerSet = new LinkedHashSet<>();
        customerSet.add(customer1);
        customerSet.add(customer2);
        customerSet.add(customer3);
        customerSet.add(customer4);

        System.out.println(customerSet);
        System.out.println(customerSet.size());

    }

}
