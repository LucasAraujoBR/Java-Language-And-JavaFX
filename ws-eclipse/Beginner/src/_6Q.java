import java.util.Locale;
import java.util.Scanner;

public class _6Q {
	/*
	 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
	 * precis�o: A, B e C. Em seguida, calcule e mostre: a) a �rea do tri�ngulo
	 * ret�ngulo que tem A por base e C por altura. b) a �rea do c�rculo de raio C.
	 * (pi = 3.14159) c) a �rea do trap�zio que tem A e B por bases e C por altura.
	 * d) a �rea do quadrado que tem lado B. e) a �rea do ret�ngulo que tem lado A
	 * e altura B.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A,B,C;
		System.out.println("Digite 3 valores: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		System.out.printf("TRIANGULO: %.3f " , ((A*C)/2));
		System.out.printf("\nCIRCULO: %.3f" , (3.14159*Math.pow(C, 2)));
		System.out.printf("\nTRAPEZIO: %.3f" , (((A+B)*C)/2));
		System.out.printf("\nQUADRADO: %.3f" , (Math.pow(B, 2)));
		System.out.printf("\nRETANGULO: %.3f" , (A*B));
	
	
	
	}

}
