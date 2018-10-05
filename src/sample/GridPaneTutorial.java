package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GridPaneTutorial extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 800));
		
		javafx.scene.layout.GridPane gridPane = new javafx.scene.layout.GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(20);
		gridPane.setVgap(10);
		
		Label userNameLabel = new Label("用户");
		javafx.scene.layout.GridPane.setConstraints(userNameLabel, 0, 0);
		
		TextField userNameTextField = new TextField();
		javafx.scene.layout.GridPane.setConstraints(userNameTextField, 1, 0);
		
		Label passwordLabel = new Label("密码");
		javafx.scene.layout.GridPane.setConstraints(passwordLabel, 0, 1);
		
		TextField passwordTextField = new TextField();
		javafx.scene.layout.GridPane.setConstraints(passwordTextField, 1, 1);
		
		Button button = new Button();
		button.setText("登录");
		javafx.scene.layout.GridPane.setConstraints(button, 1, 2);
		
		gridPane.getChildren().addAll(userNameLabel, userNameTextField, passwordLabel, passwordTextField, button);
		Scene scene = new Scene(gridPane, 500, 600);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
