package questao02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public Pessoa(String nome, LocalDate dataNascimento) {
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
	
	
	
	}
	
	
	
	
	
	public DateTimeFormatter getFormatador() {
		return formatador;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}










	@Override
	public String toString() {
		return String.format(" Nome: %s | Data de Nascimento: %s |", this.getNome(), this.getFormatador().format(this.getDataNascimento()));
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
