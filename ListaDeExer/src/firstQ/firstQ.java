package firstQ;
import java.util.Locale;
import java.util.Scanner;

public class firstQ {
	/*
	 * FAZER UM PROGRAMA PARA LER UM NÚMERO INTEIRO N E OS DADOS(NOME E PREÇO DE N
	 * PRODUTOS. ARMAZENE OS N PRODUTOS EM UM VETOR. EM SEGUIDA, MOSTRAR O PREÇO
	 * MÉDIO DOS PRODUTOS.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro N: ");
		int numero = sc.nextInt();
		Produtos[] vetor = new Produtos[numero];
		for(int aux=0;aux<numero;aux++) {
			sc.nextLine();
			System.out.println("Digite o nome do " + (aux+1) + " produto: ");
			String nome = sc.nextLine();
			System.out.println("Digite o preço do " + (aux+1) + " produto: ");
			double preco = sc.nextDouble();
			vetor[aux] = new Produtos(nome,preco);
		}
		
		double somaDosPrecos = 0.0;
		for(int i=0;i<numero;i++) {
			somaDosPrecos += vetor[i].getPreco();
			System.out.println("Produto: " + vetor[i].getNome() + "|Preço: " + vetor[i].getPreco());
		}
		double avg = somaDosPrecos/numero;
		System.out.printf("A média eh: %.2f% " , avg);
		sc.close();
	}

}
