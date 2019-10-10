/*
Author: John Lopez.
Date:10/10/2019
*/

import java.util.Scanner;

class _IntroductionToProgramming {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance to drive: ");
		double distance = input.nextDouble();
		System.out.print("Enter the miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter the price per gallon: $");
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = ((distance / milesPerGallon) * pricePerGallon);
		
		System.out.println(("The cost of drivig is: $") + costOfDriving);
	}
}