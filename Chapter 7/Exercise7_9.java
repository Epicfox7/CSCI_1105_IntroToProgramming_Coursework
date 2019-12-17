/**
Author: John Lopez.
Date: 12/06/2019.
*/

class Exercise7_9 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] num = new double[10];
		
		System.out.print("Enter 10 numbers separated by a space: ");
			for (int i = 0; i < num.length; i++) {
				num[i] = input.nextDouble();
			}
			
		System.out.println("The minimun number is: " + min(num));
		
	}	
	public static double min(double[] array) {
		double min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
		}
		return min;
	}
}
