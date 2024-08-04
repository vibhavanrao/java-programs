package com.vibhavan.java_basics;

import java.util.Scanner;

public class NearestPrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is the nearest prime number");
            System.exit(0);
        }

        int n;
        byte flag=0;
        if (number%6 > 1)
            n=(number/6)+1;
        else {
            n = (number / 6);
            flag = 1;
        }

        while (true){
            if (isPrime((6*n)-1) ){
                if (flag == 1) {
                    flag = 0;
                }
                else{
                    int  z = ((6*n)-1);
                    System.out.println("the nearest prime Number is " + z);
                    System.exit(0);
                }
            }
            if (isPrime((6*n)+1)) {
                System.out.println("the nearest prime Number is " + ((6*n)+1));
                System.exit(0);
            }
            n+=1;
        }
    }
    public static boolean isPrime(int n){
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
