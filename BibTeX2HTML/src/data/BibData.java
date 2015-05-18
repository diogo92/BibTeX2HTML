package data;
import utils.Utilities;
public class BibData {
	protected static String data_type;

	public String citationKey;

	public String address;
	public String author;
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
	
	public void removeQuotes(){
		if(address != null){
			address = Utilities.removeCharAt(address, 0);
			address = Utilities.removeCharAt(address, address.length()-1);
		}
		if(author != null){
			author = Utilities.removeCharAt(author, 0);
			author = Utilities.removeCharAt(author, author.length()-1);
		}
		if(annote != null){
			annote = Utilities.removeCharAt(annote, 0);
			annote = Utilities.removeCharAt(annote, annote.length()-1);
		}
		if(booktitle != null){
			booktitle = Utilities.removeCharAt(booktitle, 0);
			booktitle = Utilities.removeCharAt(booktitle, booktitle.length()-1);
		}
		if(crossref != null){
			crossref = Utilities.removeCharAt(crossref, 0);
			crossref = Utilities.removeCharAt(crossref, crossref.length()-1);
		}
		if(edition != null){
			edition = Utilities.removeCharAt(edition, 0);
			edition = Utilities.removeCharAt(edition, edition.length()-1);
		}
		if(editor != null){
			editor = Utilities.removeCharAt(editor, 0);
			editor = Utilities.removeCharAt(editor, editor.length()-1);
		}
		if(howpublished != null){
			howpublished = Utilities.removeCharAt(howpublished, 0);
			howpublished = Utilities.removeCharAt(howpublished, howpublished.length()-1);
		}
		if(institution != null){
			institution = Utilities.removeCharAt(institution, 0);
			institution = Utilities.removeCharAt(institution, institution.length()-1);
		}
		if(journal != null){
			journal = Utilities.removeCharAt(journal, 0);
			journal = Utilities.removeCharAt(journal, journal.length()-1);
		}
		if(month != null){
			month = Utilities.removeCharAt(month, 0);
			month = Utilities.removeCharAt(month, month.length()-1);
		}
		if(note != null){
			note = Utilities.removeCharAt(note, 0);
			note = Utilities.removeCharAt(note, note.length()-1);
		}
		if(organization != null){
			organization = Utilities.removeCharAt(organization, 0);
			organization = Utilities.removeCharAt(organization, organization.length()-1);
		}
		if(pages != null){
			if(pages.contains("\"") || pages.contains("{")){
				pages = Utilities.removeCharAt(pages, 0);
				pages = Utilities.removeCharAt(pages, pages.length()-1);
			}
		}
		if(publisher != null){
			publisher = Utilities.removeCharAt(publisher, 0);
			publisher = Utilities.removeCharAt(publisher, publisher.length()-1);
		}
		if(school != null){
			school = Utilities.removeCharAt(school, 0);
			school = Utilities.removeCharAt(school, school.length()-1);
		}
		if(series != null){
			series = Utilities.removeCharAt(series, 0);
			series = Utilities.removeCharAt(series, series.length()-1);
		}
		if(type != null){
			type = Utilities.removeCharAt(type, 0);
			type = Utilities.removeCharAt(type, type.length()-1);
		}
		if(year != null){
			if(year.contains("\"") || year.contains("{")){
				year = Utilities.removeCharAt(year, 0);
				year = Utilities.removeCharAt(year, year.length()-1);
			}
		}
		if(key != null){
			key = Utilities.removeCharAt(key, 0);
			key = Utilities.removeCharAt(key, key.length()-1);
		}
		if(title != null){
			title = Utilities.removeCharAt(title, 0);
			title = Utilities.removeCharAt(title, title.length()-1);
		}
	}
}
