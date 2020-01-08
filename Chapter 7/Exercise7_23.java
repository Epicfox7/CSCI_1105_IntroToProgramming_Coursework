/*
Author: John Lopez.
Date: 01/08/2020.
*/
import java.util.Scanner;

class Exercise7_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numlockers = 100;
		boolean[] lockers = new boolean[numlockers];
		
		for(int l = 1; l <= numlockers; l++){
			for(int k = l - 1; k < numlockers; k += l){
				lockers[k] = !lockers[k];
			}
		}
		for(int i = 0;i < numlockers; i++){
			if(lockers[i])
				System.out.println("Locker " + (i + 1) + " is open.");
		}
	}
}
