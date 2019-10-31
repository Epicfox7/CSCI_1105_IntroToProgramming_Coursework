/*
Author: John Lopez.
Date: 10/31/2019.
*/

class Exercise5_11 {
	public static void main(String[] args) {
		int i = 0;
		
		for (int number = 100; number < 200; number++) {
			if (number % 5 == 0 ^ number % 6 == 0){
				System.out.print(number + " ");
				i++; 
				if (i % 10 == 0 && i != 0) {
					System.out.println();
				} 
			}
		}
	}
}