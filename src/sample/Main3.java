package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Main3 extends Application {
	
	private Button clickButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 800));
		
		Label label = new Label();
		
		StackPane stackPane = new StackPane();
		clickButton = new Button("change  background color");
		clickButton.setOnAction(e -> {
			label.setText(UUID.randomUUID().toString());
			ArrayList<Color> color = new ArrayList<>();
			color.add(Color.RED);
			color.add(Color.BLUE);
			color.add(Color.YELLOW);
			color.add(Color.BLACK);
			color.add(Color.LIGHTGREEN);
			label.setTextFill(color.get(new Random().nextInt(color.size())));
		});
		stackPane.getChildren().addAll(label, clickButton);
		Scene scene = new Scene(stackPane, 500, 300);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
