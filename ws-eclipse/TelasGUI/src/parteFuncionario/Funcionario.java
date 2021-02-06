package parteFuncionario;

public class Funcionario  {
	private String nome;
	private int cpf;
	private int telefone;
	private String email;
	private int codFuncionario;

	public Funcionario(String nome, int cpf, int telefone, String email, int codFuncionario) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.codFuncionario = codFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String gerarRelatorioFuncionarios() {
		return String.format("Nome: " + this.nome + "|CPF: " + this.cpf + "|Telefone: " + this.telefone + "|email: "
				+ this.email + "|Cod.Func:" + this.codFuncionario);
	}


}