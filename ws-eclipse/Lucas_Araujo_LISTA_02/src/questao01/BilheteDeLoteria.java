package questao01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class BilheteDeLoteria {
	private int tamanho;
	List<Integer> numeros = new ArrayList<>(tamanho);
	Random oo = new Random();

	public BilheteDeLoteria(int tamanho) {
		this.tamanho = tamanho;

		while (numeros.size() < 6) {
			int numeroAleatorio = oo.nextInt(60) + 1;
			if (!numeros.contains(numeroAleatorio)) {
				numeros.add(numeroAleatorio);
			}
		}
		Collections.sort(numeros);

	}

	public int qtdNumerosContidos(BilheteDeLoteria bl2) {
		int cont = 0;
		for (int i = 0; i <= 5; i++) {
			for (int k = 0; k <= 5; k++) {
				if (bl2.numeros.get(i).equals(this.numeros.get(k))) {
					cont++;
				}
			}
		}
		
		return cont;
	}

	@Override
	public String toString() {
		return "Mega Sena = [" + numeros.get(0) + "," + numeros.get(1) + "," + numeros.get(2) + "," + numeros.get(3)
				+ "," + numeros.get(4) + "," + numeros.get(5) + "]";

	}

}
