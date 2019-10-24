import java.util.Scanner;

class Exercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter the number of hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Enter the hourly pay rate: $");
		double hourlypay = input.nextDouble();
		System.out.print("Enter the federal tax withholding rate: ");
		double ftaxrate = input.nextDouble();
		System.out.print("Enter the state tax withholding rate: ");
		double staxrate = input.nextDouble();
		
		double grosspay = hours * hourlypay;
		double netpay = grosspay;
		double ftaxrate2 = grosspay * ftaxrate;
		double staxrate2 = grosspay * staxrate;		
		
		System.out.println(" ");
		System.out.println("Employee Name: "+ name);
		System.out.println("Hours Worked: "+ hours);
		System.out.printf("Pay Rate: $%.2f\n ", hourlypay);
		System.out.printf("Gross Pay: $%.2f\n ", grosspay);
		System.out.println("Deductions:");
		System.out.printf("		Federal Withholding (20.0%): $.2\n ", (int)(ftaxrate2 * 100 / 100.00));
		System.out.printf("        State Withholding (9.0%): $.2f\n ", (int)(staxrate2 * 100 / 100.00));
		System.out.println("        Total Deduction:");
		System.out.printf("Net Pay: $%.2f\n ", netpay);							
	}
}
