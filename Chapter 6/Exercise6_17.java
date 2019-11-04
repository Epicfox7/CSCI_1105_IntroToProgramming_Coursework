/*
Author: John Lopez.
Date: 11\4\2019.
*/

import java.util.Scanner;

class Exercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
			int n = input.nextInt();
				printMatrix(n);
	}
		public static void printMatrix(int n) {
			for(int x = 0; x < n; x++) {
				for(int y = 0; y < n; y++){
				
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println(" ");
		}	
	}
}