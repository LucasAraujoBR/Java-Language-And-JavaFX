package application;

public class Produto {
	private double valor = 0;
	private int quantidade = 0;
	private String descricao = null;

	public Produto(double valor, int quantidade, String descricao) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}
	public double calcularTotal() {
		return this.valor*this.quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
