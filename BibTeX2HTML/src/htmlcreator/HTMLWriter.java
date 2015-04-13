package htmlcreator;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
import data.*;

public class HTMLWriter {

	// Set what to write on $ArticleData tags
	public static List<ArticleData> ArticleList;

	// Set what to write on $BookData tags
	public static List<BookData> BookList;

	// Set what to write on $BookletData tags
	public static List<BookletData> BookletList;

	// Set what to write on $ConferenceData tags
	public static List<ConferenceData> ConferenceList;

	// Set what to write on $InbookData tags
	public static List<InbookData> InbookList;

	// Set what to write on $IncollectionData tags
	public static List<IncollectionData> IncollectionList;

	// Set what to write on $InproceedingsData tags
	public static List<InproceedingsData> InproceedingsList;

	// Set what to write on $ManualData tags
	public static List<ManualData> ManualList;

	// Set what to write on $MastersthesisData tags
	public static List<MastersthesisData> MastersthesisList;

	// Set what to write on $MiscData tags
	public static List<MiscData> MiscList;

	// Set what to write on $PdthesisData tags
	public static List<PhdthesisData> PhdthesisList;

	// Set what to write on $ProceedingsData tags
	public static List<ProceedingsData> ProceedingsList;

	// Set what to write on $TechreportData tags
	public static List<TechreportData> TechreportList;

	// Set what to write on $UnpublishedData tags
	public static List<UnpublishedData> UnpublishedList;

	// Constructor
	public HTMLWriter() {

		ArticleList = new ArrayList<ArticleData>();
		BookList = new ArrayList<BookData>();
		BookletList = new ArrayList<BookletData>();
		ConferenceList = new ArrayList<ConferenceData>();
		InbookList = new ArrayList<InbookData>();
		IncollectionList = new ArrayList<IncollectionData>();
		InproceedingsList = new ArrayList<InproceedingsData>();
		ManualList = new ArrayList<ManualData>();
		MastersthesisList = new ArrayList<MastersthesisData>();
		MiscList = new ArrayList<MiscData>();
		PhdthesisList = new ArrayList<PhdthesisData>();
		ProceedingsList = new ArrayList<ProceedingsData>();
		TechreportList = new ArrayList<TechreportData>();
		UnpublishedList = new ArrayList<UnpublishedData>();

	}

	// Place each type of data in its respective list
	public static void readLists() {
		for (int i = 0; i < parser.BibParser.data.size(); i++) {
			if (parser.BibParser.data.get(i) instanceof ArticleData) {
				ArticleList.add((ArticleData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof BookData) {
				BookList.add((BookData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof BookletData) {
				BookletList.add((BookletData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof ConferenceData) {
				ConferenceList.add((ConferenceData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof InbookData) {
				InbookList.add((InbookData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof IncollectionData) {
				IncollectionList.add((IncollectionData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof InproceedingsData) {
				InproceedingsList.add((InproceedingsData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof ManualData) {
				ManualList.add((ManualData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof MastersthesisData) {
				MastersthesisList.add((MastersthesisData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof MiscData) {
				MiscList.add((MiscData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof PhdthesisData) {
				PhdthesisList.add((PhdthesisData) parser.BibParser.data.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof ProceedingsData) {
				ProceedingsList.add((ProceedingsData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof TechreportData) {
				TechreportList.add((TechreportData) parser.BibParser.data
						.get(i));
			}

			if (parser.BibParser.data.get(i) instanceof UnpublishedData) {
				UnpublishedList.add((UnpublishedData) parser.BibParser.data
						.get(i));
			}
		}
	}

	public static void createHTML() throws Exception {
	// public static void main(String args[]) throws Exception { -- DEBUG --
		
		// Set FreeMarker configuration -- Current Version: 2.3.22
		Configuration cfg = new Configuration(new Version(2, 3, 22));

		// Preset Recommended Options
		cfg.setDefaultEncoding("UTF-8");
		cfg.setLocale(Locale.US);
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// Load Templates
		cfg.setClassForTemplateLoading(HTMLWriter.class, "templates");

		// Template Input HashMap
		Map<String, Object> input = new HashMap<String, Object>();

		// Set what to write on $title tags
		input.put("title", "Bibliographic References");
		
		
		// TODO: Multi-template User Input Options
		
		// Chosen Template
		Template currentTemplate = cfg.getTemplate("Listing.ftl");

		
		// -- DEBUG --
		
		/*
		ArticleList = new ArrayList<ArticleData>();
		
		ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos",
				"Journal Com Espacos", 1993));
		ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos",
				"Journal Com Espacos", 1993));
		ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos",
				"Journal Com Espacos", 1993));
		ArticleList.add(new ArticleData("chave", "Joao", "Titulo Com Espacos",
				"Journal Com Espacos", 1993));
		*/
		
		// Insert Data into HTML Tree
		input.put("ArticleList", ArticleList);
		
		input.put("BookList", BookList);
		
		input.put("Booklet", BookletList);
		
		input.put("ConferenceList", ConferenceList);
		
		input.put("InbookList", InbookList);
		
		input.put("IncollectionList", IncollectionList);
		
		input.put("InproceedingsList", InproceedingsList);
		
		input.put("ManualList", ManualList);
		
		input.put("MastersthesisList", MastersthesisList);
		
		input.put("MiscList", MiscList);
		
		input.put("PhdthesisList", PhdthesisList);
		
		input.put("ProceedingsList", ProceedingsList);
		
		input.put("TechreportList", TechreportList);
		
		input.put("UnpublishedList", UnpublishedList);

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
