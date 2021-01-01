import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class BilDLoteria {
	private int tamanho;
	private int[] numeros = new int[tamanho];
	Random oo = new Random();

	public BilDLoteria(int tamanho) {
		this.tamanho = tamanho;

	}

	public void executaLoteria(int tamanho) {
		int[] numeros = new int[tamanho];
		boolean resultado = false;
		for (int aux = 0; aux < tamanho; aux++) {
			do {
				resultado = false;
				int numAleatorio = oo.nextInt(60) + 1;
				resultado = contem(numeros, numAleatorio);
				numeros[aux] = numAleatorio;
				
			} while (resultado == true);

		}
		Arrays.sort(numeros);
		this.numeros = numeros; 
	}

	public boolean contem(int[] numeros, int numAleatorio) {
		for (int i = 0; i < numeros.length; i++) {
			if (numAleatorio == numeros[i]) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "BilDLoteria tamanho " + tamanho + ", numeros = " + Arrays.toString(numeros);
	}

}
