package QuintoQuesito;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	LocalDate dtHoje = LocalDate.now();
	String cpf;
	String nome;
	LocalDate dataNascimento;
	
	public Cliente() {
		
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public int calcularIdade(LocalDate dtHoje,LocalDate dataNascimento) {
		Period p = Period.between(dtHoje, dataNascimento);
		return p.getYears();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
