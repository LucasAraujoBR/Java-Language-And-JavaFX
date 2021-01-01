package questao01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MinhaLoteria {
	private int[] bilhetePremiado;
	Random oo = new Random();
	private int cont = 0;
	private int quadra = 0;
	private int quina = 0;
	private int tamanho = 0;
	private int megaSena = 0;

	public MinhaLoteria(int[] numeros) {

		this.bilhetePremiado = numeros;

	}

	public void executaLoteria(int[] numeros, int tamanho) {
		this.quadra = 0;
		this.quina = 0;
		this.megaSena = 0;
		this.cont = 0;
		this.tamanho = tamanho;
		this.bilhetePremiado = numeros;

		ArrayList<Integer> bilhetes = new ArrayList<Integer>();
		int numIguais = 0;
		while (megaSena == 0) {

			this.cont++;
			if (bilhetes.size() == tamanho) {
				numIguais = 0;
				bilhetes.removeAll(bilhetes);
			}
			while (bilhetes.size() < tamanho) {
				int numeroAleatorio = oo.nextInt(60) + 1;
				if (!bilhetes.contains(numeroAleatorio)) {
					bilhetes.add(numeroAleatorio);
				}
				
				Collections.sort(bilhetes);
				
				if (bilhetes.equals(bilhetePremiado)) {
					megaSena = 1;
				}

			}
			if(tamanho == 6) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 7) {
			for (int aut = 0; aut < tamanho; aut++) {
				for (int out = 0; out < tamanho-1; out++) {
					if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
						numIguais++;
					}

				}
			}
			}
			else if(tamanho == 8) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-2; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 9) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-3; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 10) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-4; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 11) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-5; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 12) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-6; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 13) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-7; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 14) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-8; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			else if(tamanho == 15) {
				for (int aut = 0; aut < tamanho; aut++) {
					for (int out = 0; out < tamanho-9; out++) {
						if (bilhetes.get(aut).equals(bilhetePremiado[out])) {
							numIguais++;
						}

					}
				}
				}
			if (numIguais == 4) {
				this.quadra++;
			}
			if (numIguais == 5) {
				this.quina++;
			}
			if (numIguais == 6) {
				megaSena = 1;
			}

		}

	}

	public int retornaResultados() {

		return this.cont;
	}

	public int retornaQuadra() {
		return this.quadra;
	}

	public int retornaQuina() {
		return this.quina;
	}
}
