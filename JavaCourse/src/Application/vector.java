package Application;

import java.util.Locale;
import java.util.Scanner;

/*fa�a um programa para ler um numero inteiro N e os dados(nome e pre�o) de N produtos. Armazene os N
 * produtos em um vetor. Em seguida mostrar o pre�o m�dio dos produtos.*/
public class vector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Digite um valor N: ");
		int N = sc.nextInt();
		float vector[] = new float[N];
		String vector2[] = new String[N];
		String nome = "aux";
		float preco = 0;
		for (int i=0; i<N; i++) {
			System.out.println("Digite o nome do produto ["+(i+1)+"]");
			sc.nextLine();
			nome = sc.nextLine();
			vector2[i] = nome;
			System.out.println("Digite o pre�o do produto ["+(i+1)+"]");
			preco = sc.nextFloat();
			  vector[i] = preco; 
			}
		float auxContadora=0;
		for(int cont = 0;cont<N;cont++) {
			System.out.println("produto:"+ vector2[cont] + " Pre�o:R$:"+ vector[cont]);
			auxContadora += vector[cont];
			
			
			
		}
		System.out.printf("Pre�o m�dio dos produtos: R$:%.2f " , (auxContadora/N));
		
		sc.close();
		
		}catch(Exception e){
		System.out.println("Dados inv�lidos");
		
	}
	}
}
