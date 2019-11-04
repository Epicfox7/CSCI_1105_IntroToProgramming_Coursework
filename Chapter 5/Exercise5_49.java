/*
Author: John Lopez.
Date: 11/01/2019.
*/

import java.util.Scanner;

class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a word: ");
		String word = input.nextLine().toUpperCase();
		
		int numOfConsonants = 0;
		int numOfVowels = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' ||
				word.charAt(i) == 'I' || word.charAt(i) == 'O' ||
				word.charAt(i) == 'U') {
					numOfVowels++;	
			}
			else {
				numOfConsonants++;
			}
		
		}// end of for loop
		System.out.println("Your word contains: "+ numOfVowels +" Vowel(s) and "+ numOfConsonants +" Consonant(s).");
		
	}// end of main
}// end of class