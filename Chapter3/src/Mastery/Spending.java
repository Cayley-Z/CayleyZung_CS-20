package Mastery;

/*

Program: Spending.java          Last Date of this Revision: September 15, 2022

Purpose: 

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
		
		System.out.print("\nCATEGORIES        BUDGET\n");
		
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		System.out.print("\nFood              " + food);
		
	}

}
