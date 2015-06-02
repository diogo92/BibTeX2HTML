package bibtex2html.view;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

public class MainViewController extends AnchorPane {

    @FXML ChoiceBox template;
    @FXML TextField file;
    @FXML TextField outputFolder;
    @FXML TextArea log;

    @FXML public void chooseFile() {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Choose .bib file to parse");
    	file.setText(fileChooser.showOpenDialog(null).getAbsolutePath());
    }
    
    @FXML public void chooseOutputFolder(){
    	DirectoryChooser directoryChooser = new DirectoryChooser();
    	directoryChooser.setTitle("Choose the directory for the output");
    	outputFolder.setText(directoryChooser.showDialog(null).getAbsolutePath());
    }

}
