package com.vibhavan.amazon;

public class RegularCustomer extends Customer {

    int cashbackPonits = 200;

    public RegularCustomer() {
        System.out.println("regular customer is called.....");
    }

    public RegularCustomer(int id, String name, byte age, String phoneNumber, int pinCode, int cashbackPonits) {
        super(id, name, age, phoneNumber, pinCode);
        this.cashbackPonits = cashbackPonits;
    }

    void printCustomerDetails(){
        super.printCustomerDetails();
        System.out.println("cadhback points : "+ cashbackPonits);
    }
}
