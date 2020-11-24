import java.util.Locale;
import java.util.Scanner;

public class _7Q {
	/*
	 * Fazer um programa para ler um número inteiro positivo N. O programa deve
	 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
	 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
	 * exemplo
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor N: ");
		int N = sc.nextInt();

		for (int cont = 1; cont <= N; cont++) {
			System.out.println(cont + " " + (int) Math.pow(cont, 2) + " " + (int) Math.pow(cont, 3));
		}
		sc.close();
	}

}
