package bibtex2html;

import java.io.IOException;

import bibtex2html.parser.BibParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
	private Stage primaryStage;
	private VBox layout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("BibText2HTML");
		this.primaryStage.setResizable(false);
		this.primaryStage.getIcons().add(
				new Image(getClass().getResourceAsStream("view/icon.png")));

		initLayout();
		showMainView();
	}

	public void initLayout() {
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
		if (args.length == 0)
			launch(args);
		else if (args.length == 3)
			if (args[2].matches("^\\d+$"))
				if (Integer.parseInt(args[2]) >= 0
						&& Integer.parseInt(args[2]) <= 4)
					BibParser
							.start(args[0], args[1], Integer.parseInt(args[2]));
				else {
					System.err
							.println("Third argument must be a number between 0 and 4");
					System.exit(-1);
				}
			else {
				System.err.println("Third argument must be a number");
				System.exit(-1);
			}
		else {
			System.err.println("Usage:\n"
					+ "<input file> <output folder> <template>\n"
					+ "> input file: string\n" + "> output folder: string\n"
					+ "> template: int\n" + "\t0 default\n" + "\t1 APA\n"
					+ "\t2 Chicago\n" + "\t3 MLA\n" + "\t4 Turabian");
			System.exit(-1);
		}
	}
}
