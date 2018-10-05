package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main4 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(new Scene(root, 600, 800));
		
		Button clickButton = new Button("快点击 我看看");
		String message = "我是小叮当";
		clickButton.setOnAction(e -> AlertBox.disPlay(message));
		
		Label label = new Label();
		label.setText("弹出一个警告框");
		
		VBox vBoxLayout = new VBox();
		vBoxLayout.getChildren().addAll(label, clickButton);
		vBoxLayout.setAlignment(Pos.CENTER);
		Scene scene = new Scene(vBoxLayout, 500, 300);
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private static class AlertBox {
		
		static void disPlay(String message) {
			Stage stage = new Stage();
			// I dont know what it is but it words
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setMinHeight(40);
			stage.setMinWidth(100);
			stage.setTitle(message);
			Button button = new Button("这是一警告框");
			VBox vBox = new VBox();
			vBox.setAlignment(Pos.CENTER);
			vBox.getChildren().add(button);
			Scene scene = new Scene(vBox, 100, 100);
			stage.setScene(scene);
			stage.showAndWait();
		}
	}
}
