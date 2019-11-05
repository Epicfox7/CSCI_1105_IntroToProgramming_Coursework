import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		
		
	
	public static int reverse(int number) {
		int oldNumber = 456;
		int newNumber = 0;
				
		newNumber += oldNumber % 10;
		System.out.println(newNumber);
				
		oldNumber = oldNumber / 10;
		newNumber = newNumber * 10;
		newNumber += oldNumber % 10;
		System.out.println(newNumber);
				
		oldNumber = oldNumber / 10;
		newNumber = newNumber * 10;
		newNumber += oldNumber % 10;
		System.out.println(newNumber);
			
		return (number = reverse(number));
			
	}

	public static boolean isPalindrome(int number) {
		if (456 == 654)	{
			return true;
		}
		else {
			return false;
		}
	}
}
