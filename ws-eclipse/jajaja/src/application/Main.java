package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage){
		try {
		Parent root = FXMLLoader.load(getClass().getResource("application/FXMLisso.fxml"));
		
		Scene scene = new Scene(root,300,400);
		scene.getStylesheets().add(getClass().getResource("appication.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Contador de caracteres APP");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
		
		
		
	}
	
}
