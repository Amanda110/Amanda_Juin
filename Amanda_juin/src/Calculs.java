/*
* Author : amandatishler
* Date : Jun. 2, 2021
* Description : 
*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculs extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group group = new Group();
		Scene scene = new Scene(group,400,400);
		
		TextField txt1 = new TextField();
		TextField txt2 = new TextField();
		Label lbl1 = new Label();
		Label lblPlus = new Label();
		Label lbl2 = new Label();
		Label lblEgal = new Label();
		Label lblRes = new Label();
		
		txt1.setLayoutX(120);
		txt1.setLayoutY(100);
		txt2.setLayoutX(120);
		txt2.setLayoutY(170);
		lbl1.setLayoutX(120);
		lbl1.setLayoutY(250);
		lblPlus.setLayoutX(160);
		lblPlus.setLayoutY(250);
		lbl2.setLayoutX(200);
		lbl2.setLayoutY(250);
		lblEgal.setLayoutX(240);
		lblEgal.setLayoutY(250);
		lblRes.setLayoutX(280);
		lblRes.setLayoutY(250);
		
		lblPlus.setText("+");
		lblEgal.setText("=");
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl2.textProperty().bind(txt2.textProperty());
		
		
		txt1.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			
			

		}
				);
		
		txt2.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			
			
		}
				);
		
		
		
		group.getChildren().add(txt1);
		group.getChildren().add(txt2);
		group.getChildren().add(lbl1);
		group.getChildren().add(lblPlus);
		group.getChildren().add(lbl2);
		group.getChildren().add(lblEgal);
		group.getChildren().add(lblRes);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
