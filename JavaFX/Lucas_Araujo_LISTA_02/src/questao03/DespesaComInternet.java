package questao03;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesas {
	protected double dadosTrafegados;

	public DespesaComInternet(String data, double dadosTrafegados) {
		super(data);
		this.dadosTrafegados = dadosTrafegados;
	}

	public String getDescricao() {

		return "Conta de Internet";
	}

	public double calcularTotal() {
		double valorTotal = 0;
		if (dadosTrafegados >= 20 && dadosTrafegados < 100) {
			valorTotal = 90.90 + (3.90 * (dadosTrafegados - 20));
		} else if (dadosTrafegados >= 100 && dadosTrafegados < 500) {
			valorTotal = 240.90 + (4.40 * (dadosTrafegados - 100));
		} else if (dadosTrafegados >= 500) {
			valorTotal = 590.90 + (5.10 * (dadosTrafegados - 500));
		} else {
			valorTotal = 0;
		}
		return valorTotal;
	}

}
