package Application;

import java.util.Locale;

public class forEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String[] vector = new String[] { "Lucas", "Izabella", "Karol" };
		//Maneira de leitura do vetor com la�o de repeti��o 
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);

		}
		System.out.println();
		System.out.println("--------ForEach--------");
		// for(TipoDoVetor nomeQualquer: nomeDoVetor)
		for(String a: vector) {		//para cada "a" contido no vetor "vector", fa�a:
			System.out.println(a);
			
		}

	}

}
