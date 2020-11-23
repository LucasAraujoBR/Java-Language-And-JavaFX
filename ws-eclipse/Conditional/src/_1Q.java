import java.util.Scanner;

public class _1Q {
	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		sc.close();
		if(valor > 0) {
			System.out.println("Valor não negativo!");
		}else {
			System.out.println("Valor Negativo!");
		}
	}

}
