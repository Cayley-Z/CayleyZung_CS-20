package Mastery;

/*

Program: Spending.java          Last Date of this Revision: September 16, 2022

Purpose: Calculates percent of budget from money spent

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Spending {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		double total;
		double food;
		double cloth;
		double enter;
		double rent;
		double repair;
		double gas;
		
		System.out.println("SPENDING PROGRAM\n");
		System.out.println("-----------------------------------------");
		System.out.print("\nPlease how much you spend on FOOD: ");
		food = input.nextDouble();
		System.out.print("\nPlease how much you spend on CLOTHING: ");
		cloth = input.nextDouble();
		System.out.print("\nPlease how much you spend on ENTERTAINMENT: ");
		enter = input.nextDouble();
		System.out.print("\nPlease how much you spend on RENT: ");
		rent = input.nextDouble();
		System.out.print("\nPlease how much you spend on REPAIRS: ");
		repair = input.nextDouble();
		System.out.print("\nPlease how much you spend on GAS/TRANSPORTATION: ");
		gas = input.nextDouble();
		
		total = food + cloth + enter + rent + repair + gas;
		food = (food / total) * 100;
		cloth = (cloth / total) * 100;
		enter = (enter / total) * 100;
		rent = (rent / total) * 100;
		repair = (repair / total) * 100;
		gas = (gas / total) * 100;
		
		System.out.print("\n\nCATEGORIES         BUDGET\n");
		
		System.out.print("\nFood               " + dc.format(food) + "%");
		System.out.print("\nClothing           " + dc.format(cloth) + "%");
		System.out.print("\nEntertainment      " + dc.format(enter) + "%");
		System.out.print("\nRent               " + dc.format(rent) + "%");
		System.out.print("\nRepairs            " + dc.format(repair) + "%");
		System.out.print("\nGas/Transportation " + dc.format(gas) + "%");
		
	}

}

/* Screen Dump

SPENDING PROGRAM

-----------------------------------------

Please how much you spend on FOOD: 350

Please how much you spend on CLOTHING: 300

Please how much you spend on ENTERTAINMENT: 200

Please how much you spend on RENT: 1250

Please how much you spend on REPAIRS: 0

Please how much you spend on GAS/TRANSPORTATION: 0


CATEGORIES         BUDGET

Food               16.67%
Clothing           14.29%
Entertainment      9.52%
Rent               59.52%
Repairs            0.00%
Gas/Transportation 0.00%



SPENDING PROGRAM

-----------------------------------------

Please how much you spend on FOOD: 300

Please how much you spend on CLOTHING: 40

Please how much you spend on ENTERTAINMENT: 50

Please how much you spend on RENT: 1500

Please how much you spend on REPAIRS: 0

Please how much you spend on GAS/TRANSPORTATION: 90


CATEGORIES         BUDGET

Food               15.15%
Clothing           2.02%
Entertainment      2.53%
Rent               75.76%
Repairs            0.00%
Gas/Transportation 4.55%

*/