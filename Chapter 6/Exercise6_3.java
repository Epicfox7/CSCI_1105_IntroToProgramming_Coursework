/*
Author: John Lopez.
Date: 11/6/2019.
*/

import java.util.Scanner;
class Exercise6_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
				
		if (isPalindrome(number)) {
			System.out.println(number + " is a Palindrome.");
		}
		else{
			System.out.println(number + " is not a Palindrome.");
		}
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	public static int reverse(int number) {
		int reverse = 0;
		
		while (number != 0) {
			reverse = (reverse * 10) + number % 10;
			number = number / 10;
		}
		return reverse;
	}
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number){
		return (number == reverse(number));
		
	}
}
