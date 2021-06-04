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
		
		TextField txt1 = new TextField("0");
		TextField txt2 = new TextField("0");
		Label lbl1 = new Label("0");
		Label lblPlus = new Label("+");
		Label lbl2 = new Label("0");
		Label lblEgal = new Label("=");
		Label lblRes = new Label("0");
		
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
		
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl2.textProperty().bind(txt2.textProperty());
		
		
		txt1.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			
			
			lblRes.setText(Integer.toString(checkText(lbl1) + checkText(lbl2)));

		}
				);
		
		txt2.textProperty().addListener((observable,oldValue,newValue) -> 
		{
			
			lblRes.setText(Integer.toString(checkText(lbl1) + checkText(lbl2)));
			
		}
				);
		
			
		group.getChildren().addAll(txt1,txt2,lbl1,lblPlus,lbl2,lblEgal,lblRes);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	int checkText (Label a)
	{
		int val;
		
		if(a.getText().equals(""))
			val = 0;
		else
			val = Integer.parseInt(a.getText());
		return val;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
