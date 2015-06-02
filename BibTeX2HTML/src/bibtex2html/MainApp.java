package bibtex2html;

import java.io.IOException;

import bibtex2html.model.Options;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
	private Stage primaryStage;
	private VBox layout;
	private Options options;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("BibText2HTML");
		this.options = new Options();
		
		initLayout();
	}
	
	public void initLayout(){
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource("view/Layout.fxml"));
		
		try {
			layout = (VBox) loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scene scene = new Scene(layout);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
