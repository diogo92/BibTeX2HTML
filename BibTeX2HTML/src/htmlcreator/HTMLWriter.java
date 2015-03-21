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
	    Template currentTemplate = cfg.getTemplate("Article.ftl");
	    
	    // Template Input Example
	    Map<String, Object> input = new HashMap<String, Object>();
	    
	    // Set what to write on $title tags
	    input.put("title", "Bibliographic References");
	    
	    //TODO: Take data into consideration
	    //TODO: Make versions for other types
	    
	    // Set what to write on $ArticleData tags
	    List<ArticleData> ArticleList = new ArrayList<ArticleData>();
	    ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos", "Journal Com Espacos", 1993));
	    ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos", "Journal Com Espacos", 1993));
	    ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos", "Journal Com Espacos", 1993));
	    ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos", "Journal Com Espacos", 1993));
	    input.put("ArticleList", ArticleList);
	    
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
