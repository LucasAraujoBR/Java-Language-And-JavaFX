package parteFuncionario;

public class mainfunteste {

	public static void main(String[] args) {
		FuncionarioCadastro cad = new FuncionarioCadastro();
		Funcionario fg = new Funcionario("Lucas",2,3,"s",3);
	
		cad.cadrastarFuncionario(fg);
	
		System.out.println(cad.listarFuncionario());

	}

}
