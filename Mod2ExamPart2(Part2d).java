/*
Author: John Lopez.
Date: 10/29/2019.

Sample input/output:
	pckType = "env",   aCost = $0.00
	pckType = "sBox",  aCost = $3.00
	pckType = "mBox",  aCost = $10.00
	pckType = "lBox",  aCost = $15.00
*/
class Mod2ExamPart2 {	
	public static void main(String[] args) {
		String pckType = "sBox";
		double aCost = 0.0;
	
			switch(pckType) {
			// The first case is optional
			case "env":
				aCost = 0;
			case "sBox":
				aCost = 3;
			case "mBox":
				aCost = 10;
			case "lBox":
				aCost = 15;
			}
		System.out.printf("The package type %s costs an additional $%.2f.", pckType, aCost);
	}
}