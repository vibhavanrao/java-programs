package com.vibhavan.java_basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number : ");
        int number=scanner.nextInt();

        if (number%2 == 0)
            System.out.println(number + " is even number");
        else
            System.out.println(number + " is odd number");
    }
}
