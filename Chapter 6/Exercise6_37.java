/*
Author: John Lopez.
Date: 11/7/2019.
*/
import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
				
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		System.out.println();
		System.out.print(number + " to width " + width + " is: " + format(number, width) + ".");
		
	}// end of main method.
	
	public static String format(int number, int width){
		String stringNum = number + "";
			
			if (width < stringNum.length()){
				return stringNum;			
			}// if.		
			else {
				int length = stringNum.length();
				for (int i = 0; i < (width - length); i++) {
					stringNum = "0" + stringNum;
				}// for loop.
			}// else.
			return stringNum;	
	}// end of format method.	
}// end of class.
