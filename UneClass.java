package TP3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UneClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("un test");
		
		Button btn = new Button("Un button");
		btn.setPrefSize(12, 30);
		//btn.setOnAction(new BoutonHandler());
		//Q5
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				System.out.println("Bonj");
//			}
//		});
		btn.setOnAction( event -> System.out.println("bouton click") );
		Scene scene = new Scene(btn, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//Exo 2 : Q3
//	public class BoutonHandler implements EventHandler<ActionEvent> {
//		
//		public void handle(ActionEvent event) {
//			
//			System.out.println("bouton click");
//		}
//	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
