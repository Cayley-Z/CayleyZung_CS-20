package Mastery;

/*

Program: Digits.java          Last Date of this Revision: September 15, 2022

Purpose: Outputs digits of a 3 digit number

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
		System.out.println("Please input a WHOLE, 3 DIGIT NUMBER: \n");
		n = input.nextInt();
		
		int ones = n % 10;
		n = n - ones;
		int tens = (n % 100) / 10;
		n = n - tens;
		int hundreds = n / 100;
		
		System.out.println("\nThe number in the ONES digit is " + ones + ".");
		System.out.println("The number in the TENS digit is " + tens + ".");
		System.out.println("The number in the HUNDREDS digit is " + hundreds + ".");

	}

}

/* Screen Dump

DIGITS PROGRAM

-----------------------------------------
Please input a WHOLE, 3 DIGIT NUMBER: 

321

The number in the ONES digit is 1.
The number in the TENS digit is 2.
The number in the HUNDREDS digit is 3.



DIGITS PROGRAM

-----------------------------------------
Please input a WHOLE, 3 DIGIT NUMBER: 

456

The number in the ONES digit is 6.
The number in the TENS digit is 5.
The number in the HUNDREDS digit is 4.

 */