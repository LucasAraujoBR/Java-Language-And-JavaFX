import java.util.Locale;
import java.util.Scanner;

public class _5Q {
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
	 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	 * 1 - cachorro quente R$ 4 2 - X-salada R$ 4.5 3 - X-Bacon R$ 5 4 - Torrada
	 * simples R$ 2 5 - Refrigerante R$ 1.5
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		System.out.println("Menu:");
		System.out.println("CÓDIGO  |      LANCHE       | PREÇO ");
		System.out.println("  1     | cachorro quente   |R$ 4");
		System.out.println("  2     | X-salada          |R$ 4.5");
		System.out.println("  3     | X-Bacon           |R$ 5");
		System.out.println("  4     | Torrada simples   |R$ 2");
		System.out.println("  5     | Refrigerante      |R$ 1.5");
		System.out.println("Digite o Código e a quantidade: ");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			System.out.printf("Valor da conta: %.2f", (double) quantidade * 4);
		} else if (codigo == 2) {
			System.out.printf("Valor da conta: %.2f", (double) quantidade * 4.5);
		} else if (codigo == 3) {
			System.out.printf("Valor da conta: %.2f", (double) quantidade * 5);
		} else if (codigo == 4) {
			System.out.printf("Valor da conta: %.2f", (double) quantidade * 2);
		} else if (codigo == 5) {
			System.out.printf("Valor da conta: %.2f", (double) quantidade * 1.5);
		}
		sc.close();

	}

}
