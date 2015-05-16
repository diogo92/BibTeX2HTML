package data;

public class BookData extends BibData {

	// Standard Constructor
	public BookData() {
		super();
	}

	// Required Data Constructor
	public BookData(String ck, String a, String t, String p, String y) {
		citationKey = ck;
		author = a;
		title = t;
		publisher = p;
		year = y;
		volume = null;
		number = null;
		edition = null;
		series = null;
		address = null;
		month = null;
		note = null;
		key = null;
	}

	// Full Data Constructor
	public BookData(String ck, String a, String t, String p, String y,
			Integer v, Integer n, String ed, String ser, String ad, String mo,
			String no, String k) {
		citationKey = ck;
		author = a;
		title = t;
		publisher = p;
		year = y;
		volume = v;
		number = n;
		edition = ed;
		series = ser;
		address = ad;
		month = mo;
		note = no;
		key = k;
	}

	// Gets for FreeMarker HTML Parse
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
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

	public String getSeries() {
		return series;
	}

	public Integer getEdition() {
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

	public String toString() {
		return super.toString() + "," + author + "," + title + "," + publisher
				+ "," + year + "," + volume + "," + number + "," + series + ","
				+ edition + "," + address + "," + month + "," + note + ","
				+ key;
	}
}
