import java.util.Locale;
import java.util.Scanner;

public class _2Q {
	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio;
		System.out.println("Digite o valor do Raio: ");
		raio = sc.nextDouble();
		System.out.printf("A area do ciculo eh: %.4f ", (3.14159* Math.pow(raio,2)));
	}

}
