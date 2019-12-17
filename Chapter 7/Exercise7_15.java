/**
Author: John Lopez.
Date: 12/17/2019.
*/

import java.util.Scanner;

class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];

		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextInt();
		}
		// call method
		int[] num2 = eliminateDuplicates(num);
		
		System.out.print("Array without duplicates: ");
		for (int j: num2) {
			if (j > 0)
			System.out.print(" " + j);
		}
		System.out.println();
	}
	
	
	public static int[] eliminateDuplicates(int[] list){
		int[] num2List = new int[list.length];
		int i = 0;
		for (int j: list) {
			if( linearSearch(num2List, j) == -1){
				num2List[i] = j;
				i++;
			}
		}
		return num2List;
	}
	public static int linearSearch(int[] array, int key) {
			for (int i = 0; i < array.length; i++) {
				if (key == array[i])
					return i;
			}
		return -1;
	}
}
