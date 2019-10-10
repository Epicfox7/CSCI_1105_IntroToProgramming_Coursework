/* 
Author: John Lopez
Date: 10/09/2019
*/

import java.util.Scanner;

class _IntroductionToProgramming {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("We are going to convert and calculate Celsius to Fahrenheit!");
		System.out.println(" ");
		System.out.print("Enter the degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = 9.0/5 * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit
				+ " Fahrenheit");
	}
}