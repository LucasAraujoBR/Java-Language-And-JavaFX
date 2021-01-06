package questao04part2;

import java.awt.Color;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class Controller {
	@FXML
    private AnchorPane rootPane;
	@FXML
    private Button b1;

    @FXML
    private TextField txtDescricao;

    @FXML
    private TextField txtValor;

    @FXML
    private TextField txtQuantidade;
    @FXML
	private Button bOk;

	@FXML
	private Label labelAlerta;

	@FXML
	void acaoBotaoOK(ActionEvent event) throws IOException {
		acaoBotao(event);
	}

    @FXML
    void acaoBotao(ActionEvent event) throws IOException {
    	
    	String descricao = txtDescricao.getText();
    	if(descricao.length() == 0) {
    		Alert alerta = new Alert(Alert.AlertType.WARNING);
        	alerta.setTitle("Alerta");
        	alerta.setHeaderText(null);
        	alerta.setContentText("Favor,informar o campo <DESCRICÃO>");
        	alerta.show();
    	}
    	String valorString = txtValor.getText();
    	if(valorString.length() == 0) {
    		Alert alerta = new Alert(Alert.AlertType.WARNING);
        	alerta.setTitle("Alerta");
        	alerta.setHeaderText(null);
        	alerta.setContentText("Favor,informar o campo <VALOR R$>");
        	alerta.show();
    	}
    	String quantidadeString = txtQuantidade.getText();
    	if(quantidadeString.length() == 0) {
    		Alert alerta = new Alert(Alert.AlertType.WARNING);
        	alerta.setTitle("Alerta");
        	alerta.setHeaderText(null);
        	alerta.setContentText("Favor,informar o campo <QUANTIDADE>");
        	alerta.show();
    	}
    	
    	double valor = Double.parseDouble(valorString);
    	double quantidade = Double.parseDouble(quantidadeString);
    	Produto p = new Produto(quantidade,valor,descricao);
    	
    	
    	if(descricao.length()>0 && valorString.length() >0  && quantidadeString.length()>0) {
    	Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    	alerta.setTitle("Mensagem");
    	alerta.setHeaderText(null);
    	alerta.setContentText("O valor calculado para a venda do produto <" + descricao + "> é R$ <" + p.calcularTotal()+">");
    	alerta.show();
    	}

    }
}
