package htmlcreator;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import data.ArticleData;

public class HTMLWriter {

	public static void main(String[] args) throws Exception{
		
		// Set FreeMarker configuration
		Configuration cfg = new Configuration(new Version(2, 3, 22)); // Current FreeMarker Version
		
		// Preset Recommended Options
	    cfg.setDefaultEncoding("UTF-8");
	    cfg.setLocale(Locale.US);
	    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	    
		// Load Templates
		cfg.setClassForTemplateLoading(HTMLWriter.class, "templates");
		
		// Choose Template
	    Template currentTemplate = cfg.getTemplate("Basic.ftl");
	    
	    // Template Input Example
	    Map<String, Object> input = new HashMap<String, Object>();
	    
	    // Set what to write on $title tags
	    input.put("title", "Bibliographic References");
	    
	    // Set what to write on $data tags
	    ArticleData d1 = new ArticleData("chave", "Joao", "Titulo Com Espacos", "Journal Com Espacos", 1993);
	    input.put("ArticleData", d1);
	    
	    //TODO: Parsing for Generic data structure
	    //TODO: -> Requires data storage done
	    
	    // Write output to Console
	    Writer consoleWriter = new OutputStreamWriter(System.out);
	    currentTemplate.process(input, consoleWriter);

	    // Write output to File
	    Writer fileWriter = new FileWriter(new File("output.html"));
	    try {
	    	currentTemplate.process(input, fileWriter);
	    } finally {
	    	fileWriter.close();
	    }
	    
	}

}
