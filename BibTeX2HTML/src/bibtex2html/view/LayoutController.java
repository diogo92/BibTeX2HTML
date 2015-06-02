package bibtex2html.view;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class LayoutController extends VBox{
	
	@FXML public void onQuit(){
		Platform.exit();
	}
	
	@FXML public void onAbout(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About BibText2HTML");
		alert.setHeaderText("BibText2HTML 1.0.0");
		alert.setContentText("Project done by:"
				+ "\n\u2022 Daniel Teixeira ei10067@fe.up.pt"
				+ "\n\u2022 Diogo Ribeiro ei11005@fe.up.pt"
				+ "\n\u2022 Diogo Eiras ei11087@fe.up.pt"
				+ "\n\u2022 Pedro Castro ei07069@fe.up.pt");
		alert.showAndWait();
	}
	
}
