package SkillBuilding;

/*

Program: Distance1.java          Last Date of this Revision: September 15, 2022

Purpose: Outputs total distance of a race

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.text.DecimalFormat;

public class Distance1 {

	public static void main(String[] args) {
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		// Doubles
		double First = 12.2;
		double Sec = 10.6;
		double Third = 5.8;
		double distance = First + Sec + Third;
		
		System.out.println("RACE LENGTH PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nThe length of the race is " + dc.format(distance) + " km long.");
		
	}

}

/* Screen Dump

RACE LENGTH PROGRAM
	
-----------------------------------------
	
The length of the race is 28.6 km long.

 */