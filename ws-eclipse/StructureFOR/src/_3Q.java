import java.util.Locale;
import java.util.Scanner;

public class _3Q {
	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
	 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
	 * o terceiro valor tem peso 5.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double teste1 = 0.0,teste2 = 0.0,teste3 = 0.0,media;
		
		for(int cont = 0;cont<N;cont++) {
			System.out.println("Digite 3 valores: ");
			teste1 = sc.nextDouble();
			teste2 = sc.nextDouble();
			teste3 = sc.nextDouble();
			media = ((teste1*2)+(teste2*3)+(teste3*5))/10;
			System.out.printf("A media é: %.1f%n" , media);
		}
		sc.close();
	}

}
