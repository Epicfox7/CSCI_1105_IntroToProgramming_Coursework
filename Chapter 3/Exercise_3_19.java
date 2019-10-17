/*
Author: John Lopez
Date: 10/17/2019
*/

import java.util.Scanner;

class Exercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length of first side of triangle:");
		double s1 = input.nextDouble();
		System.out.println("Enter length of second side of triangle:");
		double s2 = input.nextDouble();
		System.out.println("Enter length of third side of triangle:");
		double s3 = input.nextDouble();
		
		double perimeter = s1 + s2 + s3;
		
		if(perimeter != 15) {
			System.out.println("Invalid Triagle");
		}
			else{
				System.out.println("Valid Triagle");
			}	
			
		System.out.println("Perimeter of triangle:" + perimeter);
	}
}