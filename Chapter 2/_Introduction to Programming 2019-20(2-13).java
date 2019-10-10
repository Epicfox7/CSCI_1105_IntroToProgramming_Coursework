/*
Author: John Lopez.
Date: 10/09/2019.
*/

import java.util.Scanner;

class _IntroductionToProgramming {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double MOUNTHLY_INTEREST_RATE = 0.00417;
		
		System.out.print("Enter the monthly saving amount:$");
		double savingAmount = input.nextDouble();
				
		// First month
		double total = savingAmount * (1 + MOUNTHLY_INTEREST_RATE);
		// Second month
		total = (savingAmount + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Third month 
		total = (savingAmount + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Fourth month
		total = (savingAmount + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Fifth month 
		total = (savingAmount + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Sixth month 
		total = (savingAmount + total) * (1 + MOUNTHLY_INTEREST_RATE);
		
		System.out.println("In the Sixth month the value is $" + total);
	}
}