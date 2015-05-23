package data;

public class TechreportData extends BibData {
	// standard constructor
	public TechreportData() {
		super();
	}

	// required data constructor
	public TechreportData(String ck, String _author, String _title,
			String _institution, String _year) {
		citationKey = ck;
		author = _author;
		title = _title;
		institution = _institution;
		year = _year;
		type = null;
		number = null;
		address = null;
		month = null;
		note = null;
		key = null;
		crossref = null;
	}

	// optional data constructor
	public TechreportData(String ck, String _author, String _title,
			String _institution, String _year, String _type, Integer _number,
			String _address, String _month, String _note, String _key, String _crossref) {
		citationKey = ck;
		author = _author;
		title = _title;
		institution = _institution;
		year = _year;
		type = _type;
		number = _number;
		address = _address;
		month = _month;
		note = _note;
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

	public String getInstitution() {
		return institution;
	}

	public String getYear() {
		return year;
	}

	public String getType() {
		return type;
	}

	public Integer getNumber() {
		return number;
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
				+ institution + "," + year + "," + type + "," + number + ","
				+ address + "," + month + "," + note + "," + key + "," + crossref;
	}
}
