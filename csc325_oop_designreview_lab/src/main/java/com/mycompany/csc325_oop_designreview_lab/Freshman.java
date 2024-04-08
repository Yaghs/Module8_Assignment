package com.mycompany.csc325_oop_designreview_lab;
//freshman class that inherits from Student
public class Freshman extends Student {
    //constructor that takes in the fields from student
    public Freshman(String name, short age, double credits) {
        super(name, age);
        super.setCredits(credits);
    }
    //ToString method 
    @Override
    public String toString() {
        return "Freshman{" +
                "Name=" + getName() +
                ", Age=" + getAge() +
                ", GPA=" + getGPA() +
                ", Credits=" + getCredits() +
                '}';
    }
}
