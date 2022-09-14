package SkillBuilding;

/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 14, 2022

Purpose: Outputs total distance of a race

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class TempConverter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double fahren;
		
		System.out.println("FAHRENHEIT TO CELCIUS PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("Input a temperature in FAHRENHEIGHT: \n");
		fahren = input.nextDouble();
		
		double celcius = (fahren - 32)*5/9;
		
		System.out.println("\nYour temperature in CELCIUS is " + celcius + ".");

	}

}

/* Screen Dump

	FAHRENHEIT TO CELCIUS PROGRAM
	
	-----------------------------------------
	Input a temperature in FAHRENHEIGHT: 
	
	66
	
	Your temperature in CELCIUS is 18.88888888888889.
	
	
	
	FAHRENHEIT TO CELCIUS PROGRAM
	
	-----------------------------------------
	Input a temperature in FAHRENHEIGHT: 
	
	0
	
	Your temperature in CELCIUS is -17.77777777777778.

 */