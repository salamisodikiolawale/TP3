package TP3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Bonjour extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("un test");
		
		Label label = new Label("Bonjour!!");//widget
		Scene scene = new Scene(label, 300, 200);//Ecran
		primaryStage.setScene(scene);
		//primaryStage.show();//Fenetre
	}
	
	//2 - Permet d'initier un projet fx
	//Nous voyons bonjour
	//3- La methode start
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
