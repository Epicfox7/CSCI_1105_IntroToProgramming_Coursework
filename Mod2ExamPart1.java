/*
Author: John Lopez.	
Date: 10/29/2019

Sample input/output:
	distance = 100,  cost = $5.00
	distance = 500,  cost = $8.00
	distance = 550,  cost = $10.00
	distance = 1000, cost = $12.00
*/
import java.util.Scanner;
class Mod2ExamPart1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cost = 0.0;
		// Insert your code here
		System.out.print("Enter the distance: ");
		int distance = input.nextInt();
		// Each if statement is worth 2 pts
		if(distance <= 100){
			cost = 5.00;
		}
		if(distance > 100){
			if(distance <= 500)
				cost = 8.00;
		}
		if(distance > 500){
			if(distance <= 1000)
				cost = 10.00;
		}		
		if(distance > 1000){
			cost = 12.00;
		}
		// Turn this print statement into a printf statement
		// Distance should be printed without any trailing zeroes
		// Cost should be printed with 2 trailing zeroes
		// The printf statement is worth 2 pts
		System.out.printf("For the package to travel "+ distance + " miles it would cost $%.2f.", cost);
	}
}