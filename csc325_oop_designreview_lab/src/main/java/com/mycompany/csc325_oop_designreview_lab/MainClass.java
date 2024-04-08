/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		//  creates instances of Freshman and Senior
		Freshman freshman = new Freshman("James", (short)20, 12); // Assuming 'credits' is part of the constructor
		Senior senior = new Senior("John", (short)30, 90); // Assuming 'credits' is part of the constructor

		// Uses Scanner to get GPA input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for the student: ");
		double gpa = scanner.nextDouble();

		//  Setting GPA for freshman and senior (replace with the correct logic as needed)
		freshman.setGPA(gpa);
		senior.setGPA(gpa);

		// Output
		System.out.println(freshman);
		System.out.println(senior);

		//closes the scanner to prevent resource leaks
		scanner.close();
	}
}

