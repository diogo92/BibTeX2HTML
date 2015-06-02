package bibtex2html;

import java.io.IOException;

import bibtex2html.model.Options;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
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
		this.primaryStage.setResizable(false);
		this.options = new Options();
		initLayout();
		showMainView();
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

	public void showMainView() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/MainView.fxml"));
            AnchorPane mainView = (AnchorPane) loader.load();
            
            layout.getChildren().add(mainView);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
