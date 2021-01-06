package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pane root = FXMLLoader.load(getClass().getResource("FXMLmontar.fxml"));
		Scene scene = new Scene(root,500,280);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Calculadora de venda APP");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
