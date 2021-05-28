package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class mainProduct {
//vector.length é o tamanho do vetor
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter an N value: ");
		int n = sc.nextInt();
		Product[] vector = new Product[n];
		for (int i = 0; i < vector.length; i++) {
			sc.nextLine();
			System.out.println("Enter the " + (i+1) + " name: ");
			String name = sc.nextLine();
			System.out.println("Enter the " + (i+1) + " price: ");
			double price = sc.nextDouble();
			vector[i] = new Product(name, price);
		}
		double sum = 0.0;
		for(int i=0;i<vector.length;i++) {
			sum += vector[i].getPrice();
		}
		System.out.printf("Average price is %.2f%n",sum/vector.length);
		sc.close();
		}catch(Exception e){
			System.out.println("invalid data.");
		}

	}

}
