package com.vibhavan.java_basics;

import java.util.Scanner;

public class IsPrimeNumber
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number to be checked : ");
        int number = scanner.nextInt();

        if (isPrime(number))
            System.out.println(number + " is prime number");
        else
            System.out.println(number + " is not a prime number");

    }

    public static boolean isPrime(int n){
        if (n==2)
            return true;
        for (int i=2; i <= Math.sqrt(n); i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
