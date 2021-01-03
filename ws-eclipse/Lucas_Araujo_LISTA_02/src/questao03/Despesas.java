package questao03;

import java.time.LocalDateTime;

public abstract class Despesas implements Transacao {
	protected LocalDateTime data;
	protected String descricao;
	
	public String getTipo() {
		return "DESPESA";
	}
	public abstract double calcularTotal();
}
