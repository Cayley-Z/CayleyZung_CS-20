package SkillBuilding;

/*

Program: Distance2.java          Last Date of this Revision: September 13, 2022

Purpose: Outputs total distance of a race, each segment's length is given by the user

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Distance2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int first;
		int sec;
		int third;
		
		System.out.println("RACE LENGTH PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("Input a WHOLE NUMBER distance for the FIRST segment (in km): \n");
		first = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER distance for the SECOND segment (in km): \n");
		sec = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER distance for the THIRD segment (in km): \n");
		third = input.nextInt();
		
		int distance = first + sec + third;
		
		System.out.println("\nThe distance of your race is " + distance + " km long.");

	}

}

/* Screen Dump

RACE LENGTH PROGRAM
	
-----------------------------------------
Input a WHOLE NUMBER distance for the FIRST segment (in km): 
	
20
	
Input a WHOLE NUMBER distance for the SECOND segment (in km): 
	
3
	
Input a WHOLE NUMBER distance for the THIRD segment (in km): 
	
4
	
The distance of your race is 27 km long.

 */