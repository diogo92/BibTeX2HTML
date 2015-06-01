package bibtex2html.data;

public class UnpublishedData extends BibData {

	// standard constructor
	public UnpublishedData() {
		super();
	}

	// required data constructor
	public UnpublishedData(String ck, String _author, String _title,
			String _note) {
		citationKey = ck;
		author = _author;
		title = _title;
		note = _note;
		month = null;
		year = null;
		key = null;
		crossref = null;
	}

	// optional data constructor
	public UnpublishedData(String ck, String _author, String _title,
			String _note, String _month, String _year, String _key, String _crossref) {
		citationKey = ck;
		author = _author;
		title = _title;
		note = _note;
		month = _month;
		year = _year;
		key = _key;
		crossref = _crossref;
	}

	// Gets for FreeMarker HTML Parse
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getNote() {
		return note;
	}

	public String getMonth() {
		return month;
	}

	public String getYear() {
		return year;
	}

	public String getKey() {
		return key;
	}

	public String getCrossref(){
		return crossref;
	}
	
	public String toString() {
		return super.toString() + "," + author + "," + title + "," + note + ","
				+ month + "," + year + "," + key + "," + crossref;
	}
}
