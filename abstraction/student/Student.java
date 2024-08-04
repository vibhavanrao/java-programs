package com.vibhavan.abstraction.student;

import com.vibhavan.abstraction.faculty.Chairman;

public class Student{
    public static void main(String[] args) {
        Chairman chairman = new Chairman();
        //System.out.println(chairman.collegeIncome);  private
        //System.out.println(chairman.newAdmissions); default
        System.out.println(chairman.collegeRating);
        //System.out.println(chairman.attendance); protected

    }
}
