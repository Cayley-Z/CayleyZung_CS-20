package Mastery;

/*

Program: Change.java          Last Date of this Revision: September 1, 2022

Purpose: Calculates number of coins from cents

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int change;
		int quarter;
		int dime;
		int nickel;
		int penny;
		
		System.out.println("CHANGE PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nInput an amount of CHANGE in CENTS: \n");
		change = input.nextInt();
		
		quarter = change / 25;
		change = change - (quarter * 25);
		dime = change / 10;
		change = change - (dime * 10);
		nickel = change / 5;
		change = change - (nickel * 5);
		penny = change;
		
		System.out.println("\nThe minimum number of coins you can have is: \n");
		System.out.println("\nQuarters: \n\n" + quarter);
		System.out.println("\nDimes: \n\n" + dime);
		System.out.println("\nNickels: \n\n" + nickel);
		System.out.println("\nPennies: \n\n" + penny);

	}

}

/* Screen Dump

CHANGE PROGRAM

-----------------------------------------

Input an amount of CHANGE in CENTS: 

212

The minimum number of coins you can have is: 


Quarters: 

8

Dimes: 

1

Nickels: 

0

Pennies: 

2



CHANGE PROGRAM

-----------------------------------------

Input an amount of CHANGE in CENTS: 

120

The minimum number of coins you can have is: 


Quarters: 

4

Dimes: 

2

Nickels: 

0

Pennies: 

0

 */