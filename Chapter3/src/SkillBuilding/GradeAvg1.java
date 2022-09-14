package SkillBuilding;

/*

Program: GradeAvg1.java          Last Date of this Revision: September 14, 2022

Purpose: Calculates the grade average

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class GradeAvg1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		int grade5;
		int average;
		
		System.out.println("AVERAGE GRADE PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nInput a WHOLE NUMBER for the FIRST grade: \n");
		grade1 = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER for the SECOND grade: \n");
		grade2 = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER for the THIRD grade: \n");
		grade3 = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER for the FOURTH grade: \n");
		grade4 = input.nextInt();
		System.out.println("\nInput a WHOLE NUMBER for the FIFTH grade: \n");
		grade5 = input.nextInt();
		
		average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
		
		System.out.println("\nThe average of the grades is " + average + ".");
		
		// The program does not round up decimals
		
	}

}
/* Screen Dump

AVERAGE GRADE PROGRAM
	
-----------------------------------------
	
Input a WHOLE NUMBER for the FIRST grade: 
	
99
	
Input a WHOLE NUMBER for the SECOND grade: 
	
100
	
Input a WHOLE NUMBER for the THIRD grade: 
	
100
	
Input a WHOLE NUMBER for the FOURTH grade: 
	
100
	
Input a WHOLE NUMBER for the FIFTH grade: 
	
100
	
The average of the grades is 99.

 */