package questao03;

import java.time.LocalDateTime;

public class LicencaEnterprise extends Receita{
	protected int totalContas;

	public LicencaEnterprise(String data,int totalContas) {
		super(data);
		this.totalContas = totalContas;
	}


	
	public String getDescricao() {
		
		return "Licença Enterprise";
	}

	
	public double calcularTotal() {
		totalContas *= 150.00;
		return (double) totalContas;
	}

}
