package questao01;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class BilheteDeLoteria {
	private int tamanho;
	private int[] numeros = new int[tamanho];
	Random oo = new Random();

	public BilheteDeLoteria(int tamanho) {
		this.tamanho = tamanho;
		

	}
	public int[] executaBilheteDeLoteria(int tamanho) {
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
		return numeros;
	}
	public boolean contem(int[] numeros, int numAleatorio) {
		for (int i = 0; i < numeros.length; i++) {
			if (numAleatorio == numeros[i]) {
				return true;
			}
		}
		return false;
	}

	public int qtdNumerosContidos(BilheteDeLoteria bl2) {
		int cont = 0;
		for (int i = 0; i <numeros.length; i++) {
			for (int k = 0; k <numeros.length; k++) {
				if (bl2.numeros[i] == numeros[k]) {
					cont++;
				}
			}
		}

		return cont;
	}
	@Override
	public String toString() {
		return Arrays.toString(numeros);
	}

	
	

	

}
