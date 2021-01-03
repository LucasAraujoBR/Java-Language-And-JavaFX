package questao03;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao{
	protected LocalDateTime data;
	protected String descricao;
	public String getTipo() {
		return "RECEITA";
	}
	public abstract double calcularTotal();
}
