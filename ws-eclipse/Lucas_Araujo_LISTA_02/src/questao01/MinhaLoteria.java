package questao01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MinhaLoteria {
	private List<Integer> bilhetePremiado;
	Random oo = new Random();
	private int cont;
	private int quadra;
	private int quina;

	public MinhaLoteria(List<Integer> bilhetePremiado) {
		this.quadra = 0;
		this.quina = 0;
		int megaSena = 0;
		this.cont = 0;

		this.bilhetePremiado = bilhetePremiado;
		ArrayList<Integer> bilhetes = new ArrayList<Integer>();
		int numIguais = 0;
		while (megaSena == 0) {

			this.cont++;
			if (bilhetes.size() == 6) {
				numIguais = 0;
				bilhetes.removeAll(bilhetes);
			}
			while (bilhetes.size() < 6) {
				int numeroAleatorio = oo.nextInt(60) + 1;
				if (!bilhetes.contains(numeroAleatorio)) {
					bilhetes.add(numeroAleatorio);
				}

				Collections.sort(bilhetes);

				if (bilhetes.equals(bilhetePremiado)) {
					megaSena = 1;
				}

			}
			for (int aut = 0; aut < 6; aut++) {
				for (int out = 0; out < 6; out++) {
					if (bilhetes.get(aut).equals(bilhetePremiado.get(out))) {
						numIguais++;
					}

				}
			}
			if (numIguais == 4) {
				this.quadra++;
			}
			if(numIguais == 5) {
				this.quina++;
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
