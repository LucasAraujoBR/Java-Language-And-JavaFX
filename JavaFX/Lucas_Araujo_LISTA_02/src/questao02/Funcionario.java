package questao02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private double salario;
	private double SALARIO_TETO_IMPOSTO;
	
	
	public Funcionario(String nome, LocalDate dataNascimento,double salario,double SALARIO_TETO_IMPOSTO) {
		super(nome, dataNascimento);
		this.salario = salario;
		this.SALARIO_TETO_IMPOSTO = SALARIO_TETO_IMPOSTO;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(SALARIO_TETO_IMPOSTO);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Double.doubleToLongBits(SALARIO_TETO_IMPOSTO) != Double.doubleToLongBits(other.SALARIO_TETO_IMPOSTO))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String funcionario = super.toString();
		return funcionario + String.format(" Salário: R$ %.3f | Valor Imposto: R$ %.3f |", this.getSalario(), this.calcularImpostoDevido());
	}
	public double calcularImpostoDevido() {
		if(salario<=SALARIO_TETO_IMPOSTO) {
			return salario * 0.05;
		}else{
			return salario * 0.075;
		}
		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSALARIO_TETO_IMPOSTO() {
		return SALARIO_TETO_IMPOSTO;
	}
	public void setSALARIO_TETO_IMPOSTO(double sALARIO_TETO_IMPOSTO) {
		SALARIO_TETO_IMPOSTO = sALARIO_TETO_IMPOSTO;
	}

}
