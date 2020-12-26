package QuintoQuesito;

public class ItemVenda {
	int quantidade;
	

	public ItemVenda() {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double totalFinal(Produto p,Produto p2,Produto p3,Produto p4,ItemVenda item,ItemVenda item2,ItemVenda item3,ItemVenda item4) {
		return (p.preco * item.quantidade + p2.preco * item2.quantidade + p3.preco * item3.quantidade + p4.preco * item4.quantidade);
	}
	public double calcularTotal(double preco,int quantidade) {
		return preco * quantidade;
	}

}
