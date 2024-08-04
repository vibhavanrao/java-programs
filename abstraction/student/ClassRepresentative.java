package com.vibhavan.abstraction.student;

import com.vibhavan.abstraction.faculty.Chairman;

public class ClassRepresentative extends Chairman {
    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        //System.out.println(chairman.collegeIncome); cant be accessed
        //System.out.println(chairman.newAdmissions); cant be accessed
        ClassRepresentative cr = new ClassRepresentative();
        System.out.println(cr.collegeRating);
        System.out.println(cr.attendance);
    }
}
