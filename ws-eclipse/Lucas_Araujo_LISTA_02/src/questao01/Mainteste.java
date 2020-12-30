package questao01;

import java.util.Arrays;

public class Mainteste {

	public static void main(String[] args) {
		int tamanho = 6;
		BilheteDeLoteria bl = new BilheteDeLoteria(tamanho);
		BilheteDeLoteria bl2 = new BilheteDeLoteria(tamanho);
		MinhaLoteria ml = new MinhaLoteria(bl.numeros);
		System.out.println("Primeiro "+bl.toString());
		System.out.println("Segundo "+bl2.toString());
		
		System.out.println("Quantidades de valores comuns entre os dois bilhetes: " + bl2.qtdNumerosContidos(bl));

		System.out.println("PARABÉNS VOCÊ GANHOU NA MEGASENA DEPOIS DE "+ ml.retornaResultados() +" TENTATIVAS DE JOGO");
		
		
		
		
		
		
		
		

	}

}
