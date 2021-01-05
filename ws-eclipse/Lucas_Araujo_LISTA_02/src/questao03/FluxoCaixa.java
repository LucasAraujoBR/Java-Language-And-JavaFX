package questao03;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class FluxoCaixa {
	protected String nomeEmpresa;
	protected String cnpj;
	Transacao transacao;
	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

	public FluxoCaixa(String nomeEmpresa, String cnpj) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}

	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void adicionarTransacao(Transacao transacao) {
		boolean addTrasacao = true;
		for (Transacao t : transacoes) {
			if (t.equals(transacao)) {
				addTrasacao = false;
				break;
			}
		}
		if (addTrasacao) {
			transacoes.add(transacao);
		}

	}

	public double calcularDespesas(LocalDate inicio, LocalDate fim) {
		double somaDespesas = 0;
		for (Transacao t : transacoes) {
			if (t.getTipo().equals("DESPESA") && t.getData().isAfter(inicio.atStartOfDay())
					&& t.getData().isBefore(fim.atStartOfDay())) {
				somaDespesas += t.calcularTotal();
			}
		}
		return somaDespesas;

	}

	public double calcularReceitas(LocalDate inicio, LocalDate fim) {
		double somaReceitas = 0;

		for (Transacao t : this.transacoes) {
			if (t.getTipo().equals("RECEITA") && t.getData().isAfter(inicio.atStartOfDay())
					&& t.getData().isBefore(fim.atStartOfDay())) {
				somaReceitas += t.calcularTotal();
			}
		}
		return somaReceitas;

	}

	public double percentualReceitasNoMes(int mes, int ano) {
		double somaPerReceitas = 0;
		double aux3 = 0;

		for (Transacao t : transacoes) {
			if (t.getTipo().equals("RECEITA") && t.getData().getYear() == ano) {
				aux3 += t.calcularTotal();
			}
		}

		for (Transacao t : this.transacoes) {
			if (t.getData().getMonthValue() == mes && t.getData().getYear() == ano && t.getTipo().equals("RECEITA")) {
				somaPerReceitas += t.calcularTotal();
			}
		}
		return (somaPerReceitas * 100) / aux3;
	}

	public double percentualDespesasNoMes(int mes, int ano) {
		double somaPerDespesas = 0;
		double aux4 = 0;

		for (Transacao t : transacoes) {
			if (t.getTipo().equals("DESPESA") && t.getData().getYear() == ano) {
				aux4 += t.calcularTotal();
			}
		}

		for (Transacao t : this.transacoes) {
			if (t.getData().getMonthValue() == mes && t.getData().getYear() == ano && t.getTipo().equals("DESPESA")) {
				somaPerDespesas += t.calcularTotal();
			}
		}
		return (somaPerDespesas * 100) / aux4;
	}

	public double saldoAtual() {
		double saldoAtual = 0;

		for (Transacao t : this.transacoes) {
			if (t.getTipo().equals("RECEITA")) {
				saldoAtual += t.calcularTotal();
			} else if (t.getTipo().equals("DESPESA")) {
				saldoAtual -= t.calcularTotal();
			}
		}
		return saldoAtual;

	}

	public List<Transacao> listarTransacoesNoMes(int mes, int ano) {
		List<Transacao> tMes = new ArrayList<Transacao>();
		for (Transacao t : this.transacoes) {
			if (t.getData().getMonthValue() == mes && t.getData().getYear() == ano) {
				tMes.add(t);
			}
		}
		return tMes;

	}

}
