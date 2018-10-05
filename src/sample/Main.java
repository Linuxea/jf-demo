package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button clickButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 300, 275));
		
		clickButton = new Button("click me");
		clickButton.setOnAction(new ButtonClickEvent());
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(clickButton);
		Scene scene = new Scene(stackPane, 100, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private final class ButtonClickEvent implements EventHandler<ActionEvent> {
		
		@Override
		public void handle(ActionEvent event) {
			if (event.getSource() == clickButton) {
				System.out.println("请继续点击我");
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
