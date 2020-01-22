import java.util.Scanner;

class Exercise8_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] tictactoe = new String[3][3];
		
		for(int i = 0; i < tictactoe.length; i++){
			for(int j = 0; j < tictactoe.length; j++){
				
		System.out.print("Enter a row (0, 1, or 2) for player X: ");
		int rowX = input.nextInt();
		System.out.print("Enter a column (0, 1, or 2) for player X: ");
		int columnX = input.nextInt();
		
		if(rowX == 0 & columnX == 0){
			System.out.println("——————-——————");
			System.out.println("| X |   |   |"); 
			System.out.println("——————-——————");
			System.out.println("|   |   |   |");
			System.out.println("——————-——————");
			System.out.println("|   |   |   |");
			System.out.println("——————-——————");
		}
		
		System.out.print("Enter a row (0, 1, or 2) for player O: ");
		int rowO = input.nextInt();
		System.out.print("Enter a column (0, 1, or 2) for player O: ");
		int columnO = input.nextInt();
		
		if(rowO == 0 & columnO == 1){
			System.out.println("——————-——————");
			System.out.println("|   | O |   |"); 
			System.out.println("——————-——————");
			System.out.println("|   |   |   |");
			System.out.println("——————-——————");
			System.out.println("|   |   |   |");
			System.out.println("——————-——————");
		}
		}
		}
	}
}