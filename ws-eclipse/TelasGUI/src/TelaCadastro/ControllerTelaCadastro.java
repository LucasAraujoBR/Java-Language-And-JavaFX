package TelaCadastro;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import parteFuncionario.Funcionario;
import parteFuncionario.FuncionarioCadastro;

public class ControllerTelaCadastro implements Initializable {

	@FXML
	private TextField nomeTXT;

	@FXML
	private TextField cpfTXT;

	@FXML
	private TextField emailTXT;

	@FXML
	private TextField telefoneTXT;

	@FXML
	private ListView<Funcionario> listViewCadastro;

	@FXML
	private Button adicionarBTM;

	@FXML
	private Button removerBTM;

	@FXML
	private TextField codFuncionarioTXT;
	@FXML
    private Button interBTM;

    @FXML
    private Button voltaBTM;


	@FXML
	void acaoAdicionarBTM(ActionEvent event) {
		/*String nomeF = nomeTXT.getText();
		String cpfF = cpfTXT.getText();
		String emailF = emailTXT.getText();
		String telefoneF = telefoneTXT.getText();
		String codF = codFuncionarioTXT.getText();
		Funcionario f = new Funcionario(nomeF, cpfF,telefoneF, emailF, codF);
		FuncionarioCadastro cad = new FuncionarioCadastro();
		cad.cadrastarFuncionario(f);*/

	}
	@FXML
	void listarFuncionarios(ActionEvent event) {
		/*FuncionarioCadastro cad = new FuncionarioCadastro();
		Funcionario fg = new Funcionario("a", "b", "c", "d", "e");
		cad.cadrastarFuncionario(fg);
		listViewCadastro.getItems().addAll(cad.listarFuncionarios());
		listViewCadastro.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);*/

	}

	@FXML
	void acaoRemoverBTM(ActionEvent event) {

	}

    @FXML
    void acaoBTMInter(ActionEvent event) {

    }

    @FXML
    void acaoBTMVoltar(ActionEvent event) {
    	Main.changeScreen("Login");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listarFuncionarios(null);

	}
}
