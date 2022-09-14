package SkillBuilding;

/*

Program: Distance1.java          Last Date of this Revision: September 14, 2022

Purpose: Outputs total distance of a race

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Distance1 {

	public static void main(String[] args) {
		
		// Int
		double First = 12.2;
		double Sec = 10.6;
		double Third = 5.8;
		double distance = First + Sec + Third;
		
		System.out.println("RACE LENGTH PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nThe length of the race is " + distance + " km long.");
		
		// IDK why, but these values REFUSE to add up to a tenth, and will INSIST on being .99999 instead
		
	}

}

/* Screen Dump

RACE LENGTH PROGRAM
	
-----------------------------------------
	
The length of the race is 28.599998 km long.

 */