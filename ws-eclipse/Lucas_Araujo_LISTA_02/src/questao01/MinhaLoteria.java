package questao01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MinhaLoteria {
	private List<Integer> bilhetePremiado;
	Random oo = new Random();
	private int cont;

	public MinhaLoteria(List<Integer> bilhetePremiado) {
		int quadra = 0;
		int quina = 0;
		int megaSena = 0;
		this.cont = 0;
		
		this.bilhetePremiado = bilhetePremiado;
		ArrayList<Integer> bilhetes = new ArrayList<Integer>();
		while (megaSena == 0) {
			this.cont++;
			if (bilhetes.size() == 6) {
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

		}
		
	}
	public int retornaResultados() {
		return this.cont;
	}
}
