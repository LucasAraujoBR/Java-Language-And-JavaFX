package QuintoQuesito;

import java.time.LocalDate;

public class TesteVendaMain {

	public static void main(String[] args) {
		// primeiro objeto
		Produto p = new Produto();
		p.nome = "Produto 01";
		p.preco = 10.00;
		p.descricao = "Primeiro produto";
		p.codigo = 01;
		// segundo objeto
		Produto p2 = new Produto();
		p2.nome = "Produto 02";
		p2.preco = 5.00;
		p2.descricao = "Segundo produto";
		p2.codigo = 02;
		// terceiro objeto
		Produto p3 = new Produto();
		p3.nome = "Produto 03";
		p3.preco = 20.00;
		p3.descricao = "Terceiro produto";
		p3.codigo = 03;
		// quarto objeto
		Produto p4 = new Produto();
		p4.nome = "Produto 04";
		p4.preco = 15.00;
		p4.descricao = "quarto produto";
		p4.codigo = 04;

		// ItemVenda 1
		ItemVenda item = new ItemVenda();
		item.quantidade = 10;
		item.calcularTotal(p.preco,item.quantidade);
		// ItemVenda 2
		ItemVenda item2 = new ItemVenda();
		item2.quantidade = 5;
		item2.calcularTotal(p2.preco,item2.quantidade);
		// ItemVenda 3
		ItemVenda item3 = new ItemVenda();
		item3.quantidade = 10;
		item3.calcularTotal(p3.preco,item3.quantidade);
		// ItemVenda 4
		ItemVenda item4 = new ItemVenda();
		item4.quantidade = 2;
		item4.calcularTotal(p3.preco,item4.quantidade);
		
		
		//instanc cliente
		Cliente c = new Cliente();
		c.nome = "José Maria Marques";
		c.cpf = "123456";
		c.dataNascimento = LocalDate.of(1994, 1, 1);
		
		//inst Venda
		Venda v = new Venda();
		v.atendente = "Maria Dolores Sampaio";
		v.data = LocalDate.of(2020, 12, 23);
		v.adicionarItem(item, item2, item3, item4);
		
		//chamando metodo listarItensVenda()
		
		v.listarItensVenda(c, p, p2, p3, p4,item, item2, item3, item4);
		
		
		

	}

}
