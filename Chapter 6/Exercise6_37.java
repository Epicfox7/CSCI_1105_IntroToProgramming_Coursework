/* 
Author: John Lopez.
Date: 11/6/2019.
*/

import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.println();
		System.out.println(number + " to width " + width + ": " + format(number, width)+ ".");
		
	}
	
	public static String format(int number, int width) {
			String format = number + "";
			
			for (int i = width - format.length(); i > 0; i--) {
				format = 0 + format;
				if (number > width) {
				}
			}
		return format;
	}
}