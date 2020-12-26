package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Acount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		double deposit=0;
		System.out.println();
		System.out.println("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		if(initial == 'y') {
		System.out.println("Enter initial deposit value: ");
		deposit = sc.nextDouble();
		Acount ac = new Acount(number,holder,deposit);
		}
		Acount ac = new Acount(number,holder,deposit);
		System.out.println("Update data: " + ac.toString());
		
		
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		ac.addCash(deposit);
		System.out.println("Update account data: " + ac.toString());
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		ac.removeCash(deposit);
		System.out.println("Update accout data: " + ac.toString());
		
		sc.close();
		
	}

}
