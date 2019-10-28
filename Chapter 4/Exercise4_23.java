/*
Author: John Lopez.
Date: 28/10/2019.
*/

import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter the number of hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Enter the hourly pay rate: $");
		double hourlypay = input.nextDouble();
		System.out.print("Enter the federal tax withholding rate: ");
		double ftaxrate = input.nextDouble();
		System.out.print("Enter the state tax withholding rate: ");
		double staxrate = input.nextDouble();
		
		double grosspay = hours * hourlypay;
		double ftaxrate2 = grosspay * ftaxrate;
		double staxrate2 = grosspay * staxrate;
		double totaldeduction = ftaxrate2 + staxrate2;	
		double netpay = grosspay - totaldeduction;	
		
		System.out.println(" ");
		System.out.println("Employee Name: "+ name);
		System.out.println("Hours Worked: "+ hours);
		System.out.printf("Pay Rate: $%4.2f\n", hourlypay);
		System.out.printf("Gross Pay: $%4.2f\n", grosspay);
		System.out.println("Deductions:");
		System.out.println("	Federal Withholding (20.0%): $"+ ftaxrate2);
		System.out.println("        State Withholding (9.0%): $"+ staxrate2);
		System.out.printf("        Total Deduction: $%4.2f\n", totaldeduction);
		System.out.printf("Net Pay: $%4.2f\n ", netpay);							
	}
}
