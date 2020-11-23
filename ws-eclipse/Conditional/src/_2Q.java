import java.util.Scanner;

public class _2Q {
	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		if (valor % 2 == 0) {
			System.out.println("É par!");
		} else {
			System.out.println("É ímpar!");
		}
		sc.close();
	}

}
