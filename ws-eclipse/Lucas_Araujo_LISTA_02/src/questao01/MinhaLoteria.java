package questao01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MinhaLoteria {
	private List<Integer> bilhetePremiado;
	Random oo = new Random();
	private int cont=0;
	private int quadra=0;
	private int quina=0;
	private int tamanho=0;
	private int megaSena=0;
	private	int tamanho2 = 0;

	public MinhaLoteria(List<Integer> bilhetePremiado) {
		
		this.bilhetePremiado = bilhetePremiado;
		

	}

	public void executaLoteria(List<Integer> bilhetePremiado,int tamanho) {
		this.quadra = 0;
		this.quina = 0;
		this.megaSena = 0;
		this.cont = 0;
		this.tamanho = tamanho;
		this.bilhetePremiado = bilhetePremiado;
		
		ArrayList<Integer> bilhetes = new ArrayList<Integer>(tamanho);
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
			for (int aut = 0; aut < bilhetes.size(); aut++) {
				for (int out = 0; out < bilhetes.size(); out++) {
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
			if(numIguais == 6) {
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
