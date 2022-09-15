package Mastery;

/*

Program: Order1.java          Last Date of this Revision: September 15, 2022

Purpose: 

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Order1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int order;
		double total;
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
		
		System.out.println("\nHere is your TOTAL BEFORE TAX: " + total);
		tax = total * tax;
		System.out.println("\nHere is your TAX: " + tax);
		total = total + tax;
		System.out.println("\nHere is your FINAL TOTAL: " + total);
		System.out.println("\nThank you for ordering!");

	}

}
