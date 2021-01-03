package questao03;

import java.time.LocalDate;
import java.util.List;

public class FluxoCaixa {
	protected String nomeEmpresa;
	protected String cnpj;
	Transacao transacao;

	public FluxoCaixa(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}
	public void adicionarTransacao(Transacao transacao) {
		transacao.getData();
		transacao.getTipo();
		transacao.getDescricao();
		transacao.calcularTotal();
		
	}
	public double calcularDespesas(LocalDate inicio,LocalDate fim) {
		return transacao.calcularTotal();
		
	}
	public double calcularReceitas(LocalDate inicio,LocalDate fim) {
		return 0.00;
	}
	public double percentualReceitasNoMes(int mes,int ano) {
		return 0.00;
	}
	public double percentualDespesasNoMes(int mes,int ano) {
		return 0.00;
	}
	public double saldoAtual() {
		return 0.00;
	}
	public List<Transacao> listarTransacoesNoMes(int mes,int ano){
		return null;
		
	}

}
