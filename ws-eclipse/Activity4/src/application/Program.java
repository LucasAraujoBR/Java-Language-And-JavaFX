package application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class Program {
	/*
	 * this program generates the amount in reais to be paid for the dollar amount
	 * entered by the user and the dollar index also entered by the user, all with
	 * an IOF rate of 6%
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		currencyConverter conv = new currencyConverter();
		System.out.println("What is the dollar price ? ");
		conv.indiceDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought ? ");
		conv.dolares = sc.nextDouble();
		System.out.println();
		System.out.println("Amout to be paid in reais = " + conv.converterDolReal());

	}

}
