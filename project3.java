package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Label lb = new Label("Player name👤");
		TextField tf = new TextField();
		Label lb1 = new Label("Insert cheat code 🔒");
		PasswordField pw = new PasswordField();
		Button bt = new Button("Start Game🚀");
		VBox hb  = new VBox ();
		hb.getChildren().addAll(lb,tf,lb1,pw,bt);
		
		Scene sc = new Scene(hb,450,200);
		primaryStage.setScene(sc);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
