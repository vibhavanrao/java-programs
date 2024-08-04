package com.vibhavan.java_basics;

public class LoopingStatements {
    public static void main(String[] args) {
        System.out.println("here is the list of even number below 20");
        for (byte i = 1; i < 20; i++){
            if (i%2 == 0)
                System.out.println(i);
        }

        System.out.println("here is the list of numbers below 20 except multiples of 3");
        for (byte i = 1; i < 20; i++){
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }


    }
}
