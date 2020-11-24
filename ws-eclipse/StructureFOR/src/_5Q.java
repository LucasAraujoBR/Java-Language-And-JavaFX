import java.util.Locale;
import java.util.Scanner;

public class _5Q {
	/*
	 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
	 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
	 * de 0 é 1.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor N: ");
		int N = sc.nextInt(),fatorial = 1;
		for(int cont=1;cont<=N;cont++) {
			fatorial = fatorial * cont;
		}
		System.out.println(fatorial);
		sc.close();
	}
	
}
