package bibtex2html.view;

import java.io.IOException;
import java.io.OutputStream;

import javafx.scene.control.TextArea;

public class Console extends OutputStream {

	private TextArea log;
	
	public Console(TextArea log){
		this.log = log;
	}
	
	@Override
	public void write(int b) throws IOException {
		log.appendText(String.valueOf((char) b));
	}

}
