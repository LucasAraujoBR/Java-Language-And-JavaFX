package Application;

import java.util.Scanner;

public class matriz {
	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N
	 * contendo números inteiros. Em seguida , mostrar a diagonal principal e a
	 * quantidade de valores negativos da matriz.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um inteiro N: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];

		// preenche a matriz com os valores digitados
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				System.out.printf("Digite o valor para a linha " + (i + 1) + ", coluna " + (k + 1) + ":");
				matriz[i][k] = sc.nextInt();
			}
		}
		System.out.println("----------MATRIZ----------");

		// imprime a matriz
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				System.out.print("\t" + matriz[i][k] + " ");
			}
			System.out.println();
		}
		int aux = 0;
		// imprime a Diagonal principal e o total de valores negativos
		System.out.println("-----Diagonal Principal-----");
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				if (matriz[i][k] < 0) {
					aux++;
				}
				if (i == k) {
					System.out.printf("|" + matriz[i][k] + "| ");
				}
			}
		}

		System.out.println("Total de valores negativos da matriz: " + aux);

		sc.close();

	}

}
