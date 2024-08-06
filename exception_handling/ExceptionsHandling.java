package com.vibhavan.exception_handling;

import java.util.Scanner;

public class ExceptionsHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numerator : ");
        int n1= scanner.nextInt();
        System.out.println("enter the denominator : ");
        int n2=scanner.nextInt();
        try {
            int n3 = n1 / n2;
            System.out.println(n3);
            int[] s={1,2,3,4};
            System.out.println(s[4]);
        }catch(ArithmeticException e){
            System.out.println("denominator should not be zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enter the index in range 0-3");
        }
        System.out.println("hello.....");
    }
}
