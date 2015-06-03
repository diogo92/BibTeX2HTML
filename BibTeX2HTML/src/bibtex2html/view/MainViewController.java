package bibtex2html.view;

import java.io.File;
import java.io.PrintStream;

import bibtex2html.parser.BibParser;
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
    
    
    public void initialize(){
    	Console console = new Console(log);
        PrintStream printSt = new PrintStream(console, true);
        System.setOut(printSt);
        System.setErr(printSt);
    }
    
    @FXML public void chooseFile() {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Choose .bib file to parse");
    	File choosenFile = fileChooser.showOpenDialog(null);
    	if(choosenFile != null){
    		file.setText(choosenFile.getAbsolutePath());
    	}
    }
    
    @FXML public void chooseOutputFolder(){
    	DirectoryChooser directoryChooser = new DirectoryChooser();
    	directoryChooser.setTitle("Choose the directory for the output");
    	File choosenDir = directoryChooser.showDialog(null);
    	if(choosenDir != null){
    		outputFolder.setText(choosenDir.getAbsolutePath());
    	}
    }
    
    @FXML public void run(){
    	BibParser.start(this.file.getText(),this.outputFolder.getText());
    }

}
