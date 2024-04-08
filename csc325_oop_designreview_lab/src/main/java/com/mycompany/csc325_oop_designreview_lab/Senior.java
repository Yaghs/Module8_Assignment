package com.mycompany.csc325_oop_designreview_lab;


public class Senior extends Student {
    //Senior class inherits from the student class
    //constructor for the fields for student
    public Senior(String name, short age, double credits) {
        super(name, age);
        //control flow statement: if the credits are not over 85 then throw an exception
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
        //otherwise, set the value given into credits
        super.setCredits(credits);
    }
    //ToString method
    @Override
    public String toString() {
        return "Senior{" +
                "Name=" + getName() +
                ", Age=" + getAge() +
                ", GPA=" + getGPA() +
                ", Credits=" + getCredits() +
                '}';
    }
}
