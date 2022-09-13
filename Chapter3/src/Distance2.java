
/*

Program: Distance2.java          Last Date of this Revision: September 13, 2022

Purpose: Outputs total distance of a race, each segment's length is given by the user

Author: Cayley Zung, 
School: CHHS
Course: Computer Programming 20
 

*/
import java.util.Scanner;

public class Distance2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int first;
		int sec;
		int third;
		
		System.out.println("Input a whole number distance for the first segment (in km): ");
		first = input.nextInt();
		System.out.println("Input a whole number distance for the second segment (in km): ");
		sec = input.nextInt();
		System.out.println("Input a whole number distance for the third segment (in km): ");
		third = input.nextInt();
		
		int distance = first + sec + third;
		
		System.out.println("The distance of your race is " + distance + " km long.");

	}

}
