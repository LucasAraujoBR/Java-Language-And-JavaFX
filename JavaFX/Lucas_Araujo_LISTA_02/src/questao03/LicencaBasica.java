package questao03;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita{
	protected int totalContas;

	public LicencaBasica(String data,int totalContas) {
		super(data);
		this.totalContas = totalContas;
	}

	
	public String getDescricao() {
		
		return "Licença básica";
	}

	
	public double calcularTotal() {
		totalContas *= 20.00;
		return (double) totalContas;
	}

}
