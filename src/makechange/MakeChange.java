package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.print("Please enter your purchase price item: $ ");
		double userInputPrice = kb.nextDouble();
		System.out.println("Your Total Amount for this item is: $ " + userInputPrice);
		
		System.out.print("You have given: $ " );
		double amountTendered = kb.nextDouble();
		
		double calculateChangeAmountReturned = amountTendered - userInputPrice;
		
		int dollars = (int) calculateChangeAmountReturned;
		int twenties = dollars / 20;
		int dollars1 = dollars % 20;
		
		int coins = (int) coins4;
		int quarters = coins / 25;
		int coins1 = coins % 25;
		
		//quarters, dimes, nickels, pennies
		
		
		System.out.println("You exact change amount is: $ "+dollars+ " Dollars " + "and " + coins + " coins");
		
		
//		int floor = (int) num;
//		if (num < 0
//				&& (num % floor != 0.0)) {
//			floor = floor - 1;
//		}
//		for (int i=0; i<=howHigh; i++) {
//		      System.out.printf("0x%08x | %10d | 0%-12o | 0b%-32s %n", i, i, i, Integer.toBinaryString(i));
//		
//		if(amountTendered <= customerPurchasePrice) {
//			System.out.println(number of bills and coins to go back to customer);
//		} else {
//			System.out.println("This is incorrect change.");
//		}
//		      
		 //cashRegisterCalculation;
		//calculateChangeAmountReturned;
		//customerPurchasePrice;
		//amountTendered;
		//if the amount tendered is more than the cost of item, display 
		//the number of bills and coins that should be given to the customer.
		
		//largest bill and coin denominations 
		//$20, $10, $5, $1, .25c, .10c, .05c, .01c
				
		
		//too little = result in an error message 'This is incorrect change'
		
		
		

		kb.close();
	}
}
