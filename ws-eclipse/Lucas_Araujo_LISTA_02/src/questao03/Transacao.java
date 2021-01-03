package questao03;

import java.time.LocalDateTime;

public interface Transacao {
	public LocalDateTime getData();
	public String getTipo();
	public String getDescricao();
	public double calcularTotal();
	
}
