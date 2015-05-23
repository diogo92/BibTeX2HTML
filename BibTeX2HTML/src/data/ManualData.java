package data;

public class ManualData extends BibData {
	// standard Construct
	public ManualData() {
		super();
	}

	// Required data constructor
	public ManualData(String ck, String _title) {
		citationKey = ck;
		title = _title;
		author = null;
		organization = null;
		address = null;
		edition = null;
		month = null;
		year = null;
		note = null;
		key = null;
		crossref = null;
	}

	// Optional data constructor
	public ManualData(String ck, String _title, String _author,
			String _organization, String _address, String _edition,
			String _month, String _year, String _note, String _key, String _crossref) {
		citationKey = ck;
		title = _title;
		author = _author;
		organization = _organization;
		address = _address;
		edition = _edition;
		month = _month;
		year = _year;
		note = _note;
		key = _key;
		crossref = _crossref;
	}

	// Gets for FreeMarker HTML Parse
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getOrganization() {
		return organization;
	}

	public String getAddress() {
		return address;
	}

	public String getEdition() {
		return edition;
	}

	public String getMonth() {
		return month;
	}

	public String getYear() {
		return year;
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
		return super.toString() + "," + title + "," + author + ","
				+ organization + "," + address + "," + edition + "," + month
				+ "," + year + "," + note + "," + key + "," + crossref;
	}
}
