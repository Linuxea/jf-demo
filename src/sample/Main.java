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
	
	private Button clickButton;
	private Button clickButton2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 800));
		
		clickButton = new Button("click me");
		clickButton.setOnAction(new ButtonClickEvent());
		
		clickButton2 = new Button("click me 2");
		clickButton2.setOnAction(r -> {
			if (r.getSource() == clickButton2) {
				System.out.println("你点击的是第二个 button");
			}
		});
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(clickButton);
		stackPane.getChildren().add(clickButton2);
		Scene scene = new Scene(stackPane, 400, 300);
		
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
