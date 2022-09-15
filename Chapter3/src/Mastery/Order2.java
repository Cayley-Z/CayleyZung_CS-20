package Mastery;

/*

Program: Order2.java          Last Date of this Revision: September 15, 2022

Purpose: Calculates a fast food order with change

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Order2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		int order;
		double total;
		double change;
		double burger = 1.69;
		double fries = 1.09;
		double soda = 0.99;
		double tax = 0.065;
		
		System.out.println("ORDERING PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.println("\nPlease input how many BURGERS you'd like to order: \n");
		order = input.nextInt();
		total = order * burger;
		
		System.out.println("\nPlease input how many FRIES you'd like to order: \n");
		order = input.nextInt();
		total += order * fries;
		
		System.out.println("\nPlease input how many SODAS you'd like to order: \n");
		order = input.nextInt();
		total += order * soda;
		
		System.out.println("\nHere is your TOTAL BEFORE TAX: $" + dc.format(total));
		tax = total * tax;
		System.out.println("Here is your TAX: $" + dc.format(tax));
		total = total + tax;
		System.out.println("Here is your FINAL TOTAL: $" + dc.format(total));
		
		System.out.println("\nPlease input how much you'll be paying in cash: \n");
		change = input.nextDouble();
		
		System.out.println("\nYou will be paying $" + dc.format(change) + " in cash");
		change = change - total;
		System.out.println("Here is your CHANGE: $" + dc.format(change));
		System.out.println("\nThank you for ordering!");

	}

}

/* Screen Dump

ORDERING PROGRAM

-----------------------------------------

Please input how many BURGERS you'd like to order: 

2

Please input how many FRIES you'd like to order: 

5

Please input how many SODAS you'd like to order: 

5

Here is your TOTAL BEFORE TAX: $13.78
Here is your TAX: $0.90
Here is your FINAL TOTAL: $14.68

Please input how much you'll be paying in cash: 

20

You will be paying $20.00 in cash
Here is your CHANGE: $5.32

Thank you for ordering!



ORDERING PROGRAM

-----------------------------------------

Please input how many BURGERS you'd like to order: 

14

Please input how many FRIES you'd like to order: 

300

Please input how many SODAS you'd like to order: 

24

Here is your TOTAL BEFORE TAX: $374.42
Here is your TAX: $24.34
Here is your FINAL TOTAL: $398.76

Please input how much you'll be paying in cash: 

400

You will be paying $400.00 in cash
Here is your CHANGE: $1.24

Thank you for ordering!

 */