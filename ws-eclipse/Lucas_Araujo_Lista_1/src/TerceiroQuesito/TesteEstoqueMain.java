package TerceiroQuesito;

import java.util.Locale;
import java.util.Scanner;

public class TesteEstoqueMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo: ");
		int codigo = sc.nextInt();
		System.out.println("Digite o nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		Produto produto01 = new Produto(codigo, nome);
		System.out.println("Digite o codigo 2: ");
		int codigo1 = sc.nextInt();
		System.out.println("Digite o nome 2: ");
		sc.nextLine();
		String nome1 = sc.nextLine();
		Produto produto02 = new Produto(codigo1, nome1);
		System.out.println("Digite o produto ");
		String produto = sc.nextLine();
		System.out.println("Digite a quantidade atual: ");
		int qtdAtual = sc.nextInt();
		System.out.println("Digite a quantidade minima: ");
		int qtdMinima = sc.nextInt();

		Estoque estoque01 = new Estoque(produto, qtdAtual, qtdMinima);

		System.out.println("Digite o produto ");
		sc.nextLine();
		String produto1 = sc.nextLine();
		System.out.println("Digite a quantidade atual: ");
		int qtdAtual1 = sc.nextInt();
		System.out.println("Digite a quantidade minima: ");
		int qtdMinima1 = sc.nextInt();
		Estoque estoque02 = new Estoque(produto1, qtdAtual1, qtdMinima1);
	
		System.out.println("Digite o valor de baixas do estoque1: ");
		int baixa = sc.nextInt();
		estoque01.darBaixa(baixa);
		System.out.println("Digite o valor para reposição do estoque2: ");
		int reposicao = sc.nextInt();
		estoque02.reporEstoque(reposicao);
		System.out.println();
		estoque01.relatorio();
		System.out.println();
		System.out.println("Digite o novo nome do produto01: ");
		sc.nextLine();
		String novoNome = sc.nextLine();
		produto01.mudarNome(novoNome);
		System.out.println();
		estoque02.relatorio();
	
	
	}

}
