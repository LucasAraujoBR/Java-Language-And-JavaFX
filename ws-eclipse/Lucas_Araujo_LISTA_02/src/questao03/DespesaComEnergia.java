package questao03;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesas {
	protected double kWh;

	public DespesaComEnergia(double kWh) {
		super();
		this.kWh = kWh;
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
		if(kWh>=100) {
		valorTotal = kWh * 0.50 + (kWh/100)*1.20;
		}else {
			valorTotal = kWh * 0.50;
		}
		
		if(kWh>=0 && kWh<=50){
			valorTotal += 2.00;
		}else if(kWh>50 && kWh<=200) {
			valorTotal += 15.00;
		}else if(kWh>200) {
			valorTotal += 35.00;
		}
		
		return valorTotal;
	}
}
