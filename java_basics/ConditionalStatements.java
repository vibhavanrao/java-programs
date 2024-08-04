package com.vibhavan.java_basics;

public class ConditionalStatements {
    public static void main(String[] args) {
        int price;
        price = 30000;

        byte discount;
        discount = 0;

        int discountPrice;

        int finalPrice;

        char membership;
        membership = 'D';

        String brand;
        brand = "lenovo";

        switch (brand) {
            case "lenovo":
                if (membership == 'D')
                    discount = 40;
                else if (membership == 'G')
                    discount = 30;
                else if (membership == 'S')
                    discount = 20;
                else
                    discount = 10;
                break;

            case "samsung":
                if (membership == 'D')
                    discount = 30;
                else if (membership == 'G')
                    discount = 20;
                else if (membership == 'S')
                    discount = 10;
                else
                    discount = 5;
                break;

            default:
                discount = 5;
        }

        discountPrice = (discount * price) / 100;

        finalPrice = price - discountPrice;

        System.out.println("price after discount applied : $" + finalPrice);
    }
}
