package com.vibhavan.abstraction.faculty;

public class Chairman {
    public int collegeRating  = 4;
    private int collegeIncome = 20000;
    int newAdmissions = 300;
    protected int attendance = 20;
    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        System.out.println(chairman.collegeIncome);
        System.out.println(chairman.newAdmissions);
        System.out.println(chairman.collegeRating);
        System.out.println(chairman.attendance);
    }
}
