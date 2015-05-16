package data;

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
}
