package SkillBuilding;

/*

Program: CircleCircumference.java          Last Date of this Revision: September 14, 2022

Purpose: Outputs the circumference of a circle

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius;
		double circ;
		double pi = 3.141592653589793d;	// Y'know.. For accuracy :D
		
		System.out.println("CIRCLE CIRCUMFERENCE PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nInput a number for the RADIUS of the circle: \n");
		radius = input.nextDouble();
		
		circ = 2*radius*pi;
		
		System.out.println("\nThe circimference of your circle is " + circ + ".");

	}

}
/* Screen Dump

CIRCLE CIRCUMFERENCE PROGRAM
	
-----------------------------------------
	
Input a number for the RADIUS of the circle: 

7.2

The circimference of your circle is 45.23893421169302.

*/