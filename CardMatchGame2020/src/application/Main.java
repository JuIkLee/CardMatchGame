package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	//윈도우 시작 부터 끝까지 화면 구성에 대한 내용을 설정해주는 start 함수
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("root.fxml"));
			Parent root = loader.load();
			RootController controller = loader.getController();
			controller.setPrimaryStage(primaryStage);
			Scene scene = new Scene(root);
				
			primaryStage.setTitle("Pair Game - stage1");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
