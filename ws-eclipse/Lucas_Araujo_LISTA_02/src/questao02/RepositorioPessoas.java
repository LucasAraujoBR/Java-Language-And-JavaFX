package questao02;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class RepositorioPessoas {
	ArrayList<Pessoa> pessoas;
	Period p;
	

	public RepositorioPessoas() {
		pessoas = new ArrayList<Pessoa>();
		
		
	}
	public boolean cadastrarPessoas(Pessoa pessoa) {
		boolean pessoaExiste = true;
		for(Pessoa p : this.pessoas) {
			if(p.equals(pessoa)) {
				pessoaExiste = false;
				break;				
			}
		}
		if(pessoaExiste) {
			pessoas.add(pessoa);
		}
		return pessoaExiste;
	}
	public ArrayList<Pessoa> listarPessoasMaioresIdade(){
		ArrayList<Pessoa> maior18 = new ArrayList<Pessoa>();
		for(Pessoa human:pessoas) {
			p = Period.between(human.getDataNascimento(),LocalDate.now());
		if(p.getYears() >= 18) {
			maior18.add(human);
		}
		}
		
		
		return maior18;
	}
	
	public ArrayList<Cliente> listarClientesMaioresIdade(){
		ArrayList<Cliente> clienteMaior18 = new ArrayList<Cliente>();
		for(Pessoa human:pessoas) {
			Cliente pCliente;
			if(human instanceof Cliente) {
			p = Period.between(human.getDataNascimento(),LocalDate.now());
			pCliente = ((Cliente) human);
			if(p.getYears() >= 18) {
				clienteMaior18.add(pCliente);
			}
			}
			
		}
		
		
		return clienteMaior18;
	}
	
	public ArrayList<Funcionario> funcionaComSalarioMaiorQue(double x){
ArrayList<Funcionario> FuncMaisRemunerado = new ArrayList<Funcionario>();
		
		for(Pessoa p : pessoas ) {
			Funcionario pessoaFuncionario;
			if(p instanceof Funcionario) {
				pessoaFuncionario = ((Funcionario) p);
				if(pessoaFuncionario.getSalario() > x) {
					FuncMaisRemunerado.add(pessoaFuncionario);
				}
			}
		}
		return FuncMaisRemunerado;
	}
	public ArrayList<Gerente> listarGerentesDaArea(String area) {
		ArrayList<Gerente> gerentesDeArea = new ArrayList<Gerente>();
		
		for(Pessoa p: pessoas) {
			Gerente pGerente;
			if(p instanceof Gerente) {
				pGerente = (Gerente) p;
				if(pGerente.getArea().equals(area)) {
					gerentesDeArea.add(pGerente);
				}
			}
		}
		return gerentesDeArea;
	}
	
}
