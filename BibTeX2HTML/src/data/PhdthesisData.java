package data;

public class PhdthesisData extends BibData {

	// standard construct
	public PhdthesisData() {
		super();
	}

	// required data constructor
	public PhdthesisData(String ck, String _author, String _title, String _school,
			String _year) {
		citationKey = ck;
		author = _author;
		title = _title;
		school = _school;
		year = _year;
		type = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}

	// optional data constructor
	public PhdthesisData(String ck, String _author, String _title, String _school,
			String _year, String _type, String _address, String _month,
			String _note, String _key) {
		citationKey = ck;
		author = _author;
		title = _title;
		school = _school;
		year = _year;
		type = _type;
		address = _address;
		month = _month;
		note = _note;
		key = _key;
	}

	// Gets for FreeMarker HTML Parse
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getSchool() {
		return school;
	}

	public String getYear() {
		return year;
	}

	public String getType() {
		return type;
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

	public String toString() {
		return super.toString() + "," + author + "," + title + "," + school
				+ "," + year + "," + type + "," + address + "," + month + ","
				+ note + "," + key;
	}
}
