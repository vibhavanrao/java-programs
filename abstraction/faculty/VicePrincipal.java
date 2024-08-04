package com.vibhavan.abstraction.faculty;

import java.sql.SQLOutput;

public class VicePrincipal {
    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        //System.out.println(chairman.collegeIncome); here  the private variable cant be accessed
        System.out.println(chairman.newAdmissions);
        System.out.println(chairman.collegeRating);
    }
}
