package questao03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Receita implements Transacao{
	protected LocalDateTime data;
	protected String descricao;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	public Receita(String data) {
		this.data = LocalDateTime.parse(data,this.formatador);
		
	}
	public abstract String getDescricao();
	
	public LocalDateTime getData() {
		return this.data;
	}
	
	public String toString() {
		return String.format("Tipo: %s |Descricao: %s | Valor: %.1f\n | Data: %s ",this.getTipo(), this.getDescricao(), this.calcularTotal(),this.getData());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receita other = (Receita) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	public String getTipo() {
		return "RECEITA";
	}
	public abstract double calcularTotal();
}
