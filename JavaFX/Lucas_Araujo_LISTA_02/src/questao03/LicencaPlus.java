package questao03;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita{
	protected int totalContas;
	
	public LicencaPlus(String data,int totalContas) {
		super(data);
		this.totalContas = totalContas;
	}


	public String getDescricao() {

		return "Licença Plus";
	}

	
	public double calcularTotal() {
		totalContas *=35.00;
		return (double) totalContas;
	}

}
