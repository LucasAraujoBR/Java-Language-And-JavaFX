package questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String nomeEmpresa = "DinamicEnterprise";
		String cnpj = "9989-8";

		FluxoCaixa fc = new FluxoCaixa(nomeEmpresa, cnpj);
		System.out.println("|Empresa: " + fc.getNomeEmpresa() + " |CNPJ: " + fc.getCnpj());

		// Instanciando transações de Despesa
		Transacao t1 = new DespesaComAgua("10/12/2019 15:27", 27);
		System.out.println(t1.toString());
		Transacao t2 = new DespesaComEnergia("03/06/2018 16:15", 300);
		System.out.println(t2.toString());
		Transacao t3 = new DespesaComInternet("03/09/2020 11:17", 600);
		System.out.println(t3.toString());
		Transacao d1 = new DespesaComAgua("11/10/2019 15:27", 42);
		System.out.println(t1.toString());
		Transacao d2 = new DespesaComEnergia("05/07/2018 16:15", 250);
		System.out.println(t2.toString());
		Transacao d3 = new DespesaComInternet("04/07/2020 11:17", 300);
		System.out.println(t3.toString());
		System.out.println();
		// Instanciando transações de Receita
		Transacao t4 = new LicencaBasica("22/05/2017 12:15", 500);
		System.out.println(t4.toString());
		Transacao t5 = new LicencaEnterprise("22/08/2018 12:15", 250);
		System.out.println(t5.toString());
		Transacao t6 = new LicencaPlus("23/01/2015 12:15", 50);
		System.out.println(t6.toString());
		Transacao r4 = new LicencaBasica("25/12/2017 12:15", 500);
		System.out.println(t4.toString());
		Transacao r5 = new LicencaEnterprise("11/08/2018 12:15", 250);
		System.out.println(t5.toString());
		Transacao r6 = new LicencaPlus("12/03/2015 12:15", 50);
		System.out.println(t6.toString());
		System.out.println();

		// cadastro de transações de despesas
		fc.adicionarTransacao(t1);
		fc.adicionarTransacao(t2);
		fc.adicionarTransacao(t3);
		fc.adicionarTransacao(d1);
		fc.adicionarTransacao(d2);
		fc.adicionarTransacao(d3);
		
		// cadastro de transações de Receitas
		fc.adicionarTransacao(t4);
		fc.adicionarTransacao(t5);
		fc.adicionarTransacao(t6);
		fc.adicionarTransacao(r4);
		fc.adicionarTransacao(r5);
		fc.adicionarTransacao(r6);

		// execução de metodos da classe FluxoCaixa

		System.out.println();
		System.out.println("|Empresa: " + fc.getNomeEmpresa() + " |CNPJ: " + fc.getCnpj());
		System.out.println();
		// metodo calcular Despesas
		System.out.println("calcular Despesas: "+fc.calcularDespesas(LocalDate.parse("2018-01-01"), LocalDate.now()));
		System.out.println();
		// metodo calcular receitas
		System.out.println("calcular receitas: "+fc.calcularReceitas(LocalDate.parse("2017-01-01"), LocalDate.now()));
		System.out.println();
		// metodo calcular despesas em relação anual
		System.out.println("calcular despesas em relação anual: "+fc.percentualDespesasNoMes(9, 2020));
		System.out.println();
		// metodo calcular receitas em relação anual
		System.out.println("calcular receitas em relação anual: "+fc.percentualReceitasNoMes(1, 2015));
		System.out.println();
		// metodo saldo atual
		System.out.printf("saldo atual: %.2f ",fc.saldoAtual());
		System.out.println();
		// metodo de listas de transações feitas no mes
		for (Transacao t : fc.listarTransacoesNoMes(05, 2018)) {
			System.out.println("listas de transações feitas no mes" + t);

		}

	}

}
