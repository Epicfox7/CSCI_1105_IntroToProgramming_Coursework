/*
Author: John Lopez.
Date: 01/21/2020.

Alabama = Montgomery
Alaska = Juneau
Arizona = Phoenix
Idaho = Boise
Texas = Austin
Georgia = Atlanta
California = Sacramento
Colorado = Denver
Florida = Tallahassee
Hawaii = Honolulu
*/
import java.util.Scanner;
class Exercise8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			String[][] capital1 = {{"Alabama", "Montgomery"},
									{"Alaska", "Juneau"},
									{"Arizona", "Phoenix"},
									{"Idaho", "Boise"},
									{"Texas", "Austin"},
									{"Georgia", "Atlanta"},
									{"California", "Sacramento"},
									{"Colorado", "Denver"},
									{"Florida", "Tallahassee"},
									{"Hawaii", "Honolulu"}};
			String userInput = "";
			int correctCount = 0;
			
			System.out.print("Guess the capital of each State!");
			System.out.println();
			System.out.println();
			
			for(int i = 0; i < capital1.length; i++){
				
				System.out.print("What is the capital of " + capital1[i][0] + "?: ");//#1
				userInput = input.next();
				
				if(userInput.equals(capital1[i][1])){ // .equals is used to compare strings unlike integers with ==
					System.out.print("Your answer is correct!");
					correctCount++;
					System.out.println();
					System.out.print("The correct count is: " + correctCount);
					System.out.println();
					
				}
				else{
					System.out.print("The correct answer should be " + capital1[i][1] + " ...");
					System.out.println();
					System.out.print("The correct count is: " + correctCount);
					System.out.println();
				}	
		
			}// end of for loop
		System.out.println();
		System.out.print("Your final score is " + correctCount + "/" + capital1.length + ".");
	}// end of main
}// end of class