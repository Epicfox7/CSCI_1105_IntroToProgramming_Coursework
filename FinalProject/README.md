# Currency Converter

## Synopsis
This is my project and is used to convert 20 different currencies.

## Motivation
Currency is important because the exchange rate, the price of one currency in terms of another, helps to determine a nation's economic health and hence the well-being of all the people residing in it.

## How to Run
First you need a program or app that can run Java.

![image](https://github.com/JLopez-dev/CSCI_1105_IntroToProgramming_Coursework/blob/master/code%20runner.png)

Then you are going to run the program and type the abbreviation of each currency in order to convert into another currency.

![image](https://github.com/JLopez-dev/CSCI_1105_IntroToProgramming_Coursework/blob/master/Currency%20converter.png)

## Code Example
```
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
```
