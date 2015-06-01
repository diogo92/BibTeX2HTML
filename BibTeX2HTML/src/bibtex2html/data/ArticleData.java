package bibtex2html.data;

public class ArticleData extends BibData {

	// Standard Constructor
	public ArticleData() {
		super();
	}

	// Required Data Constructor
	public ArticleData(String ck, String a, String t, String j, String y) {
		citationKey = ck;
		author = a;
		title = t;
		journal = j;
		year = y;
		volume = null;
		number = null;
		pages = null;
		month = null;
		note = null;
		key = null;
		crossref = null;
	}

	// Full Data Constructor
	public ArticleData(String ck, String a, String t, String j, String y,
			Integer v, Integer n, String pa, String mo, String no, String k, String _crossref) {
		citationKey = ck;
		author = a;
		title = t;
		journal = j;
		year = y;
		volume = v;
		number = n;
		pages = pa;
		month = mo;
		note = no;
		key = k;
		crossref = _crossref;
	}

	// Gets for FreeMarker HTML Parse
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getJournal() {
		return journal;
	}

	public String getYear() {
		return year;
	}

	public Integer getVolume() {
		return volume;
	}

	public Integer getNumber() {
		return number;
	}

	public String getPages() {
		return pages;
	}

	public String getMonth() {
		return month;
	}

	public String getNote() {
		return note;
	}

	public String getKey() {
		return key;
	}
	
	public String getCrossref(){
		return crossref;
	}

	public String toString() {
		return super.toString() + "," + author + "," + title + "," + journal
				+ "," + year + "," + volume + "," + number + "," + pages + ","
				+ month + "," + note + "," + key + "," + crossref;
	}
}
