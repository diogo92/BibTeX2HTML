package data;
import utils.Utilities;
import com.github.tomtung.latex2unicode.DefaultLatexToUnicodeConverter;
public class BibData {
	protected static String data_type;

	public String citationKey;

	public String address;
	public String author;
	public String authorFirstName;
	public String authorLastName;
	public String annote;
	public String booktitle;
	public Integer chapter;
	public String crossref;
	public String edition;
	public String editor;
	public String howpublished;
	public String institution;
	public String journal;
	public String key;
	public String month;
	public String note;
	public Integer number;
	public String organization;
	public String pages;
	public String publisher;
	public String school;
	public String series;
	public String title;
	public String type;
	public Integer volume;
	public String year;

	public BibData() {
		data_type = null;
		citationKey = null;
		author = null;
		annote = null;
		booktitle = null;
		chapter = null;
		crossref = null;
		edition = null;
		editor = null;
		howpublished = null;
		institution = null;
		journal = null;
		key = null;
		month = null;
		note = null;
		number = null;
		organization = null;
		pages = null;
		publisher = null;
		school = null;
		series = null;
		title = null;
		type = null;
		volume = null;
		year = null;

	}

	public void setDataType(String data) {
		data_type = data;
	}

	public String getDataType() {
		return data_type;
	}

	// Gets for FreeMarker HTML Parse
	public String getCitationKey() {
		return citationKey;
	}

	public String toString() {
		return citationKey;
	}
	
	public boolean splitAuthorName(){
		boolean res = false;
		if(author.contains(",")){
			String [] split = author.split(",");
			if(split.length > 2){
				throw new IllegalArgumentException("Author name \"" + author + " \" has more divisions than it should");
			}
			else {
				authorLastName = split[0];
				authorFirstName = split[1];
				res = true;
			}
		}
		return res;
	}
	
	public void removeQuotes(){
		if(address != null){
			address = Utilities.removeCharAt(address, 0);
			address = Utilities.removeCharAt(address, address.length()-1);
			address = DefaultLatexToUnicodeConverter.convert(address);
		}
		if(author != null){
			author = Utilities.removeCharAt(author, 0);
			author = Utilities.removeCharAt(author, author.length()-1);
			author = DefaultLatexToUnicodeConverter.convert(author);
			
		}
		if(annote != null){
			annote = Utilities.removeCharAt(annote, 0);
			annote = Utilities.removeCharAt(annote, annote.length()-1);
			annote = DefaultLatexToUnicodeConverter.convert(annote);
		}
		if(booktitle != null){
			booktitle = Utilities.removeCharAt(booktitle, 0);
			booktitle = Utilities.removeCharAt(booktitle, booktitle.length()-1);
			booktitle = DefaultLatexToUnicodeConverter.convert(booktitle);
		}
		if(crossref != null){
			crossref = Utilities.removeCharAt(crossref, 0);
			crossref = Utilities.removeCharAt(crossref, crossref.length()-1);
			crossref = DefaultLatexToUnicodeConverter.convert(crossref);
		}
		if(edition != null){
			edition = Utilities.removeCharAt(edition, 0);
			edition = Utilities.removeCharAt(edition, edition.length()-1);
			edition = DefaultLatexToUnicodeConverter.convert(edition);
		}
		if(editor != null){
			editor = Utilities.removeCharAt(editor, 0);
			editor = Utilities.removeCharAt(editor, editor.length()-1);
			editor = DefaultLatexToUnicodeConverter.convert(editor);
		}
		if(howpublished != null){
			howpublished = Utilities.removeCharAt(howpublished, 0);
			howpublished = Utilities.removeCharAt(howpublished, howpublished.length()-1);
			howpublished = DefaultLatexToUnicodeConverter.convert(howpublished);
		}
		if(institution != null){
			institution = Utilities.removeCharAt(institution, 0);
			institution = Utilities.removeCharAt(institution, institution.length()-1);
			institution = DefaultLatexToUnicodeConverter.convert(institution);
		}
		if(journal != null){
			journal = Utilities.removeCharAt(journal, 0);
			journal = Utilities.removeCharAt(journal, journal.length()-1);
			journal = DefaultLatexToUnicodeConverter.convert(journal);
		}
		if(month != null){
			month = Utilities.removeCharAt(month, 0);
			month = Utilities.removeCharAt(month, month.length()-1);
			month = DefaultLatexToUnicodeConverter.convert(month);
		}
		if(note != null){
			note = Utilities.removeCharAt(note, 0);
			note = Utilities.removeCharAt(note, note.length()-1);
			note = DefaultLatexToUnicodeConverter.convert(note);
		}
		if(organization != null){
			organization = Utilities.removeCharAt(organization, 0);
			organization = Utilities.removeCharAt(organization, organization.length()-1);
			organization = DefaultLatexToUnicodeConverter.convert(organization);
		}
		if(pages != null){
			if(pages.contains("\"") || pages.contains("{")){
				pages = Utilities.removeCharAt(pages, 0);
				pages = Utilities.removeCharAt(pages, pages.length()-1);
				pages = DefaultLatexToUnicodeConverter.convert(pages);
			}
		}
		if(publisher != null){
			publisher = Utilities.removeCharAt(publisher, 0);
			publisher = Utilities.removeCharAt(publisher, publisher.length()-1);
			publisher = DefaultLatexToUnicodeConverter.convert(publisher);
		}
		if(school != null){
			school = Utilities.removeCharAt(school, 0);
			school = Utilities.removeCharAt(school, school.length()-1);
			school = DefaultLatexToUnicodeConverter.convert(school);
		}
		if(series != null){
			series = Utilities.removeCharAt(series, 0);
			series = Utilities.removeCharAt(series, series.length()-1);
			series = DefaultLatexToUnicodeConverter.convert(series);
		}
		if(type != null){
			type = Utilities.removeCharAt(type, 0);
			type = Utilities.removeCharAt(type, type.length()-1);
			type = DefaultLatexToUnicodeConverter.convert(type);
		}
		if(year != null){
			if(year.contains("\"") || year.contains("{")){
				year = Utilities.removeCharAt(year, 0);
				year = Utilities.removeCharAt(year, year.length()-1);
				year = DefaultLatexToUnicodeConverter.convert(year);
			}
		}
		if(key != null){
			key = Utilities.removeCharAt(key, 0);
			key = Utilities.removeCharAt(key, key.length()-1);
			key = DefaultLatexToUnicodeConverter.convert(key);
		}
		if(title != null){
			title = Utilities.removeCharAt(title, 0);
			title = Utilities.removeCharAt(title, title.length()-1);
			title = DefaultLatexToUnicodeConverter.convert(title);
		}
	}
	
}
