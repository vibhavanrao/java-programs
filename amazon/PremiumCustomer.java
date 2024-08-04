package com.vibhavan.amazon;

public class PremiumCustomer  extends Customer{
    String memberShip = "Gold" ;

    public PremiumCustomer() {
        System.out.println("premium customer is called.....");
    }

    public PremiumCustomer(int id, String name, byte age, String phoneNumber, int pinCode, String memberShip) {
        super(id, name, age, phoneNumber, pinCode);
        this.memberShip = memberShip;
        System.out.println("premium customer is called.....");
    }

    void printCustomerDetails(){
        super.printCustomerDetails();
        System.out.println("Membership details : "+ memberShip);
    }
}
