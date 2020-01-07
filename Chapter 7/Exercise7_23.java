/*
Author: John Lopez.
Date: 01/06/2020.
*/
import java.util.Scanner;

class Exercise7_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] lockers = new String[100];
		
		lockerClosed(lockers);
		lockersKey(lockers);
		lockersPrint(lockers);
		
	}
	
	public static boolean lockerOpened(String lockerOpnd){
		return lockerOpnd == "Opened";
	}
	
	public static void lockerClosed(String[] lockers){
		
		for (int i = 0;i < lockers.length; i++){
			lockers[i] = "Closed";
		}
	}
	
	public static void lockersKey(String[] lockers){
		
		int list = 0;
		
		for(int l = 1; l <= lockers.length; l++){
			for(int k = 0; k < lockers.length; k += l){
				if(lockerOpened(lockers[k]))
					lockers[k] = "Closed";
				else
					lockers[k] = "Opened";
				}
			list ++;
		}
	}
	
	public static void lockersPrint(String[] lockers){
		
		for(int i = 0;i < lockers.length; i++){
			if(lockerOpened(lockers[i]))
				System.out.print("Locker " + (i + 1) + " is open.");
			}
		System.out.println();
	}
}
