/*
author: John Lopez.
Date: 10/17/2019.
*/

import java.util.Scanner;

class Exercise_3_19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first edge of the triangle: ");
		double edge1 = input.nextDouble();
		System.out.println("Enter the second edge of the triangle: ");
		double edge2 = input.nextDouble();
		System.out.println("Enter the third edge of the triangle: ");
		double edge3 = input.nextDouble();
		
		double perimeter = edge1 + edge2 + edge3;

		
		if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2)
			&& ((edge2 + edge1) > edge3) && ((edge2 + edge3) > edge1)
			&& ((edge3 + edge2) > edge1) && ((edge3 + edge1) > edge2)){
			
			System.out.println(" ");
			System.out.println("Valid perimeter.");
			System.out.println(" ");		
			System.out.println("The perimeter of the triangle is : " + perimeter);
		}
			else{
				
				System.out.println("Error: Invalid perimeter!.");
			}
	}
}