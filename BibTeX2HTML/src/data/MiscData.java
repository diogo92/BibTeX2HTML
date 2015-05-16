package data;

public class MiscData extends BibData {
	// standard constructor
	public MiscData() {
		super();
	}

	// Optional data constructor
	public MiscData(String ck, String _author, String _title,
			String _howpublished, String _month, String _year, String _note,
			String _key) {
		citationKey = ck;
		author = _author;
		title = _title;
		howpublished = _howpublished;
		month = _month;
		year = _year;
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

	public String getHowPublished() {
		return howpublished;
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

	public String toString() {
		return super.toString() + "," + author + "," + title + ","
				+ howpublished + "," + month + "," + year + "," + note + ","
				+ key;
	}
}
