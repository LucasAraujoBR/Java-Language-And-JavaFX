import java.util.Locale;
import java.util.Scanner;

public class _1Q {
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor entre 1 e 1000: ");
		int x = sc.nextInt();
	for(int cont = 0;cont<=x;cont++) {
		if(cont%2 != 0) {
			System.out.println(cont);
		}
		
		
	}
	
	
	
	
	sc.close();
	
	}

}
