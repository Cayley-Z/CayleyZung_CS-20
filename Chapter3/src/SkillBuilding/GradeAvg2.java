package SkillBuilding;

/*

Program: GradeAvg2.java          Last Date of this Revision: September 14, 2022

Purpose: Outputs fahrenheit temperature in celcius

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class GradeAvg2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int grade;
		int average = 0;
		
		System.out.println("AVERAGE GRADE PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nInput a WHOLE NUMBER for the FIRST grade: \n");
		grade = input.nextInt();
		average += grade;
		System.out.println("\nInput a WHOLE NUMBER for the SECOND grade: \n");
		grade = input.nextInt();
		average += grade;
		System.out.println("\nInput a WHOLE NUMBER for the THIRD grade: \n");
		grade = input.nextInt();
		average += grade;
		System.out.println("\nInput a WHOLE NUMBER for the FOURTH grade: \n");
		grade = input.nextInt();
		average += grade;
		System.out.println("\nInput a WHOLE NUMBER for the FIFTH grade: \n");
		grade = input.nextInt();
		average += grade;

		average = average / 5;
		
		System.out.println("\nThe average of the grades is " + average + ".");

	}

}

/* Screen Dump

	AVERAGE GRADE PROGRAM
	
	-----------------------------------------
	
	Input a WHOLE NUMBER for the FIRST grade: 
	
	50
	
	Input a WHOLE NUMBER for the SECOND grade: 
	
	50
	
	Input a WHOLE NUMBER for the THIRD grade: 
	
	54
	
	Input a WHOLE NUMBER for the FOURTH grade: 
	
	44
	
	Input a WHOLE NUMBER for the FIFTH grade: 
	
	60
	
	The average of the grades is 51.
	
	
	
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