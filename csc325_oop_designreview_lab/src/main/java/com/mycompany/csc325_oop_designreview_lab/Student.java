/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
//Student class inherits from the Human class
public class Student extends Human {
    //private fields for the class
    private double GPA;
    private double credits;
    //constructor
    public Student(String name, short age) {
        super(name, age);

    }
    //ToString method
    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                ", credits=" + credits +
                '}';
    }
    //getters and setters
    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }


    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getCredits() {
        return this.credits;
    }


    public void setCredits(double credits) {
        this.credits = credits;
    }


}
