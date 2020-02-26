/*
 * Name: John Lopez.
 * Date: 2/24/20.
 */

import java.util.Scanner;

class Final_Project {

public static void main(String[] args) {

	Scanner	input = new Scanner(System.in);
	String[][] currencyConverters = new String[][] {{"United States Dollar","USD"},
										{"Euro","EUR"},
										{"Russian Ruble","RUB"},
										{"Swiss Franc","CHF"},
										{"Norwegian Krona","NOK"},
										{"Pound Sterling","GRB"},
										{"Chinise Yuan","CNY"},
										{"Japanese Yen","JPY"},
										{"Turkish Lira","TRY"},
										{"South Korea Won","SKW"},
										{"Canadian Dollar","CND"},
										{"Indian Rupee","INR"},
										{"Israeli New Shekel","ILS"},
										{"Qatari Rial","QAR"},
										{"Nigerian Naira","NGN"},
										{"Honduras Lempira","HNL"},
										{"Argentine Peso","ARS"},
										{"Brazilian Rial","BRL"},
										{"Hungarian Forint","HUF"},
										{"Netherlands Antillean Guilder","ANG"}};		
	
		String user = " ";
			
			while(user != "USD" & user != "EUR" & user != "RUB" & user != "CHF" &
				user != "NOK" & user != "GRB" & user != "CNY" & user != "JPY" &
				user != "TRY" & user != "SKW" & user != "CND" & user != "INR" &
				user != "IRS" & user != "QAR" & user != "NGN" & user != "HNL" &
				user != "ARS" & user != "BRL" & user != "HUF" & user != "ANG") {
			
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euros)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Francs)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekesl)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) HNL (Honduras Lempira)");
			System.out.println("17) ARS (Argentine Peso)");
			System.out.println("18) BRL (Brazilian Rial)");
			System.out.println("19) HUF (Hungarian Forint)");
			System.out.println("20) ANG (Netherlands Antillean Guilder)");
			System.out.print("\nType a currency: ");
			user = input.next();
			user = user.toUpperCase();
		
		if (user.equals("USD")) {
			usd();
		}
		else if (user.equals("EUR")){
			eu();
		}
		else if (user.equals("RUB")){
			rr();
		}
		else if (user.equals("CHF")){
			sf();
		}
		else if (user.equals("NOK")){
			nk();
		}
		else if (user.equals("GRB")){
			ps();
		}
		else if (user.equals("CNY")){
			cy();
		}
		else if (user.equals("JPY")){
			jy();
		}
		else if (user.equals("TRY")){
			tl();
		}
		else if (user.equals("SKW")){
			skw();
		}
		else if (user.equals("CND")){
			cd();
		}
		else if (user.equals("INR")){
			ir();
		}
		else if (user.equals("ILS")){
			ins();
		}
		else if (user.equals("QAR")){
			qr();
		}
		else if (user.equals("NGN")){
			nn();
		}
		else if (user.equals("HNL")){
			hdl();
		}
		else if (user.equals("ARS")){
			ap();
		}
		else if (user.equals("BRL")){
			br();
		}
		else if (user.equals("HUF")){
			hf();
		}
		else if (user.equals("ANG")){
			nag();
		}
		else {
			System.out.println("\nError!, Please try again..");
		}
	continue;
	}
}

	public static void usd() {
		Scanner input = new Scanner(System.in);
			String [][] uSD = {{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user1 = " ";
			while( user1 != "EUR" & user1 != "RUB" & user1 != "CHF" &
					user1 != "NOK" & user1 != "GRB" & user1 != "CNY" & user1 != "JPY" &
					user1 != "TRY" & user1 != "SKW" & user1 != "CND" & user1 != "INR" &
					user1 != "IRS" & user1 != "QAR" & user1 != "NGN" & user1 != "HNL" &
					user1 != "ARS" & user1 != "BRL" & user1 != "HUF" & user1 != "ANG") {
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) EUR (Euro)");
		System.out.println("2) RUB (Russian Ruble)");
		System.out.println("3) CHF (Swiss Franc)");
		System.out.println("4) NOK (Norwegian Krona)");
		System.out.println("5) GRB (Pound Sterling)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) IRS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user1 = input.next();
			user1 = user1.toUpperCase();
			
		if (user1.equals("EUR")){
		
			System.out.print("\nYou have chosen Euro.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double euros = 0.92 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f€ Euros.\n", dollars, euros);
			
		}
		else if (user1.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double rubles = 63.62 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₽ Russian Rubles.\n", dollars, rubles);
		}
		else if (user1.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double francs = 0.98 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₣ Swiss Francs.\n", dollars, francs);
		}
		else if (user1.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double kronas = 9.26 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fKr Norwegian Kronas.\n", dollars, kronas);
		}
		else if (user1.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double pounds = 0.77 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f£ Pounds Sterling.\n", dollars, pounds);
		}
		else if (user1.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double yuans = 6.99 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f¥ Chinise Yuans.\n", dollars, yuans);;
		}
		else if (user1.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double yens = 109.74 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f¥ Japanese Yens.\n", dollars, yens);
		}
		else if (user1.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double liras = 6.05 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₤ Turkish Liras.\n", dollars, liras);
		}
		else if (user1.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double wons = 1183.46 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₩ South Korea Wons.\n", dollars, wons);
		}
		else if (user1.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double cdollars = 1.33 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fC$ Canadian Dollars.\n", dollars, cdollars);
		}
		else if (user1.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double rupees = 71.54 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₹ Indian Rupees.\n", dollars, rupees);
		}
		else if (user1.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double shekels = 3.43 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₪ Israeli New Shekels.\n", dollars, shekels);
		}
		else if (user1.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double rials = 3.64 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f﷼ Qatari Rials.\n", dollars, rials);
		}
		else if (user1.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double nairas = 363.00 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₦ Nigerian Nairas.\n", dollars, nairas);
		}
		else if (user1.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double lempiras = 24.85 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fL Honduras Lempiras.\n", dollars, lempiras);
		}
		else if (user1.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double pesos = 61.45 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2f₱ Argentine Pesos.\n", dollars, pesos);
		}
		else if (user1.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double brials = 4.31 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fR$ Brazilian Rials.\n", dollars, brials);
		}
		else if (user1.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double forints = 309.80 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fFt Hungarian Forints.\n", dollars, forints);
		}
		else if (user1.equals("ANG")){
			
			System.out.print("\nYou have  choosed Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of United States Dollars: ");
			double dollars = input.nextDouble();
			
		
			double guilders = 1.79 * dollars + 1; 
			System.out.printf("\n%.2f$ United States Dollars = %.2fƒ Netherlands Antillean Guilders.\n", dollars, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
			
		
		
		String answer1 = " ";
		
		while(answer1 != "Yes" & answer1 != "No") {
			
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer1 = input.next();
		answer1 = answer1.toUpperCase();
		
		
		
		if (answer1.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		if(answer1.equals("YES")){
				String currency1 = " ";
			
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");	
			System.out.println("1) EUR (Euro)");
			System.out.println("2) RUB (Russian Ruble)");
			System.out.println("3) CHF (Swiss Franc)");
			System.out.println("4) NOK (Norwegian Krona)");
			System.out.println("5) GRB (Pound Sterling)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency1 = input.next();
				currency1 = currency1.toUpperCase();
				
				
				if (currency1.equals("USD")) {
					usd();
				}
				else if (currency1.equals("EUR")){
					eu();
				}
				else if (currency1.equals("RUB")){
					rr();
				}
				else if (currency1.equals("CHF")){
					sf();
				}
				else if (currency1.equals("NOK")){
					nk();
				}
				else if (currency1.equals("GRB")){
					ps();
				}
				else if (currency1.equals("CNY")){
					cy();
				}
				else if (currency1.equals("JPY")){
					jy();
				}
				else if (currency1.equals("TRY")){
					tl();
				}
				else if (currency1.equals("SKW")){
					skw();
				}
				else if (currency1.equals("CND")){
					cd();
				}
				else if (currency1.equals("INR")){
					ir();
				}
				else if (currency1.equals("ILS")){
					ins();
				}
				else if (currency1.equals("QAR")){
					qr();
				}
				else if (currency1.equals("NGN")){
					nn();
				}
				else if (currency1.equals("HNL")){
					hdl();
				}
				else if (currency1.equals("ARS")){
					ap();
				}
				else if (currency1.equals("BRL")){
					br();
				}
				else if (currency1.equals("HUF")){
					hf();
				}
				else if (currency1.equals("ANG")){
					nag();
				}
				else{
					System.out.print("\nError!, Please try again..\n");
				}
			}
		continue;
		}
	}
	}
	
	
	public static void eu() {
		Scanner input = new Scanner(System.in);
			String [][] eURO = {{"United States Dollar","USD"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user2 = " ";
			while( user2 != "USD" & user2 != "RUB" & user2 != "CHF" &
					user2 != "NOK" & user2 != "GRB" & user2 != "CNY" & user2 != "JPY" &
					user2 != "TRY" & user2 != "SKW" & user2 != "CND" & user2 != "INR" &
					user2 != "IRS" & user2 != "QAR" & user2 != "NGN" & user2 != "HNL" &
					user2 != "ARS" & user2 != "BRL" & user2 != "HUF" & user2 != "ANG") {
				
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) RUB (Russian Ruble)");
		System.out.println("3) CHF (Swiss Franc)");
		System.out.println("4) NOK (Norwegian Krona)");
		System.out.println("5) GRB (Pound Sterling)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user2 = input.next();
			user2 = user2.toUpperCase();
			
		if (user2.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double dollars = 1.08 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f$ United States Dollars.\n", euros, dollars);
			
		}
		
		else if (user2.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double rubles = 68.99 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₽ Russian Rubles.\n", euros, rubles);
		}
		else if (user2.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double francs = 1.06 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₣ Swiss Francs.\n", euros, francs);
		}
		else if (user2.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double kronas = 10.03 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fKr Norwegian Kronas.\n", euros, kronas);
		}
		else if (user2.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double pounds = 0.83 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f£ Pounds Sterling.\n", euros, pounds);
		}
		else if (user2.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double yuans = 7.58 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f¥ Chinise Yuans.\n", euros, yuans);;
		}
		else if (user2.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double yens = 119.02 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f¥ Japanese Yens.\n", euros, yens);
		}
		else if (user2.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double liras = 6.56 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₤ Turkish Liras.\n", euros, liras);
		}
		else if (user2.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double wons = 1283.70 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₩ South Korea Wons.\n", euros, wons);
		}
		else if (user2.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double cdollars = 1.44 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fC$ Canadian Dollars.\n", euros, cdollars);
		}
		else if (user2.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double rupees = 77.55 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₹ Indian Rupees.\n", euros, rupees);
		}
		else if (user2.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double shekels = 3.72 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₪ Israeli New Shekels.\n", euros, shekels);
		}
		else if (user2.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double rials = 3.95 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f﷼ Qatari Rials.\n", euros, rials);
		}
		else if (user2.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double nairas = 393.58 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₦ Nigerian Nairas.\n", euros, nairas);
		}
		else if (user2.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double lempiras = 26.94 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fL Honduras Lempiras.\n", euros, lempiras);
		}
		else if (user2.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double pesos = 66.64 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2f₱ Argentine Pesos.\n", euros, pesos);
		}
		else if (user2.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double brials = 4.67 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fR$ Brazilian Rials.\n", euros, brials);
		}
		else if (user2.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double forints = 335.72 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fFt Hungarian Forints.\n", euros, forints);
		}
		else if (user2.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Euros: ");
			double euros = input.nextDouble();
			
		
			double guilders = 1.94 * euros + 1; 
			System.out.printf("\n%.2f€ Euros = %.2fƒ Netherlands Antillean Guilders.\n", euros, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
			}

		String answer2 = " ";
		while(answer2 != "Yes" & answer2 != "No") {
			
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer2 = input.next();
		answer2 = answer2.toUpperCase();
		
		if (answer2.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer2.equals("YES")){
				String currency2 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) RUB (Russian Ruble)");
			System.out.println("3) CHF (Swiss Franc)");
			System.out.println("4) NOK (Norwegian Krona)");
			System.out.println("5) GRB (Pound Sterling)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency2 = input.next();
				currency2 = currency2.toUpperCase();
				
				
				if (currency2.equals("USD")) {
					usd();
				}
				else if (currency2.equals("EUR")){
					eu();
				}
				else if (currency2.equals("RUB")){
					rr();
				}
				else if (currency2.equals("CHF")){
					sf();
				}
				else if (currency2.equals("NOK")){
					nk();
				}
				else if (currency2.equals("GRB")){
					ps();
				}
				else if (currency2.equals("CNY")){
					cy();
				}
				else if (currency2.equals("JPY")){
					jy();
				}
				else if (currency2.equals("TRY")){
					tl();
				}
				else if (currency2.equals("SKW")){
					skw();
				}
				else if (currency2.equals("CND")){
					cd();
				}
				else if (currency2.equals("INR")){
					ir();
				}
				else if (currency2.equals("ILS")){
					ins();
				}
				else if (currency2.equals("QAR")){
					qr();
				}
				else if (currency2.equals("NGN")){
					nn();
				}
				else if (currency2.equals("HNL")){
					hdl();
				}
				else if (currency2.equals("ARS")){
					ap();
				}
				else if (currency2.equals("BRL")){
					br();
				}
				else if (currency2.equals("HUF")){
					hf();
				}
				else if (currency2.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	
			
	public static void rr() {
		Scanner input = new Scanner(System.in);
			String [][] rUB = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user3 = " ";
			while( user3 != "EUR" & user3 != "USD" & user3 != "CHF" &
					user3 != "NOK" & user3 != "GRB" & user3 != "CNY" & user3 != "JPY" &
					user3 != "TRY" & user3 != "SKW" & user3 != "CND" & user3 != "INR" &
					user3 != "IRS" & user3 != "QAR" & user3 != "NGN" & user3 != "HNL" &
					user3 != "ARS" & user3 != "BRL" & user3 != "HUF" & user3 != "ANG") {
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) CHF (Swiss Franc)");
		System.out.println("4) NOK (Norwegian Krona)");
		System.out.println("5) GRB (Pound Sterling)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user3 = input.next();
			user3 = user3.toUpperCase();
			
		if (user3.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double dollars = 0.016 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f$ United States Dollars.\n", rubles, dollars);
			
		}
		else if (user3.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double euros = 0.014 * rubles + 1; 
			System.out.printf("\n%.2f Russian Ruble = %.2f€ Euros.\n", rubles, euros);
		}
		else if (user3.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double francs = 0.015 * rubles + 1; 
			System.out.printf("\n%.2f Russian Ruble = %.2f₣ Swiss Francs.\n", rubles, francs);
		}
		else if (user3.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double kronas = 0.15 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fKr Norwegian Kronas.\n", rubles, kronas);
		}
		else if (user3.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double pounds = 0.012 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f£ Pounds Sterling.\n", rubles, pounds);
		}
		else if (user3.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double yuans = 0.11 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f¥ Chinise Yuans.\n", rubles, yuans);;
		}
		else if (user3.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double yens = 1.72 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f¥ Japanese Yens.\n", rubles, yens);
		}
		else if (user3.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double liras = 0.095 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₤ Turkish Liras.\n", rubles, liras);
		}
		else if (user3.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double wons = 18.63 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₩ South Korea Wons.\n", rubles, wons);
		}
		else if (user3.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double cdollars = 0.021 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fC$ Canadian Dollars.\n", rubles, cdollars);
		}
		else if (user3.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double rupees = 1.12 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₹ Indian Rupees.\n", rubles, rupees);
		}
		else if (user3.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double shekels = 0.053 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₪ Israeli New Shekels.\n", rubles, shekels);
		}
		else if (user3.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double rials = 0.057 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f﷼ Qatari Rials.\n", rubles, rials);
		}
		else if (user3.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double nairas = 5.68 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₦ Nigerian Nairas.\n", rubles, nairas);
		}
		else if (user3.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double lempiras = 0.39 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fL Honduras Lempiras.\n", rubles, lempiras);
		}
		else if (user3.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double pesos = 0.96 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₱ Argentine Pesos.\n", rubles, pesos);
		}
		else if (user3.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double brials = 0.068 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fR$ Brazilian Rials.\n", rubles, brials);
		}
		else if (user3.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double forints = 4.86 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fFt Hungarian Forints.\n", rubles, forints);
		}
		else if (user3.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double rubles = input.nextDouble();
			
		
			double guilders = 0.028 * rubles + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2fƒ Netherlands Antillean Guilders.\n", rubles, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
		String answer3 = " ";
		while(answer3 != "Yes" & answer3 != "No") {
			
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer3 = input.next();
		answer3 = answer3.toUpperCase();
		
		if (answer3.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer3.equals("YES")){
				String currency3 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) CHF (Swiss Franc)");
			System.out.println("4) NOK (Norwegian Krona)");
			System.out.println("5) GRB (Pound Sterling)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency3 = input.next();
				currency3 = currency3.toUpperCase();
				
				
				if (currency3.equals("USD")) {
					usd();
				}
				else if (currency3.equals("EUR")){
					eu();
				}
				else if (currency3.equals("RUB")){
					rr();
				}
				else if (currency3.equals("CHF")){
					sf();
				}
				else if (currency3.equals("NOK")){
					nk();
				}
				else if (currency3.equals("GRB")){
					ps();
				}
				else if (currency3.equals("CNY")){
					cy();
				}
				else if (currency3.equals("JPY")){
					jy();
				}
				else if (currency3.equals("TRY")){
					tl();
				}
				else if (currency3.equals("SKW")){
					skw();
				}
				else if (currency3.equals("CND")){
					cd();
				}
				else if (currency3.equals("INR")){
					ir();
				}
				else if (currency3.equals("ILS")){
					ins();
				}
				else if (currency3.equals("QAR")){
					qr();
				}
				else if (currency3.equals("NGN")){
					nn();
				}
				else if (currency3.equals("HNL")){
					hdl();
				}
				else if (currency3.equals("ARS")){
					ap();
				}
				else if (currency3.equals("BRL")){
					br();
				}
				else if (currency3.equals("HUF")){
					hf();
				}
				else if (currency3.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}	
	}
	
	
	public static void sf() {
		Scanner input = new Scanner(System.in);
			String [][] cHF = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user4 = " ";
			while( user4 != "EUR" & user4 != "RUB" & user4 != "USD" &
					user4 != "NOK" & user4 != "GRB" & user4 != "CNY" & user4 != "JPY" &
					user4 != "TRY" & user4 != "SKW" & user4 != "CND" & user4 != "INR" &
					user4 != "IRS" & user4 != "QAR" & user4 != "NGN" & user4 != "HNL" &
					user4 != "ARS" & user4 != "BRL" & user4 != "HUF" & user4 != "ANG") {
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) NOK (Norwegian Krona)");
		System.out.println("5) GRB (Pound Sterling)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user4 = input.next();
			user4 = user4.toUpperCase();
			
		if (user4.equals("USD")){
		
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double dollars = 1.02  * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f$ United States Dollars.\n", francs, dollars);
			
		}
		else if (user4.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double euros = 0.94 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f€ Euros.\n", francs, euros);
		}
		else if (user4.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Rubles.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double rubles =	65.29  * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₽ Russian Rubles.\n", francs, rubles);
		}
		else if (user4.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double kronas = 9.47 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fKr Norwegian Kronas.\n", francs, kronas);
		}
		else if (user4.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double pounds = 0.79 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f£ Pounds Sterling.\n", francs, pounds);
		}
		else if (user4.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double yuans = 7.14 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f¥ Chinise Yuans.\n", francs, yuans);;
		}
		else if (user4.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double yens = 113.17 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f¥ Japanese Yens.\n", francs, yens);
		}
		else if (user4.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double liras = 6.21 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₤ Turkish Liras.\n", francs, liras);
		}
		else if (user4.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double wons = 1227.40 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₩ South Korea Wons.\n", francs, wons);
		}
		else if (user4.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double cdollars = 1.35 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fC$ Canadian Dollars.\n", francs, cdollars);
		}
		else if (user4.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double rupees = 73.12 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₹ Indian Rupees.\n", francs, rupees);
		}
		else if (user4.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double shekels = 3.48 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₪ Israeli New Shekels.\n", francs, shekels);
		}
		else if (user4.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double rials = 3.70 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f﷼ Qatari Rials.\n", francs, rials);
		}
		else if (user4.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double nairas = 369.67 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₦ Nigerian Nairas.\n", francs, nairas);
		}
		else if (user4.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double lempiras = 25.48 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fL Honduras Lempiras.\n", francs, lempiras);
		}
		else if (user4.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double pesos = 62.84 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2f₱ Argentine Pesos.\n", francs, pesos);
		}
		else if (user4.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double brials = 4.46 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fR$ Brazilian Rials.\n", francs, brials);
		}
		else if (user4.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double forints = 318.59 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fFt Hungarian Forints.\n", francs, forints);
		}
		else if (user4.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Swiss Francs: ");
			double francs = input.nextDouble();
			
		
			double guilders = 1.82 * francs + 1; 
			System.out.printf("\n%.2f₣ Swiss Francs = %.2fƒ Netherlands Antillean Guilders.\n", francs, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer4 = " ";
		while(answer4 != "Yes" & answer4 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer4 = input.next();
		answer4 = answer4.toUpperCase();
		
		if (answer4.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer4.equals("YES")){
				String currency4 = " ";
			
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) NOK (Norwegian Krona)");
			System.out.println("5) GRB (Pound Sterling)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency4 = input.next();
				currency4 = currency4.toUpperCase();
				
				
				if (currency4.equals("USD")) {
					usd();
				}
				else if (currency4.equals("EUR")){
					eu();
				}
				else if (currency4.equals("RUB")){
					rr();
				}
				else if (currency4.equals("CHF")){
					sf();
				}
				else if (currency4.equals("NOK")){
					nk();
				}
				else if (currency4.equals("GRB")){
					ps();
				}
				else if (currency4.equals("CNY")){
					cy();
				}
				else if (currency4.equals("JPY")){
					jy();
				}
				else if (currency4.equals("TRY")){
					tl();
				}
				else if (currency4.equals("SKW")){
					skw();
				}
				else if (currency4.equals("CND")){
					cd();
				}
				else if (currency4.equals("INR")){
					ir();
				}
				else if (currency4.equals("ILS")){
					ins();
				}
				else if (currency4.equals("QAR")){
					qr();
				}
				else if (currency4.equals("NGN")){
					nn();
				}
				else if (currency4.equals("HNL")){
					hdl();
				}
				else if (currency4.equals("ARS")){
					ap();
				}
				else if (currency4.equals("BRL")){
					br();
				}
				else if (currency4.equals("HUF")){
					hf();
				}
				else if (currency4.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}	
	
	public static void nk() {
		Scanner input = new Scanner(System.in);
			String [][] nOK = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user5 = " ";
			while( user5 != "EUR" & user5 != "RUB" & user5 != "CHF" &
					user5 != "USD" & user5 != "GRB" & user5 != "CNY" & user5 != "JPY" &
					user5 != "TRY" & user5 != "SKW" & user5 != "CND" & user5 != "INR" &
					user5 != "IRS" & user5 != "QAR" & user5 != "NGN" & user5 != "HNL" &
					user5 != "ARS" & user5 != "BRL" & user5 != "HUF" & user5 != "ANG") {
				
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) GRB (Pound Sterling)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user5 = input.next();
			user5 = user5.toUpperCase();
			
		if (user5.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double dollars = 0.11 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f$ United States Dollars.\n", kronas, dollars);
			
		}
		else if (user5.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double euros = 0.099 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f€ Euros.\n", kronas, euros);
		}
		else if (user5.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Rubles.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double rubles = 6.88 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₽ Russian Rubles.\n", kronas, rubles);
		}
		else if (user5.equals("NOK")){
			
			System.out.print("\nYou have chosen Swiss Francs.");
			System.out.print("\nPlease enter the currency amount of Russian Rubles: ");
			double kronas = input.nextDouble();
			
		
			double francs = 0.11 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₣ Swiss Francs.\n", kronas, francs);
		}
		else if (user5.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double pounds = 0.083 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f£ Pounds Sterling.\n", kronas, pounds);
		}
		else if (user5.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double yuans = 0.75 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f¥ Chinise Yuans.\n", kronas, yuans);;
		}
		else if (user5.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double yens = 12.01 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f¥ Japanese Yens.\n", kronas, yens);
		}
		else if (user5.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double liras = 0.66 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₤ Turkish Liras.\n", kronas, liras);
		}
		else if (user5.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double wons = 129.58 * kronas + 1; 
			System.out.printf("\n%.2f₽ Russian Rubles = %.2f₩ South Korea Wons.\n", kronas, wons);
		}
		else if (user5.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double cdollars = 0.14 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2fC$ Canadian Dollars.\n", kronas, cdollars);
		}
		else if (user5.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double rupees = 7.72 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₹ Indian Rupees.\n", kronas, rupees);
		}
		else if (user5.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double shekels = 0.37 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₪ Israeli New Shekels.\n", kronas, shekels);
		}
		else if (user5.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double rials = 0.39 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f﷼ Qatari Rials.\n", kronas, rials);
		}
		else if (user5.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double nairas = 39.02 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₦ Nigerian Nairas.\n", kronas, nairas);
		}
		else if (user5.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double lempiras = 2.69 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2fL Honduras Lempiras.\n", kronas, lempiras);
		}
		else if (user5.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double pesos = 6.63 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2f₱ Argentine Pesos.\n", kronas, pesos);
		}
		else if (user5.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double brials = 0.47 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2fR$ Brazilian Rials.\n", kronas, brials);
		}
		else if (user5.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double forints = 33.59 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2fFt Hungarian Forints.\n", kronas, forints);
		}
		else if (user5.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Norwegian Kronas: ");
			double kronas = input.nextDouble();
			
		
			double guilders = 0.19 * kronas + 1; 
			System.out.printf("\n%.2fKr Norwegian Kronas = %.2fƒ Netherlands Antillean Guilders.\n", kronas, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer5 = " ";
		while(answer5 != "Yes" & answer5 != "No") {
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer5 = input.next();
		answer5 = answer5.toUpperCase();
		
		if (answer5.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer5.equals("YES")){
				String currency5 = " ";
			
			System.out.print("\nSelect a new currency: \n");	
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) GRB (Pound Sterling)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency5 = input.next();
				currency5 = currency5.toUpperCase();
				
				
				if (currency5.equals("USD")) {
					usd();
				}
				else if (currency5.equals("EUR")){
					eu();
				}
				else if (currency5.equals("RUB")){
					rr();
				}
				else if (currency5.equals("CHF")){
					sf();
				}
				else if (currency5.equals("NOK")){
					nk();
				}
				else if (currency5.equals("GRB")){
					ps();
				}
				else if (currency5.equals("CNY")){
					cy();
				}
				else if (currency5.equals("JPY")){
					jy();
				}
				else if (currency5.equals("TRY")){
					tl();
				}
				else if (currency5.equals("SKW")){
					skw();
				}
				else if (currency5.equals("CND")){
					cd();
				}
				else if (currency5.equals("INR")){
					ir();
				}
				else if (currency5.equals("ILS")){
					ins();
				}
				else if (currency5.equals("QAR")){
					qr();
				}
				else if (currency5.equals("NGN")){
					nn();
				}
				else if (currency5.equals("HNL")){
					hdl();
				}
				else if (currency5.equals("ARS")){
					ap();
				}
				else if (currency5.equals("BRL")){
					br();
				}
				else if (currency5.equals("HUF")){
					hf();
				}
				else if (currency5.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
			
	public static void ps() {
		Scanner input = new Scanner(System.in);
			String [][] gRB = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user6 = " ";
			while( user6 != "EUR" & user6 != "RUB" & user6 != "CHF" &
					user6 != "NOK" & user6 != "USD" & user6 != "CNY" & user6 != "JPY" &
					user6 != "TRY" & user6 != "SKW" & user6 != "CND" & user6 != "INR" &
					user6 != "IRS" & user6 != "QAR" & user6 != "NGN" & user6 != "HNL" &
					user6 != "ARS" & user6 != "BRL" & user6 != "HUF" & user6 != "ANG") {
				
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) CNY (Chinise Yuan)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user6 = input.next();
			user6 = user6.toUpperCase();
			
		if (user6.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Pound Sterling: ");
			double pounds = input.nextDouble();
			
		
			double dollars = 1.29 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterling = %.2f$ United States Dollars.\n", pounds, dollars);
			
		}
		else if (user6.equals("EUR")){
			
			System.out.print("\nYou have chosen Euro.");
			System.out.print("\nPlease enter the currency amount of Pound Sterling: ");
			double pounds = input.nextDouble();
			
		
			double euros = 1.19 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterling = %.2f€ Euros.\n", pounds, euros);
		}
		else if (user6.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Pounds Sterling: ");
			double pounds = input.nextDouble();
			
		
			double rubles = 82.64 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₽ Russian Rubles.\n", pounds, rubles);
		}
		else if (user6.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double francs = 1.27 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₣ Swiss Francs.\n", pounds, francs);
		}
		else if (user6.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double kronas = 12.00 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2fKr Norwegian Kronas.\n", pounds, kronas);
		}
		else if (user6.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double yuans = 9.05 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f¥ Chinise Yuans.\n", pounds, yuans);;
		}
		else if (user6.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double yens = 144.10 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f¥ Japanese Yens.\n", pounds, yens);
		}
		else if (user6.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double liras = 7.86 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₤ Turkish Liras.\n", pounds, liras);
		}
		else if (user6.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double wons = 1555.65 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₩ South Korea Wons.\n", pounds, wons);
		}
		else if (user6.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double cdollars = 1.71 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2fC$ Canadian Dollars.\n", pounds, cdollars);
		}
		else if (user6.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double rupees = 92.67 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₹ Indian Rupees.\n", pounds, rupees);
		}
		else if (user6.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double shekels = 4.41 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₪ Israeli New Shekels.\n", pounds, shekels);
		}
		else if (user6.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double rials = 4.69 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f﷼ Qatari Rials.\n", pounds, rials);
		}
		else if (user6.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double nairas = 468.22 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₦ Nigerian Nairas.\n", pounds, nairas);
		}
		else if (user6.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double lempiras = 32.27 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2fL Honduras Lempiras.\n", pounds, lempiras);
		}
		else if (user6.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double pesos = 79.59 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2f₱ Argentine Pesos.\n", pounds, pesos);
		}
		else if (user6.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double brials = 5.65 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2fR$ Brazilian Rials.\n", pounds, brials);
		}
		else if (user6.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double forints = 403.17 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterlings = %.2fFt Hungarian Forints.\n", pounds, forints);
		}
		else if (user6.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Pound Sterlings: ");
			double pounds = input.nextDouble();
			
		
			double guilders = 2.31 * pounds + 1; 
			System.out.printf("\n%.2f£ Pounds Sterling = %.2fƒ Netherlands Antillean Guilders.\n", pounds, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer6 = " ";
		while(answer6 != "Yes" & answer6 != "No") {
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer6 = input.next();
		answer6 = answer6.toUpperCase();
		
		if(answer6.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer6.equals("YES")){
				String currency6 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) CNY (Chinise Yuan)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency6 = input.next();
				currency6 = currency6.toUpperCase();
				
				
				if (currency6.equals("USD")) {
					usd();
				}
				else if (currency6.equals("EUR")){
					eu();
				}
				else if (currency6.equals("RUB")){
					rr();
				}
				else if (currency6.equals("CHF")){
					sf();
				}
				else if (currency6.equals("NOK")){
					nk();
				}
				else if (currency6.equals("GRB")){
					ps();
				}
				else if (currency6.equals("CNY")){
					cy();
				}
				else if (currency6.equals("JPY")){
					jy();
				}
				else if (currency6.equals("TRY")){
					tl();
				}
				else if (currency6.equals("SKW")){
					skw();
				}
				else if (currency6.equals("CND")){
					cd();
				}
				else if (currency6.equals("INR")){
					ir();
				}
				else if (currency6.equals("ILS")){
					ins();
				}
				else if (currency6.equals("QAR")){
					qr();
				}
				else if (currency6.equals("NGN")){
					nn();
				}
				else if (currency6.equals("HNL")){
					hdl();
				}
				else if (currency6.equals("ARS")){
					ap();
				}
				else if (currency6.equals("BRL")){
					br();
				}
				else if (currency6.equals("HUF")){
					hf();
				}
				else if (currency6.equals("ANG")){
					nag();
				}
				else {
					System.out.print("\nError!, Please try again..");
				}	
			}
		continue;
		}
	}
	}
	
				
	public static void cy() {
		Scanner input = new Scanner(System.in);
			String [][] cNY = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user7 = " ";
			while( user7 != "EUR" & user7 != "RUB" & user7 != "CHF" &
					user7 != "NOK" & user7 != "GRB" & user7 != "USD" & user7 != "JPY" &
					user7 != "TRY" & user7 != "SKW" & user7 != "CND" & user7 != "INR" &
					user7 != "IRS" & user7 != "QAR" & user7 != "NGN" & user7 != "HNL" &
					user7 != "ARS" & user7 != "BRL" & user7 != "HUF" & user7 != "ANG") {
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) JPY (Japanese Yen)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user7 = input.next();
			user7 = user7.toUpperCase();
			
		if (user7.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double dollars = 0.14 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f$ United States Dollars.\n", yuans, dollars);
			
		}
		else if (user7.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double euros = 0.13 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f€ Euros.\n", yuans, euros);
		}
		else if (user7.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Rubles.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double rubles = 9.13 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₽ Russian Rubles.\n", yuans, rubles);
		}
		else if (user7.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double francs = 0.14 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₣ Swiss Francs.\n", yuans, francs);
		}
		else if (user7.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double kronas = 1.33 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fKr Norwegian Kronas.\n", yuans, kronas);
		}
		else if (user7.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double pounds = 0.11 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f£ Pounds Sterling.\n", yuans, pounds);
		}
		else if (user7.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double yens = 15.93 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f¥ Japanese Yens.\n", yuans, yens);
		}
		else if (user7.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double liras = 0.87 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₤ Turkish Liras.\n", yuans, liras);
		}
		else if (user7.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double wons = 171.94 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₩ South Korea Wons.\n", yuans, wons);
		}
		else if (user7.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double cdollars = 0.19 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fC$ Canadian Dollars.\n", yuans, cdollars);
		}
		else if (user7.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double rupees = 10.21 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₹ Indian Rupees.\n", yuans, rupees);
		}
		else if (user7.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double shekels = 0.49 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₪ Israeli New Shekels.\n", yuans, shekels);
		}
		else if (user7.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double rials = 0.52 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f﷼ Qatari Rials.\n", yuans, rials);
		}
		else if (user7.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double nairas = 51.76 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₦ Nigerian Nairas.\n", yuans, nairas);
		}
		else if (user7.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double lempiras = 3.57 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fL Honduras Lempiras.\n", yuans, lempiras);
		}
		else if (user7.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double pesos = 8.80 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2f₱ Argentine Pesos.\n", yuans, pesos);
		}
		else if (user7.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double brials = 0.63 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fR$ Brazilian Rials.\n", yuans, brials);
		}
		else if (user7.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double forints = 44.59 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fFt Hungarian Forints.\n", yuans, forints);
		}
		else if (user7.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Chinise Yuans: ");
			double yuans = input.nextDouble();
			
		
			double guilders = 0.25 * yuans + 1; 
			System.out.printf("\n%.2f¥ Chinise Yuans = %.2fƒ Netherlands Antillean Guilders.\n", yuans, guilders);
		}
		else {
			System.out.println("\nError!, Pleasse try again..");
		}
		
		String answer7 = " ";
		while(answer7 != "Yes" & answer7 != "No") {
			
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer7 = input.next();
		answer7 = answer7.toUpperCase();
		
		if (answer7.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer7.equals("YES")){
				String currency7 = " ";
				
			System.out.print("\nSelect a new currency: \n");	
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) JPY (Japanese Yen)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency7 = input.next();
				currency7 = currency7.toUpperCase();
				
				
				if (currency7.equals("USD")) {
					usd();
				}
				else if (currency7.equals("EUR")){
					eu();
				}
				else if (currency7.equals("RUB")){
					rr();
				}
				else if (currency7.equals("CHF")){
					sf();
				}
				else if (currency7.equals("NOK")){
					nk();
				}
				else if (currency7.equals("GRB")){
					ps();
				}
				else if (currency7.equals("CNY")){
					cy();
				}
				else if (currency7.equals("JPY")){
					jy();
				}
				else if (currency7.equals("TRY")){
					tl();
				}
				else if (currency7.equals("SKW")){
					skw();
				}
				else if (currency7.equals("CND")){
					cd();
				}
				else if (currency7.equals("INR")){
					ir();
				}
				else if (currency7.equals("ILS")){
					ins();
				}
				else if (currency7.equals("QAR")){
					qr();
				}
				else if (currency7.equals("NGN")){
					nn();
				}
				else if (currency7.equals("HNL")){
					hdl();
				}
				else if (currency7.equals("ARS")){
					ap();
				}
				else if (currency7.equals("BRL")){
					br();
				}
				else if (currency7.equals("HUF")){
					hf();
				}
				else if (currency7.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
				
	public static void jy() {
		Scanner input = new Scanner(System.in);
			String [][] jPY = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user8 = " ";
			while( user8 != "EUR" & user8 != "RUB" & user8 != "CHF" &
					user8 != "NOK" & user8 != "GRB" & user8 != "CNY" & user8 != "USD" &
					user8 != "TRY" & user8 != "SKW" & user8 != "CND" & user8 != "INR" &
					user8 != "IRS" & user8 != "QAR" & user8 != "NGN" & user8 != "HNL" &
					user8 != "ARS" & user8 != "BRL" & user8 != "HUF" & user8 != "ANG") {
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) TRY (Turkish Lira)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user8 = input.next();
			user8 = user8.toUpperCase();
			
		if (user8.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double dollars = 0.0089 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f$ United States Dollars.\n", yens, dollars);
			
		}
		else if (user8.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double euros = 0.0083 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f€ Euros.\n", yens, euros);
		}
		else if (user8.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double rubles = 0.57 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f¥ Japanese Yens.\n", yens, rubles);
		}
		else if (user8.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double francs = 0.0088 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₣ Swiss Francs.\n", yens, francs);
		}
		else if (user8.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double kronas = 0.083 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fKr Norwegian Kronas.\n", yens, kronas);
		}
		else if (user8.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double pounds = 0.0069 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f£ Pounds Sterling.\n", yens, pounds);
		}
		else if (user8.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double yuans = 0.063 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f¥ Chinise Yuans.\n", yens, yuans);;
		}
		else if (user8.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double liras = 0.055 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₤ Turkish Liras.\n", yens, liras);
		}
		else if (user8.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double wons = 10.79 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₩ South Korea Wons.\n", yens, wons);
		}
		else if (user8.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double cdollars = 0.012 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fC$ Canadian Dollars.\n", yens, cdollars);
		}
		else if (user8.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double rupees = 0.64 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₹ Indian Rupees.\n", yens, rupees);
		}
		else if (user8.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double shekels = 0.031 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₪ Israeli New Shekels.\n", yens, shekels);
		}
		else if (user8.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double rials = 0.033 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f﷼ Qatari Rials.\n", yens, rials);
		}
		else if (user8.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double nairas = 3.25 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₦ Nigerian Nairas.\n", yens, nairas);
		}
		else if (user8.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double lempiras = 0.22 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fL Honduras Lempiras.\n", yens, lempiras);
		}
		else if (user8.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double pesos = 0.55 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2f₱ Argentine Pesos.\n", yens, pesos);
		}
		else if (user8.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double brials = 0.039 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fR$ Brazilian Rials.\n", yens, brials);
		}
		else if (user8.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double forints = 2.80 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fFt Hungarian Forints.\n", yens, forints);
		}
		else if (user8.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Japanese Yens: ");
			double yens = input.nextDouble();
			
		
			double guilders = 0.016 * yens + 1; 
			System.out.printf("\n%.2f¥ Japanese Yens = %.2fƒ Netherlands Antillean Guilders.\n", yens, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer8 = " ";
		while(answer8 != "Yes" & answer8 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer8 = input.next();
		answer8 = answer8.toUpperCase();
		
		if (answer8.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer8.equals("YES")){
				String currency8 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) TRY (Turkish Lira)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency8 = input.next();
				currency8 = currency8.toUpperCase();
				
				
				if (currency8.equals("USD")) {
					usd();
				}
				else if (currency8.equals("EUR")){
					eu();
				}
				else if (currency8.equals("RUB")){
					rr();
				}
				else if (currency8.equals("CHF")){
					sf();
				}
				else if (currency8.equals("NOK")){
					nk();
				}
				else if (currency8.equals("GRB")){
					ps();
				}
				else if (currency8.equals("CNY")){
					cy();
				}
				else if (currency8.equals("JPY")){
					jy();
				}
				else if (currency8.equals("TRY")){
					tl();
				}
				else if (currency8.equals("SKW")){
					skw();
				}
				else if (currency8.equals("CND")){
					cd();
				}
				else if (currency8.equals("INR")){
					ir();
				}
				else if (currency8.equals("ILS")){
					ins();
				}
				else if (currency8.equals("QAR")){
					qr();
				}
				else if (currency8.equals("NGN")){
					nn();
				}
				else if (currency8.equals("HNL")){
					hdl();
				}
				else if (currency8.equals("ARS")){
					ap();
				}
				else if (currency8.equals("BRL")){
					br();
				}
				else if (currency8.equals("HUF")){
					hf();
				}
				else if (currency8.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
		
	public static void tl() {
		Scanner input = new Scanner(System.in);
			String [][] tRY = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user9 = " ";
			while( user9 != "EUR" & user9 != "RUB" & user9 != "CHF" &
					user9 != "NOK" & user9 != "GRB" & user9 != "CNY" & user9 != "JPY" &
					user9 != "TRY" & user9 != "SKW" & user9 != "CND" & user9 != "INR" &
					user9 != "IRS" & user9 != "QAR" & user9 != "NGN" & user9 != "HNL" &
					user9 != "ARS" & user9 != "BRL" & user9 != "HUF" & user9 != "ANG") {
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) SKW (South Korea Won)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user9 = input.next();
			user9 = user9.toUpperCase();
			
		if (user9.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Turkish Liras: ");
			double liras = input.nextDouble();
			
		
			double dollars = 0.16 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f$ United States Dollars.\n", liras, dollars);
			
		}
		else if (user9.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double euros = 0.15 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Liras = %.2f€ Euros.\n", liras, euros);
		}
		else if (user9.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double rubles = 10.51 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₽ Russian Rubles.\n", liras, rubles);
		}
		else if (user9.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double francs = 0.16 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Liras = %.2f₣ Swiss Francs.\n", liras, francs);
		}
		else if (user9.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double kronas = 1.53 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fKr Norwegian Kronas.\n", liras, kronas);
		}
		else if (user9.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double pounds = 0.13 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f£ Pounds Sterling.\n", liras, pounds);
		}
		else if (user9.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double yuans = 1.15 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f¥ Chinise Yuans.\n", liras, yuans);;
		}
		else if (user9.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double yens = 18.31 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f¥ Japanese Yens.\n", liras, yens);
		}
		else if (user9.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double wons = 198.03 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₩ South Korea Wons.\n", liras, wons);
		}
		else if (user9.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double cdollars = 0.22 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fC$ Canadian Dollars.\n", liras, cdollars);
		}
		else if (user9.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double rupees = 11.79 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₹ Indian Rupees.\n", liras, rupees);
		}
		else if (user9.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double shekels = 0.56 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₪ Israeli New Shekels.\n", liras, shekels);
		}
		else if (user9.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double rials = 0.60 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f﷼ Qatari Rials.\n", liras, rials);
		}
		else if (user9.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double nairas = 59.61 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₦ Nigerian Nairas.\n", liras, nairas);
		}
		else if (user9.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double lempiras = 4.11 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fL Honduras Lempiras.\n", liras, lempiras);
		}
		else if (user9.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double pesos = 10.13 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2f₱ Argentine Pesos.\n", liras, pesos);
		}
		else if (user9.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double brials = 0.72 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fR$ Brazilian Rials.\n", liras, brials);
		}
		else if (user9.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double forints = 51.32 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fFt Hungarian Forints.\n", liras, forints);
		}
		else if (user9.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Turkish Lira: ");
			double liras = input.nextDouble();
			
		
			double guilders = 0.29 * liras + 1; 
			System.out.printf("\n%.2f₤ Turkish Lira = %.2fƒ Netherlands Antillean Guilders.\n", liras, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
		String answer9 = " ";
		while(answer9 != "Yes" & answer9 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer9 = input.next();
		answer9 = answer9.toUpperCase();
		
		if (answer9.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer9.equals("YES")){
				String currency9 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) SKW (South Korea Won)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency9 = input.next();
				currency9 = currency9.toUpperCase();
			
				
				if (currency9.equals("USD")) {
					usd();
				}
				else if (currency9.equals("EUR")){
					eu();
				}
				else if (currency9.equals("RUB")){
					rr();
				}
				else if (currency9.equals("CHF")){
					sf();
				}
				else if (currency9.equals("NOK")){
					nk();
				}
				else if (currency9.equals("GRB")){
					ps();
				}
				else if (currency9.equals("CNY")){
					cy();
				}
				else if (currency9.equals("JPY")){
					jy();
				}
				else if (currency9.equals("TRY")){
					tl();
				}
				else if (currency9.equals("SKW")){
					skw();
				}
				else if (currency9.equals("CND")){
					cd();
				}
				else if (currency9.equals("INR")){
					ir();
				}
				else if (currency9.equals("ILS")){
					ins();
				}
				else if (currency9.equals("QAR")){
					qr();
				}
				else if (currency9.equals("NGN")){
					nn();
				}
				else if (currency9.equals("HNL")){
					hdl();
				}
				else if (currency9.equals("ARS")){
					ap();
				}
				else if (currency9.equals("BRL")){
					br();
				}
				else if (currency9.equals("HUF")){
					hf();
				}
				else if (currency9.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
		
	public static void skw() {
		Scanner input = new Scanner(System.in);
			String [][] sKW = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user10 = " ";
			while( user10 != "EUR" & user10 != "RUB" & user10 != "CHF" &
					user10 != "NOK" & user10 != "GRB" & user10 != "CNY" & user10 != "JPY" &
					user10 != "TRY" & user10 != "USD" & user10 != "CND" & user10 != "INR" &
					user10 != "IRS" & user10 != "QAR" & user10 != "NGN" & user10 != "HNL" &
					user10 != "ARS" & user10 != "BRL" & user10 != "HUF" & user10 != "ANG") {
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) CND (Canadian Dollar)");
		System.out.println("11) INR (Indian Rupee)");
		System.out.println("12) ILS (Israeli New Shekel)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user10 = input.next();
			user10 = user10.toUpperCase();
			
		if (user10.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double dollars = 0.00083 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f$ United States Dollars.\n", wons, dollars);
			
		}
		else if (user10.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double euros = 0.00077 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f€ Euros.\n", wons, euros);
		}
		else if (user10.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Rubles.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double rubles = 0.053 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₽ Russian Rubles.\n", wons, rubles);
		}
		else if (user10.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double francs = 0.00081 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₣ Swiss Francs.\n", wons, francs);
		}
		else if (user10.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double kronas = 0.0077 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fKr Norwegian Kronas.\n", wons, kronas);
		}
		else if (user10.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double pounds = 0.00064 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f£ Pounds Sterling.\n", wons, pounds);
		}
		else if (user10.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double yuans = 0.0058 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f¥ Chinise Yuans.\n", wons, yuans);;
		}
		else if (user10.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double yens = 0.093 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f¥ Japanese Yens.\n", wons, yens);
		}
		else if (user10.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double liras = 0.0051 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₤ Turkish Liras.\n", wons, liras);
		}
		else if (user10.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double cdollars = 0.0011 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fC$ Canadian Dollars.\n", wons, cdollars);
		}
		else if (user10.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double rupees = 0.060 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₹ Indian Rupees.\n", wons, rupees);
		}
		else if (user10.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double shekels = 0.0028 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₪ Israeli New Shekels.\n", wons, shekels);
		}
		else if (user10.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double rials = 0.0030 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f﷼ Qatari Rials.\n", wons, rials);
		}
		else if (user10.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double nairas = 0.30 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₦ Nigerian Nairas.\n", wons, nairas);
		}
		else if (user10.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double lempiras = 0.021 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fL Honduras Lempiras.\n", wons, lempiras);
		}
		else if (user10.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double pesos = 0.051 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2f₱ Argentine Pesos.\n", wons, pesos);
		}
		else if (user10.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double brials = 0.0036 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fR$ Brazilian Rials.\n", wons, brials);
		}
		else if (user10.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double forints = 0.26 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fFt Hungarian Forints.\n", wons, forints);
		}
		else if (user10.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of South Korea Wons: ");
			double wons = input.nextDouble();
			
		
			double guilders = 0.0015 * wons + 1; 
			System.out.printf("\n%.2f₩ South Korea Wons = %.2fƒ Netherlands Antillean Guilders.\n", wons, guilders);
		}
		else {
			System.out.println("\nError!, Please try agian..");
			continue;
		}
		
		String answer10 = " ";
		while(answer10 != "Yes" & answer10 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer10 = input.next();
		answer10 = answer10.toUpperCase();
		
		if (answer10.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer10.equals("YES")){
				String currency10 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) CND (Canadian Dollar)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) IRS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency10 = input.next();
				currency10 = currency10.toUpperCase();
				
				
				if (currency10.equals("USD")) {
					usd();
				}
				else if (currency10.equals("EUR")){
					eu();
				}
				else if (currency10.equals("RUB")){
					rr();
				}
				else if (currency10.equals("CHF")){
					sf();
				}
				else if (currency10.equals("NOK")){
					nk();
				}
				else if (currency10.equals("GRB")){
					ps();
				}
				else if (currency10.equals("CNY")){
					cy();
				}
				else if (currency10.equals("JPY")){
					jy();
				}
				else if (currency10.equals("TRY")){
					tl();
				}
				else if (currency10.equals("SKW")){
					skw();
				}
				else if (currency10.equals("CND")){
					cd();
				}
				else if (currency10.equals("INR")){
					ir();
				}
				else if (currency10.equals("ILS")){
					ins();
				}
				else if (currency10.equals("QAR")){
					qr();
				}
				else if (currency10.equals("NGN")){
					nn();
				}
				else if (currency10.equals("HNL")){
					hdl();
				}
				else if (currency10.equals("ARS")){
					ap();
				}
				else if (currency10.equals("BRL")){
					br();
				}
				else if (currency10.equals("HUF")){
					hf();
				}
				else if (currency10.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
				
	public static void cd() {
		Scanner input = new Scanner(System.in);
				String [][] cND = {{"United States Dollar","USD"},
								{"Euro","EUR"},
								{"Russian Ruble","RUB"},
								{"Swiss Franc","CHF"},
								{"Norwegian Krona","NOK"},
								{"Pound Sterling","GRB"},
								{"Chinise Yuan","CNY"},
								{"Japanese Yen","JPY"},
								{"Turkish Lira","TRY"},
								{"South Korea Won","SKW"},
								{"Indian Rupee","INR"},
								{"Israeli New Shekel","ILS"},
								{"Qatari Rial","QAR"},
								{"Nigerian Naira","NGN"},
								{"Honduras Lempira","HNL"},
								{"Argentine Peso","ARS"},
								{"Brazilian Rial","BRL"},
								{"Hungarian Forint","HUF"},
								{"Netherlands Antillean Guilder","ANG"},
								{"Yes"},{"No"}};
								
			
				String user11 = " ";
				while( user11 != "EUR" & user11 != "RUB" & user11 != "CHF" &
						user11 != "NOK" & user11 != "GRB" & user11 != "CNY" & user11 != "JPY" &
						user11 != "TRY" & user11 != "SKW" & user11 != "USD" & user11 != "INR" &
						user11 != "IRS" & user11 != "QAR" & user11 != "NGN" & user11 != "HNL" &
						user11 != "ARS" & user11 != "BRL" & user11 != "HUF" & user11 != "ANG") {
				
				System.out.print("\nYou have chosen Canadian Dollar.");
				System.out.print("\nTo what currency would you like to convert into?\n");
				
				
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) INR (Indian Rupee)");
			System.out.println("12) ILS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
			System.out.print("\nType a currency: ");
				user11 = input.next();
				user11 = user11.toUpperCase();
				
			if (user11.equals("USD")){
			
				
				System.out.print("\nYou have chosen United States Dollar.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double dollars = 0.75 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f$ United States Dollars.\n", cdollars, dollars);
				
			}
			else if (user11.equals("EUR")){
				
				System.out.print("\nYou have chosen Euros.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double euros = 0.70 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f€ Euros.\n", cdollars, euros);
			}
			else if (user11.equals("RUB")){
				
				System.out.print("\nYou have chosen Russian Ruble.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollar: ");
				double cdollars = input.nextDouble();
				
			
				double rubles = 48.33 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₽ Russian Rubles.\n", cdollars, rubles);
			}
			else if (user11.equals("CHF")){
				
				System.out.print("\nYou have chosen Swiss Franc.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double francs = 0.74 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₣ Swiss Francs.\n", cdollars, francs);
			}
			else if (user11.equals("NOK")){
				
				System.out.print("\nYou have chosen Norwegian Krona.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double kronas = 7.03 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2fKr Norwegian Kronas.\n", cdollars, kronas);
			}
			else if (user11.equals("GRB")){
				
				System.out.print("\nYou have chosen Pound Sterling.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double pounds = 0.59 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f£ Pounds Sterling.\n", cdollars, pounds);
			}
			else if (user11.equals("CNY")){
				
				System.out.print("\nYou have chosen Chinise Yuan.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double yuans = 5.30 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f¥ Chinise Yuans.\n", cdollars, yuans);;
			}
			else if (user11.equals("JPY")){
				
				System.out.print("\nYou have chosen Japanese Yen.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double yens = 84.34 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f¥ Japanese Yens.\n", cdollars, yens);
			}
			else if (user11.equals("TRY")){
				
				System.out.print("\nYou have chosen Turkish Lira.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double liras = 4.60 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₤ Turkish Liras.\n", cdollars, liras);
			}
			else if (user11.equals("SKW")){
				
				System.out.print("\nYou have chosen South Korea Won.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double wons = 910.68 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₩ South Korea Wons.\n", cdollars, wons);
			}
			else if (user11.equals("INR")){
				
				System.out.print("\nYou have chosen Indian Rupee.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double rupees = 54.05 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₹ Indian Rupees.\n", cdollars, rupees);
			}
			else if (user11.equals("ILS")){
				
				System.out.print("\nYou have chosen Israeli New Shekel.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double shekels = 2.58 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₪ Israeli New Shekels.\n", cdollars, shekels);
			}
			else if (user11.equals("QAR")){
				
				System.out.print("\nYou have chosen Qatari Rial.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double rials = 2.75 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f﷼ Qatari Rials.\n", cdollars, rials);
			}
			else if (user11.equals("NGN")){
				
				System.out.print("\nYou have chosen Nigerian Naira.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double nairas = 274.13 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₦ Nigerian Nairas.\n", cdollars, nairas);
			}
			else if (user11.equals("HNL")){
				
				System.out.print("\nYou have chosen Honduras Lempira.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double lempiras = 18.90 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2fL Honduras Lempiras.\n", cdollars, lempiras);
			}
			else if (user11.equals("ARS")){
				
				System.out.print("\nYou have chosen Argentine Peso.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double pesos = 46.60 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2f₱ Argentine Pesos.\n", cdollars, pesos);
			}
			else if (user11.equals("BRL")){
				
				System.out.print("\nYou have chosen Brazilian Rial.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double brials = 3.31 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2fR$ Brazilian Rials.\n", cdollars, brials);
			}
			else if (user11.equals("HUF")){
				
				System.out.print("\nYou have chosen Hungarian Forint.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double forints = 236.00 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2fFt Hungarian Forints.\n", cdollars, forints);
			}
			else if (user11.equals("ANG")){
				
				System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
				System.out.print("\nPlease enter the currency amount of Canadian Dollars: ");
				double cdollars = input.nextDouble();
				
			
				double guilders = 1.35 * cdollars + 1; 
				System.out.printf("\n%.2fC$ Canadian Dollars = %.2fƒ Netherlands Antillean Guilders.\n", cdollars, guilders);
			}
			else {
				System.out.println("\nError!, Please try again..");
				continue;
			}
			
			String answer11 = " ";
			while(answer11 != "Yes" & answer11 != "No") {
			
	System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
			
			answer11 = input.next();
			answer11 = answer11.toUpperCase();
			
			if (answer11.equals("NO")){
				System.out.print("\nCurrency Converter has stopped.");
				System.exit(0);
			}
			
			
			if(answer11.equals("YES")){
					String currency11 = " ";
					
				System.out.print("\nSelect a new currency: \n");
				System.out.println("\n1) USD (United States Dollar)");
				System.out.println("2) EUR (Euro)");
				System.out.println("3) RUB (Russian Ruble)");
				System.out.println("4) CHF (Swiss Franc)");
				System.out.println("5) NOK (Norwegian Krona)");
				System.out.println("6) GRB (Pound Sterling)");
				System.out.println("7) CNY (Chinise Yuan)");
				System.out.println("8) JPY (Japanese Yen)");
				System.out.println("9) TRY (Turkish Lira)");
				System.out.println("10) SKW (South Korea Won)");
				System.out.println("11) INR (Indian Rupee)");
				System.out.println("12) ILS (Israeli New Shekel)");
				System.out.println("13) QAR (Qatari Rial)");
				System.out.println("14) NGN (Nigerian Naira)");
				System.out.println("15) HNL (Honduras Lempira)");
				System.out.println("16) ARS (Argentine Peso)");
				System.out.println("17) BRL (Brazilian Rial)");
				System.out.println("18) HUF (Hungarian Forint)");
				System.out.println("19) ANG (Netherlands Antillean Guilder)");
					System.out.print("\nType a currency: ");
					currency11 = input.next();
					currency11 = currency11.toUpperCase();
					
					
					if (currency11.equals("USD")) {
						usd();
					}
					else if (currency11.equals("EUR")){
						eu();
					}
					else if (currency11.equals("RUB")){
						rr();
					}
					else if (currency11.equals("CHF")){
						sf();
					}
					else if (currency11.equals("NOK")){
						nk();
					}
					else if (currency11.equals("GRB")){
						ps();
					}
					else if (currency11.equals("CNY")){
						cy();
					}
					else if (currency11.equals("JPY")){
						jy();
					}
					else if (currency11.equals("TRY")){
						tl();
					}
					else if (currency11.equals("SKW")){
						skw();
					}
					else if (currency11.equals("CND")){
						cd();
					}
					else if (currency11.equals("INR")){
						ir();
					}
					else if (currency11.equals("ILS")){
						ins();
					}
					else if (currency11.equals("QAR")){
						qr();
					}
					else if (currency11.equals("NGN")){
						nn();
					}
					else if (currency11.equals("HNL")){
						hdl();
					}
					else if (currency11.equals("ARS")){
						ap();
					}
					else if (currency11.equals("BRL")){
						br();
					}
					else if (currency11.equals("HUF")){
						hf();
					}
					else if (currency11.equals("ANG")){
						nag();
					}
					else {
						System.out.println("\nError!, Please try again..");
					}
				}
			continue;
			}
		}
	}
	
		
	public static void ir() {
		Scanner input = new Scanner(System.in);
				String [][] iNR = {{"United States Dollar","USD"},
								{"Euro","EUR"},
								{"Russian Ruble","RUB"},
								{"Swiss Franc","CHF"},
								{"Norwegian Krona","NOK"},
								{"Pound Sterling","GRB"},
								{"Chinise Yuan","CNY"},
								{"Japanese Yen","JPY"},
								{"Turkish Lira","TRY"},
								{"South Korea Won","SKW"},
								{"Canadian Dollar","CND"},
								{"Israeli New Shekel","ILS"},
								{"Qatari Rial","QAR"},
								{"Nigerian Naira","NGN"},
								{"Honduras Lempira","HNL"},
								{"Argentine Peso","ARS"},
								{"Brazilian Rial","BRL"},
								{"Hungarian Forint","HUF"},
								{"Netherlands Antillean Guilder","ANG"},
								{"Yes"},{"No"}};
								
			
				String user12 = " ";
				while( user12 != "EUR" & user12 != "RUB" & user12 != "CHF" &
						user12 != "NOK" & user12 != "GRB" & user12 != "CNY" & user12 != "JPY" &
						user12 != "TRY" & user12 != "SKW" & user12 != "CND" & user12 != "USD" &
						user12 != "IRS" & user12 != "QAR" & user12 != "NGN" & user12 != "HNL" &
						user12 != "ARS" & user12 != "BRL" & user12 != "HUF" & user12 != "ANG") {
				
				System.out.print("\nYou have chosen Indian Rupee.");
				System.out.print("\nTo what currency would you like to convert into?\n");
				
				
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) ILS (Israeli New Shekel)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
			System.out.print("\nType a currency: ");
				user12 = input.next();
				user12 = user12.toUpperCase();
				
			if (user12.equals("USD")){
			
				
				System.out.print("\nYou have chosen United States Dollar.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double dollars = 0.014 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f$ United States Dollars.\n", rupees, dollars);
				
			}
			else if (user12.equals("EUR")){
				
				System.out.print("\nYou have chosen Euros.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double euros = 0.013 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f€ Euros.\n", rupees, euros);
			}
			else if (user12.equals("RUB")){
				
				System.out.print("\nYou have chosen Russian Ruble.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double rubles = 0.89 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f Russian Ruble.\n", rupees, rubles);
			}	
			else if (user12.equals("CHF")){
				
				System.out.print("\nYou have chosen Swiss Franc.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double francs = 0.014 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₣ Swiss Francs.\n", rupees, francs);
			}
			else if (user12.equals("NOK")){
				
				System.out.print("\nYou have chosen Norwegian Krona.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double kronas = 0.13 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fKr Norwegian Kronas.\n", rupees, kronas);
			}
			else if (user12.equals("GRB")){
				
				System.out.print("\nYou have chosen Pound Sterling.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double pounds = 0.011 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f£ Pounds Sterling.\n", rupees, pounds);
			}
			else if (user12.equals("CNY")){
				
				System.out.print("\nYou have chosen Chinise Yuan.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double yuans = 0.098 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f¥ Chinise Yuans.\n", rupees, yuans);;
			}
			else if (user12.equals("JPY")){
				
				System.out.print("\nYou have chosen Japanese Yen.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double yens = 1.56 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f¥ Japanese Yens.\n", rupees, yens);
			}
			else if (user12.equals("TRY")){
				
				System.out.print("\nYou have chosen Turkish Lira.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double liras = 0.085 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₤ Turkish Liras.\n", rupees, liras);
			}
			else if (user12.equals("SKW")){
				
				System.out.print("\nYou have chosen South Korea Won.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double wons = 16.79 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₩ South Korea Wons.\n", rupees, wons);
			}
			else if (user12.equals("CND")){
				
				System.out.print("\nYou have chosen Canadian Dollar.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double cdollars = 0.018 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fC$ Canadian Dollars.\n", rupees, cdollars);
			}
			else if (user12.equals("ILS")){
				
				System.out.print("\nYou have chosen Israeli New Shekel.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double shekels = 0.048 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₪ Israeli New Shekels.\n", rupees, shekels);
			}
			else if (user12.equals("QAR")){
				
				System.out.print("\nYou have chosen Qatari Rial.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double rials = 0.051 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f﷼ Qatari Rials.\n", rupees, rials);
			}
			else if (user12.equals("NGN")){
				
				System.out.print("\nYou have chosen Nigerian Naira.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double nairas = 5.05 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₦ Nigerian Nairas.\n", rupees, nairas);
			}
			else if (user12.equals("HNL")){
				
				System.out.print("\nYou have chosen Honduras Lempira.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double lempiras = 0.35 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fL Honduras Lempiras.\n", rupees, lempiras);
			}
			else if (user12.equals("ARS")){
				
				System.out.print("\nYou have chosen Argentine Peso.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double pesos = 0.86 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2f₱ Argentine Pesos.\n", rupees, pesos);
			}
			else if (user12.equals("BRL")){
				
				System.out.print("\nYou have chosen Brazilian Rial.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double brials = 0.061 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fR$ Brazilian Rials.\n", rupees, brials);
			}
			else if (user12.equals("HUF")){
				
				System.out.print("\nYou have chosen Hungarian Forint.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double forints = 4.35 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fFt Hungarian Forints.\n", rupees, forints);
			}
			else if (user12.equals("ANG")){
				
				System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
				System.out.print("\nPlease enter the currency amount of Indian Rupee: ");
				double rupees = input.nextDouble();
				
			
				double guilders = 0.025 * rupees + 1; 
				System.out.printf("\n%.2f₹ Indian Rupee = %.2fƒ Netherlands Antillean Guilders.\n", rupees, guilders);
			}
			else {
				System.out.println("\nError!, Please try again..");
				continue;
			}

			
			String answer12 = " ";
			while(answer12 != "Yes" & answer12 != "No") {
			
	System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
			
			answer12 = input.next();
			answer12 = answer12.toUpperCase();
			
			if (answer12.equals("NO")){
				System.out.print("\nCurrency Converter has stopped.");
				System.exit(0);
			}
			
			
			if(answer12.equals("YES")){
					String currency12 = " ";
					
				System.out.print("\nSelect a new currency: \n");
				System.out.println("\n1) USD (United States Dollar)");
				System.out.println("2) EUR (Euro)");
				System.out.println("3) RUB (Russian Ruble)");
				System.out.println("4) CHF (Swiss Franc)");
				System.out.println("5) NOK (Norwegian Krona)");
				System.out.println("6) GRB (Pound Sterling)");
				System.out.println("7) CNY (Chinise Yuan)");
				System.out.println("8) JPY (Japanese Yen)");
				System.out.println("9) TRY (Turkish Lira)");
				System.out.println("10) SKW (South Korea Won)");
				System.out.println("11) CND (Canadian Dollar)");
				System.out.println("12) ILS (Israeli New Shekel)");
				System.out.println("13) QAR (Qatari Rial)");
				System.out.println("14) NGN (Nigerian Naira)");
				System.out.println("15) HNL (Honduras Lempira)");
				System.out.println("16) ARS (Argentine Peso)");
				System.out.println("17) BRL (Brazilian Rial)");
				System.out.println("18) HUF (Hungarian Forint)");
				System.out.println("19) ANG (Netherlands Antillean Guilder)");
					System.out.print("\nType a currency: ");
					currency12 = input.next();
					currency12 = currency12.toUpperCase();
					
					
					if (currency12.equals("USD")) {
						usd();
					}
					else if (currency12.equals("EUR")){
						eu();
					}
					else if (currency12.equals("RUB")){
						rr();
					}
					else if (currency12.equals("CHF")){
						sf();
					}
					else if (currency12.equals("NOK")){
						nk();
					}
					else if (currency12.equals("GRB")){
						ps();
					}
					else if (currency12.equals("CNY")){
						cy();
					}
					else if (currency12.equals("JPY")){
						jy();
					}
					else if (currency12.equals("TRY")){
						tl();
					}
					else if (currency12.equals("SKW")){
						skw();
					}
					else if (currency12.equals("CND")){
						cd();
					}
					else if (currency12.equals("INR")){
						ir();
					}
					else if (currency12.equals("ILS")){
						ins();
					}
					else if (currency12.equals("QAR")){
						qr();
					}
					else if (currency12.equals("NGN")){
						nn();
					}
					else if (currency12.equals("HNL")){
						hdl();
					}
					else if (currency12.equals("ARS")){
						ap();
					}
					else if (currency12.equals("BRL")){
						br();
					}
					else if (currency12.equals("HUF")){
						hf();
					}
					else if (currency12.equals("ANG")){
						nag();
					}
					else{
						System.out.println("\nError!, Please try again..");
					}
				}
			continue;
			}
		}
	}
	
		
	public static void ins() {
		Scanner input = new Scanner(System.in);
			String [][] iLS = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user13 = " ";
			while( user13 != "EUR" & user13 != "RUB" & user13 != "CHF" &
					user13 != "NOK" & user13 != "GRB" & user13 != "CNY" & user13 != "JPY" &
					user13 != "TRY" & user13 != "SKW" & user13 != "CND" & user13 != "INR" &
					user13 != "USD" & user13 != "QAR" & user13 != "NGN" & user13 != "HNL" &
					user13 != "ARS" & user13 != "BRL" & user13 != "HUF" & user13 != "ANG") {
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) QAR (Qatari Rial)");
		System.out.println("14) NGN (Nigerian Naira)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user13 = input.next();
			user13 = user13.toUpperCase();
			
		if (user13.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double dollars = 0.29 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f$ United States Dollars.\n", shekels, dollars);
			
		}
		else if (user13.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double euros = 0.27 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f€ Euros.\n", shekels, euros);
		}
		else if (user13.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double rubles = 18.72 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₽ Russian Rubles.\n", shekels, rubles);
		}
		else if (user13.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double francs = 0.29 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₣ Swiss Francs.\n", shekels, francs);
		}
		else if (user13.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double kronas = 2.72 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fKr Norwegian Kronas.\n", shekels, kronas);
		}
		else if (user13.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double pounds = 0.23 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f£ Pounds Sterling.\n", shekels, pounds);
		}
		else if (user13.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double yuans = 2.05 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f¥ Chinise Yuans.\n", shekels, yuans);;
		}
		else if (user13.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double yens = 32.68 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f¥ Japanese Yens.\n", shekels, yens);
		}
		else if (user13.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double liras = 1.78 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₤ Turkish Liras.\n", shekels, liras);
		}
		else if (user13.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double wons = 352.62 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₩ South Korea Wons.\n", shekels, wons);
		}
		else if (user13.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double cdollars = 0.39 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fC$ Canadian Dollars.\n", shekels, cdollars);
		}
		else if (user13.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double rupees = 21.00 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₹ Indian Rupees.\n", shekels, rupees);
		}
		else if (user13.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double rials = 1.06 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f﷼ Qatari Rials.\n", shekels, rials);
		}
		else if (user13.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double nairas = 106.12 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₦ Nigerian Nairas.\n", shekels, nairas);
		}
		else if (user13.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double lempiras = 7.31 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fL Honduras Lempiras.\n", shekels, lempiras);
		}
		else if (user13.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double pesos = 18.04 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2f₱ Argentine Pesos.\n", shekels, pesos);
		}
		else if (user13.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double brials = 1.28 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fR$ Brazilian Rials.\n", shekels, brials);
		}
		else if (user13.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double forints = 91.41 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fFt Hungarian Forints.\n", shekels, forints);
		}
		else if (user13.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Israeli New Shekels: ");
			double shekels = input.nextDouble();
			
		
			double guilders = 0.52 * shekels + 1; 
			System.out.printf("\n%.2f₪ Israeli New Shekels = %.2fƒ Netherlands Antillean Guilders.\n", shekels, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
		String answer13 = " ";
		while(answer13 != "Yes" & answer13 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer13 = input.next();
		answer13 = answer13.toUpperCase();
		
		if (answer13.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer13.equals("YES")){
				String currency13 = " ";
			
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) QAR (Qatari Rial)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency13 = input.next();
				currency13 = currency13.toUpperCase();
				
				
				if (currency13.equals("USD")) {
					usd();
				}
				else if (currency13.equals("EUR")){
					eu();
				}
				else if (currency13.equals("RUB")){
					rr();
				}
				else if (currency13.equals("CHF")){
					sf();
				}
				else if (currency13.equals("NOK")){
					nk();
				}
				else if (currency13.equals("GRB")){
					ps();
				}
				else if (currency13.equals("CNY")){
					cy();
				}
				else if (currency13.equals("JPY")){
					jy();
				}
				else if (currency13.equals("TRY")){
					tl();
				}
				else if (currency13.equals("SKW")){
					skw();
				}
				else if (currency13.equals("CND")){
					cd();
				}
				else if (currency13.equals("INR")){
					ir();
				}
				else if (currency13.equals("ILS")){
					ins();
				}
				else if (currency13.equals("QAR")){
					qr();
				}
				else if (currency13.equals("NGN")){
					nn();
				}
				else if (currency13.equals("HNL")){
					hdl();
				}
				else if (currency13.equals("ARS")){
					ap();
				}
				else if (currency13.equals("BRL")){
					br();
				}
				else if (currency13.equals("HUF")){
					hf();
				}
				else if (currency13.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
		
	public static void qr() {
		Scanner input = new Scanner(System.in);
				String [][] qAR = {{"United States Dollar","USD"},
								{"Euro","EUR"},
								{"Russian Ruble","RUB"},
								{"Swiss Franc","CHF"},
								{"Norwegian Krona","NOK"},
								{"Pound Sterling","GRB"},
								{"Chinise Yuan","CNY"},
								{"Japanese Yen","JPY"},
								{"Turkish Lira","TRY"},
								{"South Korea Won","SKW"},
								{"Canadian Dollar","CND"},
								{"Indian Rupee","INR"},
								{"Israeli New Shekel","ILS"},
								{"Nigerian Naira","NGN"},
								{"Honduras Lempira","HNL"},
								{"Argentine Peso","ARS"},
								{"Brazilian Rial","BRL"},
								{"Hungarian Forint","HUF"},
								{"Netherlands Antillean Guilder","ANG"},
								{"Yes"},{"No"}};
								
			
				String user14 = " ";
				while( user14 != "EUR" & user14 != "RUB" & user14 != "CHF" &
						user14 != "NOK" & user14 != "GRB" & user14 != "CNY" & user14 != "JPY" &
						user14 != "TRY" & user14 != "SKW" & user14 != "CND" & user14 != "INR" &
						user14 != "IRS" & user14 != "USD" & user14 != "NGN" & user14 != "HNL" &
						user14 != "ARS" & user14 != "BRL" & user14 != "HUF" & user14 != "ANG") {
				
				System.out.print("\nYou have chosen Qatari Rial.");
				System.out.print("\nTo what currency would you like to convert into?\n");
				
				
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) ILS (Israeli New Shekel)");
			System.out.println("14) NGN (Nigerian Naira)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
			System.out.print("\nType a currency: ");
				user14 = input.next();
				user14 = user14.toUpperCase();
				
			if (user14.equals("USD")){
			
				
				System.out.print("\nYou have chosen United States Dollar.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double dollars = 0.27 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f$ United States Dollars.\n", rials, dollars);
				
			}
			else if (user14.equals("EUR")){
				
				System.out.print("\nYou have chosen Euros.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double euros = 0.25 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f€ Euros.\n", rials, euros);
			}
			else if (user14.equals("RUB")){
				
				System.out.print("\nYou have chosen Russian Ruble.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double rubles = 17.62 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₽ Russian Rubles.\n", rials, rubles);
			}
			else if (user14.equals("CHF")){
				
				System.out.print("\nYou have chosen Swiss Franc.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double francs = 0.27 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₣ Swiss Francs.\n", rials, francs);
			}
			else if (user14.equals("NOK")){
				
				System.out.print("\nYou have chosen Norwegian Krona.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double kronas = 2.56 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fKr Norwegian Kronas.\n", rials, kronas);
			}
			else if (user14.equals("GRB")){
				
				System.out.print("\nYou have chosen Pound Sterling.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double pounds = 0.21 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f£ Pounds Sterling.\n", rials, pounds);
			}
			else if (user14.equals("CNY")){
				
				System.out.print("\nYou have chosen Chinise Yuan.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double yuans = 1.93 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f¥ Chinise Yuans.\n", rials, yuans);;
			}
			else if (user14.equals("JPY")){
				
				System.out.print("\nYou have chosen Japanese Yen.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double yens =  30.74 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f¥ Japanese Yens.\n", rials, yens);
			}
			else if (user14.equals("TRY")){
				
				System.out.print("\nYou have chosen Turkish Lira.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double liras = 1.68 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₤ Turkish Liras.\n", rials, liras);
			}
			else if (user14.equals("SKW")){
				
				System.out.print("\nYou have chosen South Korea Won.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double wons = 331.71 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₩ South Korea Wons.\n", rials, wons);
			}
			else if (user14.equals("CND")){
				
				System.out.print("\nYou have chosen Canadian Dollar.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double cdollars = 0.36 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fC$ Canadian Dollars.\n", rials, cdollars);
			}
			else if (user14.equals("INR")){
				
				System.out.print("\nYou have chosen Indian Rupee.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double rupees = 19.76 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₹ Indian Rupees.\n", rials, rupees);
			}
			else if (user14.equals("ILS")){
				
				System.out.print("\nYou have chosen Israeli New Shekel.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double shekels = 0.94 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₪ Israeli New Shekels.\n", rials, shekels);
			}
			else if (user14.equals("NGN")){
				
				System.out.print("\nYou have chosen Nigerian Naira.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double nairas = 99.85 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₦ Nigerian Nairas.\n", rials, nairas);
			}
			else if (user14.equals("HNL")){
				
				System.out.print("\nYou have chosen Honduras Lempira.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double lempiras = 6.88 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fL Honduras Lempiras.\n", rials, lempiras);
			}
			else if (user14.equals("ARS")){
				
				System.out.print("\nYou have chosen Argentine Peso.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double pesos = 16.97 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2f₱ Argentine Pesos.\n", rials, pesos);
			}
			else if (user14.equals("BRL")){
				
				System.out.print("\nYou have chosen Brazilian Rial.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double brials = 1.21 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fR$ Brazilian Rials.\n", rials, brials);
			}
			else if (user14.equals("HUF")){
				
				System.out.print("\nYou have chosen Hungarian Forint.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double forints = 85.98 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fFt Hungarian Forints.\n", rials, forints);
			}
			else if (user14.equals("ANG")){
				
				System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
				System.out.print("\nPlease enter the currency amount of Qatari Rials: ");
				double rials = input.nextDouble();
				
			
				double guilders = 0.49 * rials + 1; 
				System.out.printf("\n%.2f﷼ Qatari Rials = %.2fƒ Netherlands Antillean Guilders.\n", rials, guilders);
			}
			else {
				System.out.println("\nError!, Please try again..");
				continue;
			}

			
			String answer14 = " ";
			while(answer14 != "Yes" & answer14 != "No") {
			
	System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
			
			answer14 = input.next();
			answer14 = answer14.toUpperCase();
			
			if (answer14.equals("NO")){
				System.out.print("\nCurrency Converter has stopped.");
				System.exit(0);
			}
			
			
			if(answer14.equals("YES")){
					String currency14 = " ";
					
				System.out.print("\nSelect a new currency: \n");
				System.out.println("\n1) USD (United States Dollar)");
				System.out.println("2) EUR (Euro)");
				System.out.println("3) RUB (Russian Ruble)");
				System.out.println("4) CHF (Swiss Franc)");
				System.out.println("5) NOK (Norwegian Krona)");
				System.out.println("6) GRB (Pound Sterling)");
				System.out.println("7) CNY (Chinise Yuan)");
				System.out.println("8) JPY (Japanese Yen)");
				System.out.println("9) TRY (Turkish Lira)");
				System.out.println("10) SKW (South Korea Won)");
				System.out.println("11) CND (Canadian Dollar)");
				System.out.println("12) INR (Indian Rupee)");
				System.out.println("13) ILS (Israeli New Shekel)");
				System.out.println("14) NGN (Nigerian Naira)");
				System.out.println("15) HNL (Honduras Lempira)");
				System.out.println("16) ARS (Argentine Peso)");
				System.out.println("17) BRL (Brazilian Rial)");
				System.out.println("18) HUF (Hungarian Forint)");
				System.out.println("19) ANG (Netherlands Antillean Guilder)");
					System.out.print("\nType a currency: ");
					currency14 = input.next();
					currency14 = currency14.toUpperCase();
					
					
					if (currency14.equals("USD")) {
						usd();
					}
					else if (currency14.equals("EUR")){
						eu();
					}
					else if (currency14.equals("RUB")){
						rr();
					}
					else if (currency14.equals("CHF")){
						sf();
					}
					else if (currency14.equals("NOK")){
						nk();
					}
					else if (currency14.equals("GRB")){
						ps();
					}
					else if (currency14.equals("CNY")){
						cy();
					}
					else if (currency14.equals("JPY")){
						jy();
					}
					else if (currency14.equals("TRY")){
						tl();
					}
					else if (currency14.equals("SKW")){
						skw();
					}
					else if (currency14.equals("CND")){
						cd();
					}
					else if (currency14.equals("INR")){
						ir();
					}
					else if (currency14.equals("ILS")){
						ins();
					}
					else if (currency14.equals("QAR")){
						qr();
					}
					else if (currency14.equals("NGN")){
						nn();
					}
					else if (currency14.equals("HNL")){
						hdl();
					}
					else if (currency14.equals("ARS")){
						ap();
					}
					else if (currency14.equals("BRL")){
						br();
					}
					else if (currency14.equals("HUF")){
						hf();
					}
					else if (currency14.equals("ANG")){
						nag();
					}
					else {
						System.out.println("\nError!, Please try again..");
					}
				}
			continue;
			}
		}
	}
	
					
	public static void nn() {
		Scanner input = new Scanner(System.in);
			String [][] nGN = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user15 = " ";
			while( user15 != "EUR" & user15 != "RUB" & user15 != "CHF" &
					user15 != "NOK" & user15 != "GRB" & user15 != "CNY" & user15 != "JPY" &
					user15 != "TRY" & user15 != "SKW" & user15 != "CND" & user15 != "INR" &
					user15 != "IRS" & user15 != "QAR" & user15 != "USD" & user15 != "HNL" &
					user15 != "ARS" & user15 != "BRL" & user15 != "HUF" & user15 != "ANG") {
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) HNL (Honduras Lempira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user15 = input.next();
			user15 = user15.toUpperCase();
			
		if (user15.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double dollars = 0.0028 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f$ United States Dollars.\n", nairas, dollars);
			
		}
		else if (user15.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double euros = 0.0025 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Naira = %.2f€ Euros.\n", nairas, euros);
		}
		else if (user15.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double rubles = 0.18 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₽ Russian Rubles.\n", nairas, rubles);
		}
		else if (user15.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double francs = 0.0027 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Naira = %.2f₣ Swiss Francs.\n", nairas, francs);
		}
		else if (user15.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double kronas = 0.026 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fKr Norwegian Kronas.\n", nairas, kronas);
		}
		else if (user15.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double pounds = 0.0021 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f£ Pounds Sterling.\n", nairas, pounds);
		}
		else if (user15.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double yuans = 0.019 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f¥ Chinise Yuans.\n", nairas, yuans);;
		}
		else if (user15.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double yens = 0.31 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f¥ Japanese Yens.\n", nairas, yens);
		}
		else if (user15.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double liras = 0.017 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₤ Turkish Liras.\n", nairas, liras);
		}
		else if (user15.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double wons = 3.32 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₩ South Korea Wons.\n", nairas, wons);
		}
		else if (user15.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double cdollars = 0.0036 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fC$ Canadian Dollars.\n", nairas, cdollars);
		}
		else if (user15.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double rupees = 0.20 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₹ Indian Rupees.\n", nairas, rupees);
		}
		else if (user15.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double shekels = 0.0094 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₪ Israeli New Shekels.\n", nairas, shekels);
		}
		else if (user15.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double rials = 0.010 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f﷼ Qatari Rials.\n", nairas, rials);
		}
		else if (user15.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double lempiras = 0.069 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fL Honduras Lempiras.\n", nairas, lempiras);
		}
		else if (user15.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double pesos = 0.17 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2f₱ Argentine Pesos.\n", nairas, pesos);
		}
		else if (user15.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double brials = 0.012 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fR$ Brazilian Rials.\n", nairas, brials);
		}
		else if (user15.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double forints = 0.86 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fFt Hungarian Forints.\n", nairas, forints);
		}
		else if (user15.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Nigerian Nairas: ");
			double nairas = input.nextDouble();
			
		
			double guilders = 0.0049 * nairas + 1; 
			System.out.printf("\n%.2f₦ Nigerian Nairas = %.2fƒ Netherlands Antillean Guilders.\n", nairas, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer15 = " ";
		while(answer15 != "Yes" & answer15 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer15 = input.next();
		answer15 = answer15.toUpperCase();
		
		if (answer15.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer15.equals("YES")){
				String currency15 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) HNL (Honduras Lempira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency15 = input.next();
				currency15 = currency15.toUpperCase();
				
				
				if (currency15.equals("USD")) {
					usd();
				}
				else if (currency15.equals("EUR")){
					eu();
				}
				else if (currency15.equals("RUB")){
					rr();
				}
				else if (currency15.equals("CHF")){
					sf();
				}
				else if (currency15.equals("NOK")){
					nk();
				}
				else if (currency15.equals("GRB")){
					ps();
				}
				else if (currency15.equals("CNY")){
					cy();
				}
				else if (currency15.equals("JPY")){
					jy();
				}
				else if (currency15.equals("TRY")){
					tl();
				}
				else if (currency15.equals("SKW")){
					skw();
				}
				else if (currency15.equals("CND")){
					cd();
				}
				else if (currency15.equals("INR")){
					ir();
				}
				else if (currency15.equals("ILS")){
					ins();
				}
				else if (currency15.equals("QAR")){
					qr();
				}
				else if (currency15.equals("NGN")){
					nn();
				}
				else if (currency15.equals("HNL")){
					hdl();
				}
				else if (currency15.equals("ARS")){
					ap();
				}
				else if (currency15.equals("BRL")){
					br();
				}
				else if (currency15.equals("HUF")){
					hf();
				}
				else if (currency15.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
				
	public static void hdl() {
		Scanner input = new Scanner(System.in);
			String [][] hNL = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user16 = " ";
			while( user16 != "EUR" & user16 != "RUB" & user16 != "CHF" &
					user16 != "NOK" & user16 != "GRB" & user16 != "CNY" & user16 != "JPY" &
					user16 != "TRY" & user16 != "SKW" & user16 != "CND" & user16 != "INR" &
					user16 != "IRS" & user16 != "QAR" & user16 != "NGN" & user16 != "USD" &
					user16 != "ARS" & user16 != "BRL" & user16 != "HUF" & user16 != "ANG") {
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) NGN (Nigerian Naira)");
		System.out.println("16) ARS (Argentine Peso)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user16 = input.next();
			user16 = user16.toUpperCase();
			
		if (user16.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double dollars = 0.040 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f$ United States Dollars.\n", lempiras, dollars);
			
		}
		else if (user16.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double euros = 0.037 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f€ Euros.\n", lempiras, euros);
		}
		else if (user16.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double rubles = 2.56 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₽ Russian Rubles.\n", lempiras, rubles);
		}
		else if (user16.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double francs = 0.039 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₣ Swiss Francs.\n", lempiras, francs);
		}
		else if (user16.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double kronas = 0.37 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2fKr Norwegian Kronas.\n", lempiras, kronas);
		}
		else if (user16.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double pounds = 0.031 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f£ Pounds Sterling.\n", lempiras, pounds);
		}
		else if (user16.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double yuans = 0.28 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f¥ Chinise Yuans.\n", lempiras, yuans);;
		}
		else if (user16.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double yens = 4.47 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f¥ Japanese Yens.\n", lempiras, yens);
		}
		else if (user16.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double liras = 0.24 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₤ Turkish Liras.\n", lempiras, liras);
		}
		else if (user16.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double wons = 48.23 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₩ South Korea Wons.\n", lempiras, wons);
		}
		else if (user16.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double cdollars = 0.053 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2fC$ Canadian Dollars.\n", lempiras, cdollars);
		}
		else if (user16.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double rupees = 2.87 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₹ Indian Rupees.\n", lempiras, rupees);
		}
		else if (user16.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double shekels = 0.14 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₪ Israeli New Shekels.\n", lempiras, shekels);
		}
		else if (user16.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double rials = 0.15 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f﷼ Qatari Rials.\n", lempiras, rials);
		}
		else if (user16.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double nairas = 14.51 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₦ Nigerian Nairas.\n", lempiras, nairas);
		}
		else if (user16.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double pesos = 2.47 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2f₱ Argentine Pesos.\n", lempiras, pesos);
		}
		else if (user16.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double brials = 0.18 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2fR$ Brazilian Rials.\n", lempiras, brials);
		}
		else if (user16.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double forints = 12.50 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2fFt Hungarian Forints.\n", lempiras, forints);
		}
		else if (user16.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Honduras Lempiras: ");
			double lempiras = input.nextDouble();
			
		
			double guilders = 0.071 * lempiras + 1; 
			System.out.printf("\n%.2fL Honduras Lempiras = %.2fƒ Netherlands Antillean Guilders.\n", lempiras, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer16 = " ";
		while(answer16 != "Yes" & answer16 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer16 = input.next();
		answer16 = answer16.toUpperCase();
		
		if (answer16.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer16.equals("YES")){
				String currency16 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) ARS (Argentine Peso)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency16 = input.next();
				currency16 = currency16.toUpperCase();
				
				
				if (currency16.equals("USD")) {
					usd();
				}
				else if (currency16.equals("EUR")){
					eu();
				}
				else if (currency16.equals("RUB")){
					rr();
				}
				else if (currency16.equals("CHF")){
					sf();
				}
				else if (currency16.equals("NOK")){
					nk();
				}
				else if (currency16.equals("GRB")){
					ps();
				}
				else if (currency16.equals("CNY")){
					cy();
				}
				else if (currency16.equals("JPY")){
					jy();
				}
				else if (currency16.equals("TRY")){
					tl();
				}
				else if (currency16.equals("SKW")){
					skw();
				}
				else if (currency16.equals("CND")){
					cd();
				}
				else if (currency16.equals("INR")){
					ir();
				}
				else if (currency16.equals("ILS")){
					ins();
				}
				else if (currency16.equals("QAR")){
					qr();
				}
				else if (currency16.equals("NGN")){
					nn();
				}
				else if (currency16.equals("HNL")){
					hdl();
				}
				else if (currency16.equals("ARS")){
					ap();
				}
				else if (currency16.equals("BRL")){
					br();
				}
				else if (currency16.equals("HUF")){
					hf();
				}
				else if (currency16.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again");
				}
			}
		continue;
		}
	}
	}
	
				
	public static void ap() {
		Scanner input = new Scanner(System.in);
			String [][] aRS = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user17 = " ";
			while( user17 != "EUR" & user17 != "RUB" & user17 != "CHF" &
					user17 != "NOK" & user17 != "GRB" & user17 != "CNY" & user17 != "JPY" &
					user17 != "TRY" & user17 != "SKW" & user17 != "CND" & user17 != "INR" &
					user17 != "IRS" & user17 != "QAR" & user17 != "NGN" & user17 != "HNL" &
					user17 != "USD" & user17 != "BRL" & user17 != "HUF" & user17 != "ANG") {
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) NGN (Nigerian Naira)");
		System.out.println("16) HNL (Honduras Lempira)");
		System.out.println("17) BRL (Brazilian Rial)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user17 = input.next();
			user17 = user17.toUpperCase();
			
		if (user17.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double dollars = 0.016 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f$ United States Dollars.\n", pesos, dollars);
			
		}
		else if (user17.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double euros = 0.015 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f€ Euros.\n", pesos, euros);
		}
		else if (user17.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double rubles = 1.04 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₽ Russian Rubles.\n", pesos, rubles);
		}
		else if (user17.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double francs = 0.016 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₣ Swiss Francs.\n", pesos, francs);
		}
		else if (user17.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double kronas = 0.15 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fKr Norwegian Kronas.\n", pesos, kronas);
		}
		else if (user17.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double pounds = 0.013 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f£ Pounds Sterling.\n", pesos, pounds);
		}
		else if (user17.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double yuans = 0.11 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f¥ Chinise Yuans.\n", pesos, yuans);;
		}
		else if (user17.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double yens = 1.81 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f¥ Japanese Yens.\n", pesos, yens);
		}
		else if (user17.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double liras = 0.099 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₤ Turkish Liras.\n", pesos, liras);
		}
		else if (user17.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double wons = 19.55 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₩ South Korea Wons.\n", pesos, wons);
		}
		else if (user17.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double cdollars = 0.021 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fC$ Canadian Dollars.\n", pesos, cdollars);
		}
		else if (user17.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double rupees = 1.16 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₹ Indian Rupees.\n", pesos, rupees);
		}
		else if (user17.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double shekels = 0.055 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₪ Israeli New Shekels.\n", pesos, shekels);
		}
		else if (user17.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double rials = 0.059 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f﷼ Qatari Rials.\n", pesos, rials);
		}
		else if (user17.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double nairas = 5.88 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2f₦ Nigerian Nairas.\n", pesos, nairas);
		}
		else if (user17.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double lempiras = 0.41 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fL Honduras Lempiras.\n", pesos, lempiras);
		}
		else if (user17.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double brials = 0.071 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fR$ Brazilian Rials.\n", pesos, brials);
		}
		else if (user17.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double forints = 5.07 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fFt Hungarian Forints.\n", pesos, forints);
		}
		else if (user17.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Argentine Pesos: ");
			double pesos = input.nextDouble();
			
		
			double guilders = 0.029 * pesos + 1; 
			System.out.printf("\n%.2f₱ Argentine Pesos = %.2fƒ Netherlands Antillean Guilders.\n", pesos, guilders);
		}
		else {
			System.out.println("\nError!, Please try agian..");
			continue;
		}

		
		String answer17 = " ";
		while(answer17 != "Yes" & answer17 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer17 = input.next();
		answer17 = answer17.toUpperCase();
		
		if (answer17.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer17.equals("YES")){
				String currency17 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) HNL (Honduras Lempira)");
			System.out.println("17) BRL (Brazilian Rial)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency17 = input.next();
				currency17 = currency17.toUpperCase();
				
				
				if (currency17.equals("USD")) {
					usd();
				}
				else if (currency17.equals("EUR")){
					eu();
				}
				else if (currency17.equals("RUB")){
					rr();
				}
				else if (currency17.equals("CHF")){
					sf();
				}
				else if (currency17.equals("NOK")){
					nk();
				}
				else if (currency17.equals("GRB")){
					ps();
				}
				else if (currency17.equals("CNY")){
					cy();
				}
				else if (currency17.equals("JPY")){
					jy();
				}
				else if (currency17.equals("TRY")){
					tl();
				}
				else if (currency17.equals("SKW")){
					skw();
				}
				else if (currency17.equals("CND")){
					cd();
				}
				else if (currency17.equals("INR")){
					ir();
				}
				else if (currency17.equals("ILS")){
					ins();
				}
				else if (currency17.equals("QAR")){
					qr();
				}
				else if (currency17.equals("NGN")){
					nn();
				}
				else if (currency17.equals("HNL")){
					hdl();
				}
				else if (currency17.equals("ARS")){
					ap();
				}
				else if (currency17.equals("BRL")){
					br();
				}
				else if (currency17.equals("HUF")){
					hf();
				}
				else if (currency17.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
		
	public static void br() {
		Scanner input = new Scanner(System.in);
			String [][] bRL = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Hungarian Forint","HUF"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user18 = " ";
			while( user18 != "EUR" & user18 != "RUB" & user18 != "CHF" &
					user18 != "NOK" & user18 != "GRB" & user18 != "CNY" & user18 != "JPY" &
					user18 != "TRY" & user18 != "SKW" & user18 != "CND" & user18 != "INR" &
					user18 != "IRS" & user18 != "QAR" & user18 != "NGN" & user18 != "HNL" &
					user18 != "ARS" & user18 != "USD" & user18 != "HUF" & user18 != "ANG") {
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) NGN (Nigerian Naira)");
		System.out.println("16) HNL (Honduras Lempira)");
		System.out.println("17) ARS (Argentine Peso)");
		System.out.println("18) HUF (Hungarian Forint)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user18 = input.next();
			user18 = user18.toUpperCase();
			
		if (user18.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double dollars = 0.23 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f$ United States Dollars.\n", brials, dollars);
			
		}
		else if (user18.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double euros = 0.21 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f€ Euros.\n", brials, euros);
		}
		else if (user18.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double rubles = 14.59 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₽ Russian Rubles.\n", brials, rubles);
		}
		else if (user18.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double francs = 0.22 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₣ Swiss Francs.\n", brials, francs);
		}
		else if (user18.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double kronas = 2.12 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2fKr Norwegian Kronas.\n", brials, kronas);
		}
		else if (user18.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double pounds = 0.18 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f£ Pounds Sterling.\n", brials, pounds);
		}
		else if (user18.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double yuans = 1.60 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f¥ Chinise Yuans.\n", brials, yuans);;
		}
		else if (user18.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double yens = 25.50 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f¥ Japanese Yens.\n", brials, yens);
		}
		else if (user18.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double liras = 1.39 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₤ Turkish Liras.\n", brials, liras);
		}
		else if (user18.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double wons = 275.03 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₩ South Korea Wons.\n", brials, wons);
		}
		else if (user18.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double cdollars = 0.30 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2fC$ Canadian Dollars.\n", brials, cdollars);
		}
		else if (user18.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double rupees = 16.38 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₹ Indian Rupees.\n", brials, rupees);
		}
		else if (user18.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double shekels = 0.78 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₪ Israeli New Shekels.\n", brials, shekels);
		}
		else if (user18.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double rials = 0.83 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f﷼ Qatari Rials.\n", brials, rials);
		}
		else if (user18.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double nairas = 82.76 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₦ Nigerian Nairas.\n", brials, nairas);
		}
		else if (user18.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double lempiras = 5.70 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2fL Honduras Lempiras.\n", brials, lempiras);
		}
		else if (user18.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double pesos = 14.06 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2f₱ Argentine Pesos.\n", brials, pesos);
		}
		else if (user18.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double forints = 71.28 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2fFt Hungarian Forints.\n", brials, forints);
		}
		else if (user18.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Brazilian Rials: ");
			double brials = input.nextDouble();
			
		
			double guilders = 0.41 * brials + 1; 
			System.out.printf("\n%.2fR$ Brazilian Rials = %.2fƒ Netherlands Antillean Guilders.\n", brials, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
		String answer18 = " ";
		while(answer18 != "Yes" & answer18 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer18 = input.next();
		answer18 = answer18.toUpperCase();
		
		if (answer18.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer18.equals("YES")){
				String currency18 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) HNL (Honduras Lempira)");
			System.out.println("17) ARS (Argentine Peso)");
			System.out.println("18) HUF (Hungarian Forint)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency18 = input.next();
				currency18 = currency18.toUpperCase();
				
				
				if (currency18.equals("USD")) {
					usd();
				}
				else if (currency18.equals("EUR")){
					eu();
				}
				else if (currency18.equals("RUB")){
					rr();
				}
				else if (currency18.equals("CHF")){
					sf();
				}
				else if (currency18.equals("NOK")){
					nk();
				}
				else if (currency18.equals("GRB")){
					ps();
				}
				else if (currency18.equals("CNY")){
					cy();
				}
				else if (currency18.equals("JPY")){
					jy();
				}
				else if (currency18.equals("TRY")){
					tl();
				}
				else if (currency18.equals("SKW")){
					skw();
				}
				else if (currency18.equals("CND")){
					cd();
				}
				else if (currency18.equals("INR")){
					ir();
				}
				else if (currency18.equals("ILS")){
					ins();
				}
				else if (currency18.equals("QAR")){
					qr();
				}
				else if (currency18.equals("NGN")){
					nn();
				}
				else if (currency18.equals("HNL")){
					hdl();
				}
				else if (currency18.equals("ARS")){
					ap();
				}
				else if (currency18.equals("BRL")){
					br();
				}
				else if (currency18.equals("HUF")){
					hf();
				}
				else if (currency18.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
			
	public static void hf() {
		Scanner input = new Scanner(System.in);
			String [][] hUF = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Netherlands Antillean Guilder","ANG"},
							{"Yes"},{"No"}};
							
		
			String user19 = " ";
			while( user19 != "EUR" & user19 != "RUB" & user19 != "CHF" &
					user19 != "NOK" & user19 != "GRB" & user19 != "CNY" & user19 != "JPY" &
					user19 != "TRY" & user19 != "SKW" & user19 != "CND" & user19 != "INR" &
					user19 != "IRS" & user19 != "QAR" & user19 != "NGN" & user19 != "HNL" &
					user19 != "ARS" & user19 != "BRL" & user19 != "	USD" & user19 != "ANG") {
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) NGN (Nigerian Naira)");
		System.out.println("16) HNL (Honduras Lempira)");
		System.out.println("17) ARS (Argentine Peso)");
		System.out.println("18) BRL (Brazilian Rial)");
		System.out.println("19) ANG (Netherlands Antillean Guilder)");
		System.out.print("\nType a currency: ");
			user19 = input.next();
			user19 = user19.toUpperCase();
			
		if (user19.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double dollars = 0.0032 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f$ United States Dollars.\n", forints, dollars);
			
		}
		else if (user19.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double euros = 0.0030 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forint = %.2f€ Euros.\n", forints, euros);
		}
		else if (user19.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double rubles = 0.20 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₽ Russian Rubles.\n", forints, rubles);
		}
		else if (user19.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double francs = 0.0031 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forint = %.2f₣ Swiss Francs.\n", forints, francs);
		}
		else if (user19.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double kronas = 0.030 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2fKr Norwegian Kronas.\n", forints, kronas);
		}
		else if (user19.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double pounds =  0.0025 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f£ Pounds Sterling.\n", forints, pounds);
		}
		else if (user19.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double yuans = 0.022 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f¥ Chinise Yuans.\n", forints, yuans);;
		}
		else if (user19.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double yens = 0.36 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f¥ Japanese Yens.\n", forints, yens);
		}
		else if (user19.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double liras = 0.019 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₤ Turkish Liras.\n", forints, liras);
		}
		else if (user19.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double wons = 3.86 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₩ South Korea Wons.\n", forints, wons);
		}
		else if (user19.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double cdollars = 0.0042 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2fC$ Canadian Dollars.\n", forints, cdollars);
		}
		else if (user19.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double rupees = 0.23 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₹ Indian Rupees.\n", forints, rupees);
		}
		else if (user19.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double shekels = 0.011 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₪ Israeli New Shekels.\n", forints, shekels);
		}
		else if (user19.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double rials = 0.012 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f﷼ Qatari Rials.\n", forints, rials);
		}
		else if (user19.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double nairas = 1.16 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₦ Nigerian Nairas.\n", forints, nairas);
		}
		else if (user19.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double lempiras = 0.080 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2fL Honduras Lempiras.\n", forints, lempiras);
		}
		else if (user19.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double pesos = 0.20 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2f₱ Argentine Pesos.\n", forints, pesos);
		}
		else if (user19.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double brials = 0.014 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2fR$ Brazilian Rials.\n", forints, brials);
		}
		else if (user19.equals("ANG")){
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nPlease enter the currency amount of Hundarian Forints: ");
			double forints = input.nextDouble();
			
		
			double guilders = 0.0057 * forints + 1; 
			System.out.printf("\n%.2f Hundarian Forints = %.2fƒ Netherlands Antillean Guilders.\n", forints, guilders);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}
		
		String answer19 = " ";
		while(answer19 != "Yes" & answer19 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer19 = input.next();
		answer19 = answer19.toUpperCase();
		
		if (answer19.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer19.equals("YES")){
				String currency19 = " ";
				
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) HNL (Honduras Lempira)");
			System.out.println("17) ARS (Argentine Peso)");
			System.out.println("18) BRL (Brazilian Rial)");
			System.out.println("19) ANG (Netherlands Antillean Guilder)");
				System.out.print("\nType a currency: ");
				currency19 = input.next();
				currency19 = currency19.toUpperCase();
				
				
				if (currency19.equals("USD")) {
					usd();
				}
				else if (currency19.equals("EUR")){
					eu();
				}
				else if (currency19.equals("RUB")){
					rr();
				}
				else if (currency19.equals("CHF")){
					sf();
				}
				else if (currency19.equals("NOK")){
					nk();
				}
				else if (currency19.equals("GRB")){
					ps();
				}
				else if (currency19.equals("CNY")){
					cy();
				}
				else if (currency19.equals("JPY")){
					jy();
				}
				else if (currency19.equals("TRY")){
					tl();
				}
				else if (currency19.equals("SKW")){
					skw();
				}
				else if (currency19.equals("CND")){
					cd();
				}
				else if (currency19.equals("INR")){
					ir();
				}
				else if (currency19.equals("ILS")){
					ins();
				}
				else if (currency19.equals("QAR")){
					qr();
				}
				else if (currency19.equals("NGN")){
					nn();
				}
				else if (currency19.equals("HNL")){
					hdl();
				}
				else if (currency19.equals("ARS")){
					ap();
				}
				else if (currency19.equals("BRL")){
					br();
				}
				else if (currency19.equals("HUF")){
					hf();
				}
				else if (currency19.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}
	}
	}
	
			
	public static void nag() {
		Scanner input = new Scanner(System.in);
			String [][] aNG = {{"United States Dollar","USD"},
							{"Euro","EUR"},
							{"Russian Ruble","RUB"},
							{"Swiss Franc","CHF"},
							{"Norwegian Krona","NOK"},
							{"Pound Sterling","GRB"},
							{"Chinise Yuan","CNY"},
							{"Japanese Yen","JPY"},
							{"Turkish Lira","TRY"},
							{"South Korea Won","SKW"},
							{"Canadian Dollar","CND"},
							{"Indian Rupee","INR"},
							{"Israeli New Shekel","ILS"},
							{"Qatari Rial","QAR"},
							{"Nigerian Naira","NGN"},
							{"Honduras Lempira","HNL"},
							{"Argentine Peso","ARS"},
							{"Brazilian Rial","BRL"},
							{"Hungarian Forint","HUF"},
							{"Yes"},{"No"}};
							
		
			String user20 = " ";
			while( user20 != "EUR" & user20 != "RUB" & user20 != "CHF" &
					user20 != "NOK" & user20 != "GRB" & user20 != "CNY" & user20 != "JPY" &
					user20 != "TRY" & user20 != "SKW" & user20 != "CND" & user20 != "INR" &
					user20 != "IRS" & user20 != "QAR" & user20 != "NGN" & user20 != "HNL" &
					user20 != "ARS" & user20 != "BRL" & user20 != "HUF" & user20 != "USD") {
			
			System.out.print("\nYou have chosen Netherlands Antillean Guilder.");
			System.out.print("\nTo what currency would you like to convert into?\n");
			
			
		System.out.println("\n1) USD (United States Dollar)");
		System.out.println("2) EUR (Euro)");
		System.out.println("3) RUB (Russian Ruble)");
		System.out.println("4) CHF (Swiss Franc)");
		System.out.println("5) NOK (Norwegian Krona)");
		System.out.println("6) GRB (Pound Sterling)");
		System.out.println("7) CNY (Chinise Yuan)");
		System.out.println("8) JPY (Japanese Yen)");
		System.out.println("9) TRY (Turkish Lira)");
		System.out.println("10) SKW (South Korea Won)");
		System.out.println("11) CND (Canadian Dollar)");
		System.out.println("12) INR (Indian Rupee)");
		System.out.println("13) ILS (Israeli New Shekel)");
		System.out.println("14) QAR (Qatari Rial)");
		System.out.println("15) NGN (Nigerian Naira)");
		System.out.println("16) HNL (Honduras Lempira)");
		System.out.println("17) ARS (Argentine Peso)");
		System.out.println("18) BRL (Brazilian Rial)");
		System.out.println("19) HUF (Hungarian Forint)");
		System.out.print("\nType a currency: ");
			user20 = input.next();
			user20 = user20.toUpperCase();
			
		if (user20.equals("USD")){
		
			
			System.out.print("\nYou have chosen United States Dollar.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double dollars = 0.56 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f$ United States Dollars.\n", guilders, dollars);
			
		}
		else if (user20.equals("EUR")){
			
			System.out.print("\nYou have chosen Euros.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double euros = 0.52 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f€ Euros.\n", guilders, euros);
		}
		else if (user20.equals("RUB")){
			
			System.out.print("\nYou have chosen Russian Ruble.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double rubles = 35.83 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₽ Russian Rubles.\n", guilders, rubles);
		}
		else if (user20.equals("CHF")){
			
			System.out.print("\nYou have chosen Swiss Franc.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double francs = 0.55 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₣ Swiss Francs.\n", guilders, francs);
		}
		else if (user20.equals("NOK")){
			
			System.out.print("\nYou have chosen Norwegian Krona.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double kronas = 5.21 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2fKr Norwegian Kronas.\n", guilders, kronas);
		}
		else if (user20.equals("GRB")){
			
			System.out.print("\nYou have chosen Pound Sterling.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double pounds = 0.43 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f£ Pounds Sterling.\n", guilders, pounds);
		}
		else if (user20.equals("CNY")){
			
			System.out.print("\nYou have chosen Chinise Yuan.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double yuans = 3.93 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f¥ Chinise Yuans.\n", guilders, yuans);;
		}
		else if (user20.equals("JPY")){
			
			System.out.print("\nYou have chosen Japanese Yen.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double yens = 62.60 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f¥ Japanese Yens.\n", guilders, yens);
		}
		else if (user20.equals("TRY")){
			
			System.out.print("\nYou have chosen Turkish Lira.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double liras = 3.41 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₤ Turkish Liras.\n", guilders, liras);
		}
		else if (user20.equals("SKW")){
			
			System.out.print("\nYou have chosen South Korea Won.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double wons = 675.44 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₩ South Korea Wons.\n", guilders, wons);
		}
		else if (user20.equals("CND")){
			
			System.out.print("\nYou have chosen Canadian Dollar.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double cdollars = 0.74 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2fC$ Canadian Dollars.\n", guilders, cdollars);
		}
		else if (user20.equals("INR")){
			
			System.out.print("\nYou have chosen Indian Rupee.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double rupees = 40.21 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₹ Indian Rupees.\n", guilders, rupees);
		}
		else if (user20.equals("ILS")){
			
			System.out.print("\nYou have chosen Israeli New Shekel.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double shekels = 1.91 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₪ Israeli New Shekels.\n", guilders, shekels);
		}
		else if (user20.equals("QAR")){
			
			System.out.print("\nYou have chosen Qatari Rial.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double rials = 2.03 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f﷼ Qatari Rials.\n", guilders, rials);
		}
		else if (user20.equals("NGN")){
			
			System.out.print("\nYou have chosen Nigerian Naira.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double nairas = 203.16 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₦ Nigerian Nairas.\n", guilders, nairas);
		}
		else if (user20.equals("HNL")){
			
			System.out.print("\nYou have chosen Honduras Lempira.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double lempiras = 14.00 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2fL Honduras Lempiras.\n", guilders, lempiras);
		}
		else if (user20.equals("ARS")){
			
			System.out.print("\nYou have chosen Argentine Peso.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double pesos = 34.53 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2f₱ Argentine Pesos.\n", guilders, pesos);
		}
		else if (user20.equals("BRL")){
			
			System.out.print("\nYou have chosen Brazilian Rial.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double brials = 2.45 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2fR$ Brazilian Rials.\n", guilders, brials);
		}
		else if (user20.equals("HUF")){
			
			System.out.print("\nYou have chosen Hungarian Forint.");
			System.out.print("\nPlease enter the currency amount of Netherlands Antillean Guilders: ");
			double guilders = input.nextDouble();
			
		
			double forints = 175.04 * guilders + 1; 
			System.out.printf("\n%.2fƒ Netherlands Antillean Guilders = %.2fFt Hungarian Forints.\n", guilders, forints);
		}
		else {
			System.out.println("\nError!, Please try again..");
			continue;
		}

		
		String answer20 = " ";
		while(answer20 != "Yes" & answer20 != "No") {
		
		System.out.println("\nWould you like to continue?\n");
		System.out.println("1)Yes");
		System.out.println("2)No");
		System.out.print("\nType your answer: ");
		
		answer20 = input.next();
		answer20 = answer20.toUpperCase();
		
		if (answer20.equals("NO")){
			System.out.print("\nCurrency Converter has stopped.");
			System.exit(0);
		}
		
		
		if(answer20.equals("YES")){
				String currency20 = " ";
			
			System.out.print("\nSelect a new currency: \n");
			System.out.println("\n1) USD (United States Dollar)");
			System.out.println("2) EUR (Euro)");
			System.out.println("3) RUB (Russian Ruble)");
			System.out.println("4) CHF (Swiss Franc)");
			System.out.println("5) NOK (Norwegian Krona)");
			System.out.println("6) GRB (Pound Sterling)");
			System.out.println("7) CNY (Chinise Yuan)");
			System.out.println("8) JPY (Japanese Yen)");
			System.out.println("9) TRY (Turkish Lira)");
			System.out.println("10) SKW (South Korea Won)");
			System.out.println("11) CND (Canadian Dollar)");
			System.out.println("12) INR (Indian Rupee)");
			System.out.println("13) IRS (Israeli New Shekel)");
			System.out.println("14) QAR (Qatari Rial)");
			System.out.println("15) NGN (Nigerian Naira)");
			System.out.println("16) HNL (Honduras Lempira)");
			System.out.println("17) ARS (Argentine Peso)");
			System.out.println("18) BRL (Brazilian Rial)");
			System.out.println("19) HUF (Hungarian Forint)");
				System.out.print("\nType a currency: ");
				currency20 = input.next();
				currency20 = currency20.toUpperCase();
				
				
				if (currency20.equals("USD")) {
					usd();
				}
				else if (currency20.equals("EUR")){
					eu();
				}
				else if (currency20.equals("RUB")){
					rr();
				}
				else if (currency20.equals("CHF")){
					sf();
				}
				else if (currency20.equals("NOK")){
					nk();
				}
				else if (currency20.equals("GRB")){
					ps();
				}
				else if (currency20.equals("CNY")){
					cy();
				}
				else if (currency20.equals("JPY")){
					jy();
				}
				else if (currency20.equals("TRY")){
					tl();
				}
				else if (currency20.equals("SKW")){
					skw();
				}
				else if (currency20.equals("CND")){
					cd();
				}
				else if (currency20.equals("INR")){
					ir();
				}
				else if (currency20.equals("ILS")){
					ins();
				}
				else if (currency20.equals("QAR")){
					qr();
				}
				else if (currency20.equals("NGN")){
					nn();
				}
				else if (currency20.equals("HNL")){
					hdl();
				}
				else if (currency20.equals("ARS")){
					ap();
				}
				else if (currency20.equals("BRL")){
					br();
				}
				else if (currency20.equals("HUF")){
					hf();
				}
				else if (currency20.equals("ANG")){
					nag();
				}
				else {
					System.out.println("\nError!, Please try again..");
				}
			}
		continue;
		}			
	}
	}
}
