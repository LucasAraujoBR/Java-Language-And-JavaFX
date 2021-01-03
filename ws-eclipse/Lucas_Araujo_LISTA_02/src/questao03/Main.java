package questao03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String nomeEmpresa = "DinamicEnterprise";
		String cnpj = "9989-8";
		DespesaComAgua d1 = new DespesaComAgua(27);
		DespesaComEnergia d2 = new DespesaComEnergia(150);
		DespesaComInternet d3 = new DespesaComInternet(600);
		LicencaBasica lb1 = new LicencaBasica(50);
		LicencaPlus lb2 = new LicencaPlus(65);
		LicencaEnterprise lb3 = new LicencaEnterprise(15);
		
		FluxoCaixa fc = new FluxoCaixa(nomeEmpresa, cnpj);
		fc.adicionarTransacao(d1);
		fc.adicionarTransacao(d2);
		fc.adicionarTransacao(d3);
		fc.adicionarTransacao(lb1);
		fc.adicionarTransacao(lb2);
		fc.adicionarTransacao(lb3);
		
		LocalDate dataInicial = LocalDate.of(2020, 10, 21);
		LocalDate dataFinal = LocalDate.of(2020, 12, 11);
		
		
		
		
		

	}

}
