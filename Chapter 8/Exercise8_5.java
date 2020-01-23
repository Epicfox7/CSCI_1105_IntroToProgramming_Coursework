/*
Author: John Lopez.
Date: 01/15/2020.
*/
import java.util.Scanner;

class Exercise8_5 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		
		System.out.print("Enter matrix1: ");
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				a[i][j] = input.nextDouble();
			}
		}
	
		System.out.print("Enter matrix2: ");
		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b.length ; j++){
				b[i][j] = input.nextDouble();	
			}
		}
		double[][] c = new double [a.length][b.length]; 
		c = addMatrix(a, b);
		
		System.out.print("The matrices are added as follows");
		System.out.println();
		
		for(int i = 0;i < c.length; i++){
			for(int j = 0; j < c.length; j++){
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}
	}
		public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][b.length];
		
		for(int i = 0;i < a.length; i++){ 
			for(int j = 0; j < a.length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}		
		return c;
	}
}	