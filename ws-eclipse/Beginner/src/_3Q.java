import java.util.Scanner;

public class _3Q {
	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D).
	 */
	public static void main(String[] args) {
		int A,B,C,D;
		System.out.println("Digite quatro valores inteiros: ");
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		System.out.println("A diferenca do produto de "+A +" e "+B+" pelo produto de " + C + " e " + D + " eh = " + (A * B - C * D));
		

	}

}
