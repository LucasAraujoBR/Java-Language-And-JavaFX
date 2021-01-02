package questao02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		RepositorioPessoas rp = new RepositorioPessoas();
		
		//CLIENTE
		Cliente c1 = new Cliente("Sophie de Melo", LocalDate.of(1990, 02, 07), 111111);
		Cliente c2 = new Cliente("Eduarda Pereira", LocalDate.of(1999, 10, 30), 222222);
		Cliente c3 = new Cliente("João de Souza", LocalDate.of(1998, 10, 16), 333333);
		Cliente c4 = new Cliente("Gabriel da Silva",LocalDate.of(1988, 06, 15), 444444);
		Cliente c5 = new Cliente("Ketlyn Loyrannie", LocalDate.of(1978, 11, 10), 555555);
		
		rp.cadastrarPessoas(c1);
		rp.cadastrarPessoas(c2);
		rp.cadastrarPessoas(c3);
		rp.cadastrarPessoas(c4);
		rp.cadastrarPessoas(c5);
		
		
		Cliente c6 = new Cliente("Sophie de Melo", LocalDate.of(1990, 02, 07), 111111);
		rp.cadastrarPessoas(c6);
		System.out.println("Teste de cadastro repetivo = " + rp.cadastrarPessoas(c6));
		//FUNCIONARIO
		Funcionario f1 = new Funcionario("Mario da Silva", LocalDate.of(1970, 03, 06), 6200.00, 6500.00);
		Funcionario f2 = new Funcionario("Clara Falcão", LocalDate.of(1990, 04, 01), 16350.00, 16500.00);
		Funcionario f3 = new Funcionario("Thiago Mesquita", LocalDate.of(1980, 9, 02), 2440.00, 2500.00);
		Funcionario f4 = new Funcionario("Simon Weller", LocalDate.of(1982, 03, 7), 22333.00, 22500.00);
		Funcionario f5 = new Funcionario("Jorge Menezes", LocalDate.of(1989, 8, 05), 3492.00, 3500.00);
		
		rp.cadastrarPessoas(f1);
		rp.cadastrarPessoas(f2);
		rp.cadastrarPessoas(f3);
		rp.cadastrarPessoas(f4);
		rp.cadastrarPessoas(f5);
		
		Funcionario f6 = new Funcionario("Mario da Silva", LocalDate.of(1980, 03, 05), 3150.00, 6500.00);
		rp.cadastrarPessoas(f6);
		System.out.println("Teste de cadastro repetivo = " + rp.cadastrarPessoas(f6));
		
		//GERENTE
		Gerente g1 = new Gerente("Eduarda Pereira", LocalDate.of(1984, 7, 9),"Projetos", 11121.00, 12000.00);
		Gerente g2 = new Gerente("Marina Silva", LocalDate.of(1990, 8, 7),"RH", 8020.00, 9000.00);
		Gerente g3 = new Gerente("Severino Nascimento", LocalDate.of(1975, 03, 05),"Projetos", 17750.00, 18000.00);
		Gerente g4 = new Gerente("Joaquim Lahn", LocalDate.of(1980, 9, 05),"Marketing", 7500.00, 8000.00);
		Gerente g5 = new Gerente("João da Silva", LocalDate.of(1964, 8, 01),"Projetos", 33450.00, 35000.00);
		
		rp.cadastrarPessoas(g1);
		rp.cadastrarPessoas(g2);
		rp.cadastrarPessoas(g3);
		rp.cadastrarPessoas(g4);
		rp.cadastrarPessoas(g5);
		
		Gerente g6 = new Gerente("Eduarda Pereira", LocalDate.of(1984, 7, 9),"Projetos", 11121.00, 12000.00);
		rp.cadastrarPessoas(g6);
		System.out.println("Teste de cadastro repetivo = " + rp.cadastrarPessoas(g6));
		System.out.println();
		//Metodos de listar do RepositorioPessoas 
		System.out.println("Pessoas maiores de 18 anos: ");
		for(Pessoa pessoa : rp.listarPessoasMaioresIdade()) {
			System.out.println(pessoa);
		}
		System.out.println();
		
		System.out.println("Clientes maiores de 18 anos: ");
		for(Pessoa pessoa : rp.listarClientesMaioresIdade()) {
			System.out.println(pessoa);
		}
		System.out.println();
		System.out.println("Lista de Funcionários que recebem mais de 8000.00");
		for(Pessoa pessoa : rp.funcionaComSalarioMaiorQue(8000)) {
			System.out.println(pessoa);
		}
		System.out.println();
		System.out.println("Lista de Gerentes da area Projetos: ");
		for(Pessoa pessoa : rp.listarGerentesDaArea("Projetos")) {
			System.out.println(pessoa);
		}

	}

}
