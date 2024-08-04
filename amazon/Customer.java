package com.vibhavan.amazon;

public class Customer {

    int id;
    String name;
    byte age;
    String phoneNumber;
    int pincode;

    //customer constructor without args
    Customer() {
        System.out.println("customer class is called.....");
        id = 111;
        name = "vibhavan";
        age = 19;
        phoneNumber = "+91 8522890785";
        pincode = 535005;
    }

    //customer constructor with args
    Customer(int id, String name, byte age, String phoneNumber, int pinCode) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.pincode = pinCode;
    }

    /*
    here this method do not take any arguments and do not return any value
    here this method is used to print the values
    */
    void printCustomerDetails() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone number : " + phoneNumber);
        System.out.println("Pincode : " + pincode);
    }

    /*
    this method is used to check the availavbility in the given area

    */
    void checkAvailability(int pincode) {
        System.out.println("delivery is available for the address with pincode " + pincode);
    }

    /*
    method to check the discount percentage for the customers based on their age
    age : 15-30 discount percentage = 30%
    age : 30-60 discount percentage = 40%
    age > 60 discount percentage = 60%
     */

    byte discountPercentage() {
        byte discountPercentage;
        if (age > 60) {
            discountPercentage = 60;
        } else if (age > 30) {
            discountPercentage = 40;
        } else if (age > 15) {
            discountPercentage = 30;
        } else {
            discountPercentage = 0;
        }
        return discountPercentage;
    }

    /*
    this method takes the original price as the input and returns the final price after the discount is applied
     */
    double prizeAfterDiscount(int price) {

        double finalPrice;
        double discountPercentage = discountPercentage();
        finalPrice = ((1 - discountPercentage / 100) * price);

        return finalPrice;

    }
}
