package com.vibhavan.java_basics;

public class TypeCasting {
    public static void main(String[] args) {
        byte age;
        age = 35;

        int ageValue;
        ageValue = age;

        System.out.println("age after implicit type conversion : " + ageValue);

        int marks;
        marks = 99;

        byte marksValue;
        marksValue = (byte) marks;

        System.out.println("marks after explicit type conversion : " + marksValue);
    }
}
