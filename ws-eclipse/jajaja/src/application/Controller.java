package application;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	
	  @FXML
	    private Button b1;

	    @FXML
	    private Label l1;

	    @FXML
	    private TextArea tArea;

	    @FXML
	    private TextField t1;
	    
	    @FXML
	    private void acaoDoBotao(ActionEvent event) {
	    	String caracteres = tArea.getText();
	    	l1.setText("O número de caracteres eh " + caracteres.length());
	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}

}
