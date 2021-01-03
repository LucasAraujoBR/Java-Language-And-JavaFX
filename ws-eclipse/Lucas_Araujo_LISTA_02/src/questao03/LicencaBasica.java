package questao03;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita{
	protected int totalContas;

	public LicencaBasica(int totalContas) {
		super();
		this.totalContas = totalContas;
	}

	@Override
	public LocalDateTime getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcularTotal() {
		totalContas *= 20.00;
		return (double) totalContas;
	}

}
