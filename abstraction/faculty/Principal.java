package com.vibhavan.abstraction.faculty;

public class Principal extends Chairman {

    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        //System.out.println(chairman.collegeIncome); here it cant be accessed as it is a private variable
        System.out.println(chairman.newAdmissions);
        System.out.println(chairman.collegeRating);
    }

}
