package questao04par1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	  @FXML
	    private Label l1;
	  @FXML
	    private TextArea tArea;
	  @FXML
	    void butaoAcao(ActionEvent event) {
		  String caracteres = tArea.getText();
	    	l1.setText("O texto tem " + caracteres.replaceAll("\\s","").length() + " caracteres");

	    }

}
