package data;

public class BookletData extends BibData {

	// Standard Constructor
	public BookletData() {
		super();
	}

	// Required Data Constructor
	public BookletData(String ck, String t) {
		citationKey = ck;
		author = null;
		title = t;
		howpublished = null;
		year = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}

	// Full Data Constructor
	public BookletData(String ck, String a, String t, String hp, String y,
			String ad, String mo, String no, String k, String _crossref) {
		citationKey = ck;
		author = a;
		title = t;
		howpublished = hp;
		year = y;
		address = ad;
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

	public String getHowpublished() {
		return howpublished;
	}

	public String getYear() {
		return year;
	}

	public String getAddress() {
		return address;
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
	
	public String getCrossRef(){
		return crossref;
	}

	public String toString() {
		return super.toString() + "," + author + "," + title + ","
				+ howpublished + "," + year + "," + address + "," + month + ","
				+ note + "," + key + "," + crossref;
	}
}
