import java.util.Locale;
import java.util.Scanner;

public class _4Q {
	/*
	 * Fazer um programa para ler um número N. Depois leia N pares de números e
	 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
	 * mostrar a mensagem "divisao impossivel".
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double N = sc.nextDouble(),valor1 = 0,valor2 = 0;
	for(int cont=0;cont<N;cont++) {
		System.out.println("Digite dois valores para dividilos: ");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		if(valor2 != 0) {
		System.out.printf("%.1f%n",(valor1/valor2));
		}else {
			System.out.println("Valor impossível");
		}
		}
	
	
	sc.close();
	}

}
