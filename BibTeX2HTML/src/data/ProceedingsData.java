package data;

public class ProceedingsData extends BibData {

	// standard constructor
	public ProceedingsData() {
		super();
	}

	// required data constructor
	public ProceedingsData(String ck, String _title, String _year) {
		citationKey = ck;
		title = _title;
		year = _year;
		editor = null;
		volume = null;
		series = null;
		address = null;
		month = null;
		organization = null;
		publisher = null;
		note = null;
		key = null;
	}

	// optional data constructor
	public ProceedingsData(String ck, String _title, String _year,
			String _editor, Integer _volume, String _series, String _address,
			String _month, String _organization, String _publisher,
			String _note, String _key) {
		citationKey = ck;
		title = _title;
		year = _year;
		editor = _editor;
		volume = _volume;
		series = _series;
		address = _address;
		month = _month;
		organization = _organization;
		publisher = _publisher;
		note = _note;
		key = _key;
	}

	// Gets for FreeMarker HTML Parse

	public String getTitle() {
		return title;
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

	public String getAddress() {
		return address;
	}

	public String getMonth() {
		return month;
	}

	public String getOrganization() {
		return organization;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getNote() {
		return note;
	}

	public String getKey() {
		return key;
	}

	public String toString() {
		return super.toString() + "," + title + "," + year + "," + editor + ","
				+ volume + "," + series + "," + address + "," + month + ","
				+ organization + "," + publisher + "," + note + "," + key;
	}
}
