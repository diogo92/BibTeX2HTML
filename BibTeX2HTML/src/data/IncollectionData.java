package data;

public class IncollectionData extends BibData {

	// standard Construct
	public IncollectionData() {
		super();
	}

	// Required Data Constructor (with chapter)
	public IncollectionData(String ck, String _author, String _title,
			String _booktitle, String _publisher, String _year) {
		citationKey = ck;
		author = _author;
		title = _title;
		booktitle = _booktitle;
		publisher = _publisher;
		year = _year;
		editor = null;
		volume = null;
		series = null;
		type = null;
		chapter = null;
		pages = null;
		address = null;
		edition = null;
		month = null;
		note = null;
		key = null;
		crossref = null;
	}

	// Full Data Constructor
	public IncollectionData(String ck, String _author, String _title,
			String _booktitle, String _publisher, String _year, String _editor,
			Integer _volume, String _series, String _type, Integer _chapter,
			String _pages, String _address, String _edition, String _month,
			String _note, String _key, String _crossref) {
		citationKey = ck;
		author = _author;
		title = _title;
		booktitle = _booktitle;
		publisher = _publisher;
		year = _year;
		editor = _editor;
		volume = _volume;
		series = _series;
		type = _type;
		chapter = _chapter;
		pages = _pages;
		address = _address;
		edition = _edition;
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

	public String getBooktitle() {
		return booktitle;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getYear() {
		return year;
	}

	public String getEditor() {
		return editor;
	}

	public Integer getVolume() {
		return volume;
	}

	public String getSeries() {
		return series;
	}

	public String getType() {
		return type;
	}

	public Integer getChapter() {
		return chapter;
	}

	public String getPages() {
		return pages;
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
		return super.toString() + "," + author + "," + title + "," + booktitle
				+ "," + publisher + "," + year + "," + editor + "," + volume
				+ "," + series + "," + type + "," + chapter + "," + pages + ","
				+ address + "," + edition + "," + month + "," + note + ","
				+ key + "," + crossref;
	}
}
