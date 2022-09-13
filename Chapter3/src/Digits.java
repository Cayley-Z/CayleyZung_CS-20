
/*

Program: Digits.java          Last Date of this Revision: September 13, 2022

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
		
		System.out.println("Please input a whole, 2 digit number: ");
		
		n = input.nextInt();
		int ones = n % 10;
		int tens = (n - ones) / 10;
		
		System.out.println("The number in the ones digit is " + ones + ", and the number in the tens digit is " + tens + ".");

	}

}
