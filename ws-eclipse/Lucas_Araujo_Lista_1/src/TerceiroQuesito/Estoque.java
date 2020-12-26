package TerceiroQuesito;

public class Estoque {
	private String produto;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque() {

	}

	public Estoque(String produto, int qtdAtual, int qtdMinima) {
		this.produto = produto;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudaQtdMinima(int newQtdMinima) {
		newQtdMinima = qtdMinima;
	}

	public void reporEstoque(int reposicao) {
		this.qtdAtual = qtdAtual + reposicao;
	}

	public void darBaixa(int baixa) {
		if(baixa - qtdAtual > qtdMinima) {
		this.qtdAtual = qtdAtual - baixa;
		}else {
			System.out.println("Não temos tantos itens no estoque!");
		}
	}

	public void relatorio() {
		System.out.println("Produto: " + produto);
		System.out.println("Quantidade atual: " + qtdAtual);
		System.out.println("Quantidade Minima: " + qtdMinima);

	}

}
