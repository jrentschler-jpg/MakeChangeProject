package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// customer enters price of item at checkout.
		System.out.print("Please enter your purchase price item: $ ");
		double userInputPrice = kb.nextDouble();
		// the screen will display the customer's total amount for this item.
		System.out.println("Your Total Amount for this item is: $ " + userInputPrice);
		// this will prompt the user to enter in the amount of money to pay.
		System.out.print("You have given: $ ");
		double amountTendered = kb.nextDouble();

		boolean notCorrectAmount = false;
		boolean exactAmount = false;

		double calculateChangeAmountReturned = amountTendered - userInputPrice;


		
		int dollars = (int) calculateChangeAmountReturned;
		
		
//		This will initialize the bill and coin denominations
		int twenties = dollars / 20;
		int dollars1 = dollars % 20;
		int tens = dollars1 / 10;
		int dollars2 = dollars % 10;
		int fives = dollars2 / 5;
		int dollars3 = dollars % 5;
		int ones = dollars3;
		
//		These if(eslseif) else statements will print out the calcalated change amount  
		if (amountTendered < userInputPrice) {
			System.out.println("You have not provided the correct amount.");
			notCorrectAmount = true;
		} else if (amountTendered == userInputPrice) {

			System.out.println("Thank you for the exact amount!");
			exactAmount = true;
		} else {

			if (twenties > 1) {
				System.out.println(" $: " + twenties + " Twenty Dollar Bills");

			} else {
				System.out.println(" $: " + twenties + " Twenty Dollar Bill");
			}
			if (tens > 1) {
				System.out.println(" $: " + tens + " Ten Dollar Bills");
			} else {
				System.out.println(" $: " + tens + " Ten Dollar Bill");
			}
			if (fives > 1) {
				System.out.println(" $: " + fives + " Five Dollar Bills");
			} else {
				System.out.println(" $: " + fives + " Five Dollar Bill");
			}
			if (ones > 1) {
				System.out.println(" $: " + ones + " One Dollar Bills");
			} else {
				System.out.println(" $: " + ones + " One Dollar Bill");

			}
		}
//		This will initialize the bill and coin denominations
//		quarters, dimes, nickels, pennies
		double coins = calculateChangeAmountReturned - ((int) calculateChangeAmountReturned);
		int coinsWhole = (int) ((coins * 100) + .001);

		int quarters = coinsWhole / 25;
		int dimes = coinsWhole / 10;
		int nickels = coinsWhole / 5;
		int pennies = coinsWhole / 1;
//		if else statement to display error message if they  have the exact amount or the incorrect amount
		if (!notCorrectAmount) {
		if (!exactAmount) {
//		display the correct dominations 
			if (quarters > 1) {
				System.out.println(" $: " + quarters + " Quarters");
			} else {
				System.out.println(" $: " + quarters + " Quarter");
			}

			if (dimes > 1) {
				System.out.println(" $: " + dimes + " Dimes");
			} else {
				System.out.println(" $: " + dimes + " Dime");
			}

			if (nickels > 1) {
				System.out.println(" $: " + nickels + " Nickels");
			} else {
				System.out.println(" $: " + nickels + " Nickel");
			}

			if (pennies > 1) {
				System.out.println(" $: " + pennies + " Pennies");

			} else {
				System.out.println(" $: " + pennies + " Penny");

			}
		}
		}

	


		System.out.println("You exact change amount is: $ " + dollars + " Dollars " + "and " + coinsWhole + " cents");

		

		kb.close();
	}
}
