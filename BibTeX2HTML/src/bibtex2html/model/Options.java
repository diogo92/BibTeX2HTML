package bibtex2html.model;

public class Options {
	
	private String file;
	private String outputFolder;
	private Templates template;
	
	public enum Templates{
		APA,
		Chicago,
		MLA,
		Standard,
		Turabian
	}
	
	public Options() {
		this.template = Templates.Standard;
	}

}
