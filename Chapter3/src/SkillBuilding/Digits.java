package SkillBuilding;


/*

Program: Digits.java          Last Date of this Revision: September 14, 2022

Purpose: Outputs digits of a 2 digit number

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("DIGITS PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("Please input a WHOLE, 2 DIGIT NUMBER: \n");
		n = input.nextInt();
		
		int ones = n % 10;
		int tens = (n - ones) / 10;
		
		System.out.println("\nThe number in the ONES digit is " + ones + ", and the number in the TENS digit is " + tens + ".");

	}

}

/* Screen Dump

DIGITS PROGRAM
	
-----------------------------------------
Please input a WHOLE, 2 DIGIT NUMBER: 
	
43
	
The number in the ONES digit is 3, and the number in the TENS digit is 4.

 */