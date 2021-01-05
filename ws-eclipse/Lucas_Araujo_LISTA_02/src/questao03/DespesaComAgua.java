package questao03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DespesaComAgua extends Despesas {
	protected double totalM3;

	public DespesaComAgua(String data, double totalM3) {
		super(data);
		this.totalM3 = totalM3;
	}

	public String getDescricao() {

		return "Conta de agua";
	}

	public double calcularTotal() {
		double valorTotal = 0;
		double aux = 0;
		if (totalM3 >= 0) {
			if (totalM3 <= 20) {
				valorTotal = 45.00 + (5.00 * (totalM3 - 10));
			} else if (totalM3 > 20) {
				aux = 6.00 * (totalM3 - 20);
				valorTotal = 45.00 + (5.00 * (totalM3 - 10 - aux / 6)) + aux;

			} else {
				valorTotal = 45.00;
			}

		} else {
			valorTotal = 0.00;
		}
		return valorTotal;
	}
}
