package Application;

import java.util.Scanner;

public class mainExerc {
	/*
	 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
	 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
	 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
	 * cada ocorrência de X , mostrar os valores à esquerda, acima, à direita e
	 * abaixo de X, quando houver.
	 */
	public static void main(String[] args) {
		try {
			// Diálogo com o usuário
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the number of rows of your matrix: ");
			int M = sc.nextInt();
			System.out.println();
			System.out.print("please enter the number of columns of your matrix: ");
			int N = sc.nextInt();

			// leitura da matriz
			int[][] matriz = new int[M][N];

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print("Enter the value for the line " + (i + 1) + " column " + (j + 1)
							+ " position of the matrix: ");
					matriz[i][j] = sc.nextInt();
					System.out.println();
				}
			}

			// impressão da matriz
			System.out.println("-----Matrix-----");
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print("|" + matriz[i][j] + "| ");
				}
				System.out.println();
			}

			// leitura do X e impressão dos valores
			System.out.print("Enter the value of X: ");
			int X = sc.nextInt();
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == X) {
						if (j > 0) {
							System.out.println("Left value: " + matriz[i][(j - 1)]);
						}
						if (i < matriz.length-1) {
							System.out.println("Down value: " + matriz[(i + 1)][j]);
						}
						if (i > 0) {
							System.out.println("Up value: " + matriz[(i - 1)][j]);
						}
						if (j < matriz[i].length-1) {
							System.out.println("Right value: " + matriz[i][(j + 1)]);
						}
						break;
					}
				}
				sc.close();
			}

		} catch (Exception e) {
			System.out.println("You entered invalid values.");
		}

	}

}
