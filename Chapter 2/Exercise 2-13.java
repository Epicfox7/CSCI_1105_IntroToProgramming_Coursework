/*
Author: John Lopez.
Date: 10/09/2019.
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final double MOUNTHLY_INTEREST_RATE = 0.00417;
		
		System.out.print("Enter the monthly saving amount:$");
		double savingAmount = input.nextDouble();
				
		// First month the value in the account.
		double total = 100 * (1 + MOUNTHLY_INTEREST_RATE);
		// Second month the value in the account.
		total = (100 + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Third month the value in the account.
		total = (100 + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Fourth month the value in the account.
		total = (100 + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Fifth month the value in the account.
		total = (100 + total) * (1 + MOUNTHLY_INTEREST_RATE);
		// Sixth month the value in the account.
		total = (100 + total) * (1 + MOUNTHLY_INTEREST_RATE);
		
		System.out.println("In the Sixth month the value is $" + total);
	}
}