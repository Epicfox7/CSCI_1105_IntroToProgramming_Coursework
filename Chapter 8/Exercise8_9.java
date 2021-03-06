/*
Author: John Lopez.
Date: 01/23/2020.
*/

import java.util.Scanner;

class Exercise8_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] tictactoe = new String[][]{{" ", " ", " "},
											{" ", " ", " "},
											{" ", " ", " "}};								
																	
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < tictactoe.length; j++) {
				System.out.print("\n-------------\n|");
				for(int k = 0; k < tictactoe.length; k++) {
					System.out.print(" " + tictactoe[j][k] + " |");	
				}
			}
			System.out.println("\n-------------");
			System.out.println();
			
				if (i % 2 == 0){
					System.out.print("Enter a row (0, 1, or 2) for player X: ");
					int rowX = input.nextInt();
					System.out.print("Enter a column (0, 1, or 2) for player X: ");
					int columnX = input.nextInt();
					
					while ("O".equals(tictactoe[rowX][columnX])){
						System.out.print("\nThat spot has already been taken by player O,please use another spot!\n");
						System.out.print("\nEnter a row (0, 1, or 2) for player X: ");
						rowX = input.nextInt();
						System.out.print("Enter a column (0, 1, or 2) for player X: ");
						columnX = input.nextInt();
						
						if("O" != tictactoe[rowX][columnX]){
							continue;
						}
						tictactoe[rowX][columnX] = "O";
					}
						
					while ("X".equals(tictactoe[rowX][columnX])){
							System.out.print("\nThat spot has already been taken, please use another spot!\n");
							System.out.print("\nEnter a row (0, 1, or 2) for player X: ");
							rowX = input.nextInt();
							System.out.print("Enter a column (0, 1, or 2) for player X: ");
							columnX = input.nextInt();
							
						if("X" != tictactoe[rowX][columnX]){
							continue;
						}
					}
					tictactoe[rowX][columnX] = "X";
					
				}
				
				else {
					System.out.print("Enter a row (0, 1, or 2) for player O: ");
					int rowO = input.nextInt();
					System.out.print("Enter a column (0, 1, or 2) for player O: ");
					int columnO = input.nextInt();
										
						while ("X".equals(tictactoe[rowO][columnO])){
							System.out.print("\nThat spot has already been taken by player X, please use another spot!\n");
							System.out.print("\nEnter a row (0, 1, or 2) for player O: ");
							rowO = input.nextInt();
							System.out.print("Enter a column (0, 1, or 2) for player O: ");
							columnO = input.nextInt();
							
							
							if ("X" != tictactoe[rowO][columnO]){
								continue;
							}
							tictactoe[rowO][columnO] = "X";
						}
						
						while ("O".equals(tictactoe[rowO][columnO])){
							System.out.print("\nThat spot has already been taken, please use another spot!\n");
							System.out.print("\nEnter a row (0, 1, or 2) for player O: ");
							rowO = input.nextInt();
							System.out.print("Enter a column (0, 1, or 2) for player O: ");
							columnO = input.nextInt();
							
							if ("O" != tictactoe[rowO][columnO]){
								continue;
							}	
						}
					tictactoe[rowO][columnO] = "O";
				}
		}
			for(int j = 0; j < tictactoe.length; j++) {
				System.out.print("\n-------------\n|");
				for(int k = 0; k < tictactoe.length; k++) {
					System.out.print(" " + tictactoe[j][k] + " |");
				}
			}
		System.out.print("\n-------------");
	}
}
