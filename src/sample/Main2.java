package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application {
	
	private Button clickButton;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 800));
		
		clickButton = new Button("click me");
		clickButton.setOnAction(r -> {
			if (r.getSource() == clickButton) {
				System.out.println("Hello");
			}
		});
		
		Label label = new Label("欢迎来到中国");
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(label, clickButton);
		
		Scene scene = new Scene(vBox, 400, 300);
		
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
