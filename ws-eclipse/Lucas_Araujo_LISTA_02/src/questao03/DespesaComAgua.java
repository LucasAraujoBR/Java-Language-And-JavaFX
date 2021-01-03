package questao03;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesas {
	protected double totalM3;

	public DespesaComAgua(double totalM3) {
		super();
		this.totalM3 = totalM3;
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
		double valorTotal = 0;
		double aux=0;
		if(totalM3>=0){
			if(totalM3<=20) {
				valorTotal = 45.00+(5.00*(totalM3-10));
			}else if(totalM3>20) {
				aux = 6.00*(totalM3 - 20);
				valorTotal = 45.00 + (5.00*(totalM3-10 - aux/6)) + aux ;
					
			}else {
				valorTotal = 45.00;
			}
			
		}else {
			valorTotal = 0.00;
		}
		return valorTotal;
	}

}
