import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter the number of hours worked: ");
		String hours = input.nextLine();
		System.out.print("Enter the hourly pay rate: ");
		String hourlypay = input.nextLine();
		System.out.print("Enter the federal tax withholding rate: ");
		String ftaxrate = input.nextInt();
		System.out.print("Enter the state tax withholding rate: ");
		String staxrate = input.nextInt();
		
		//missing the federal and state tax rates %
		
		double tdeduction = ftaxrate + staxrate;
		double grosspay = hours * hourlypay;
		double netpay = (((hours * hourlypay) - 20.00%) - 9.0%);
		
		System.out.print("Employee Name: "+ name);
		System.out.print("Hours Worked: "+ hours);
		System.out.print("Pay Rate:$ "+ hourlypay);
		System.out.print("Gross Pay:$ "+ grosspay);
		System.out.print("Net Pay:$ "+ netpay);
		
	}
}
