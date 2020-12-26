package QuintoQuesito;

import java.time.LocalDate;

public class Venda {
	public LocalDate data;
	public String atendente;
	
	public Venda() {
		
		this.data = data;
		this.atendente = atendente;
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getAtendente() {
		return atendente;
	}
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	public void adicionarItem(ItemVenda item,ItemVenda item2,ItemVenda item3,ItemVenda item4) {
		item.quantidade = item.quantidade;
		item2.quantidade = item2.quantidade;
		item3.quantidade = item3.quantidade;
		item4.quantidade = item4.quantidade;
		int totalDeVendas = item.quantidade + item2.quantidade + item3.quantidade + item4.quantidade;
		
	}
	
	public void calcularTotal(int quantidade) {
		
		
	}
	public void listarItensVenda(Cliente c,Produto p,Produto p2,Produto p3,Produto p4,ItemVenda item,ItemVenda item2,ItemVenda item3,ItemVenda item4) {
		System.out.println("Data da venda: " + data);
		System.out.println("Cliente: " + c.nome + " | CPF: " + c.cpf + " | Idade: " + c.calcularIdade(c.dataNascimento, c.dtHoje) );
		System.out.println("Atendente: " + atendente);
		System.out.println();
		System.out.println("Nome do produto | Preço     | Quantidade  | Total  ");
		System.out.println("-----------------------------------------------------");
		System.out.println(p.nome + "      | R$ " + p.preco + "   | " + item.quantidade + "          | R$ " + item.calcularTotal(p.preco,item.quantidade));
		System.out.println(p2.nome + "      | R$ " + p2.preco + "    | " + item2.quantidade + "           | R$ " + item.calcularTotal(p2.preco,item2.quantidade));
		System.out.println(p3.nome + "      | R$ " + p3.preco + "   | " + item3.quantidade + "          | R$ " + item.calcularTotal(p3.preco,item3.quantidade));
		System.out.println(p4.nome + "      | R$ " + p4.preco + "   | " + item4.quantidade + "           | R$ " + item.calcularTotal(p4.preco,item4.quantidade));
		System.out.println("-----------------------------------------------------");
		System.out.println("Total da venda:                           |  R$ " + item.totalFinal(p, p2, p3, p4, item, item2, item3, item4)
);
	}

}
