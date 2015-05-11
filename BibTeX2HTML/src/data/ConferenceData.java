package data;

public class ConferenceData extends BibData {

	public ConferenceData() {
		super();
	}

	// Required data constructor
	public ConferenceData(String au, String ti, String bt, String ye) {
		author = au;
		title = ti;
		booktitle = bt;
		year = ye;
		editor = null;
		volume = null;
		number = null;
		series = null;
		pages = null;
		address = null;
		month = null;
		organization = null;
		publisher = null;
		note = null;
		key = null;
		
	}

	// Optional data constructor

	public ConferenceData(String au, String ti, String bt, String ye,
			String ed, Integer vol, Integer num, String ser, String pag,
			String addr, String mon, String org, String pub, String no, String _key) {
		author = au;
		title = ti;
		booktitle = bt;
		year = ye;
		editor = ed;
		volume = vol;
		number = num;
		series = ser;
		pages = pag;
		address = addr;
		month = mon;
		organization = org;
		publisher = pub;
		note = no;
		key = _key;
	}
	
	// Gets for FreeMarker HTML Parse
		public String getAuthor(){
			return author;
		}
		
		public String getTitle(){
			return title;
		}
		
		public String getBookTitle(){
			return booktitle;
		}
		
		public String getYear(){
			return year;
		}
		
		public String getEditor(){
			return editor;
		}
		
		public Integer getVolume(){
			return volume;
		}
		
		public Integer getNumber(){
			return number;
		}
		
		public String getSeries(){
			return series;
		}
		
		public String getPages(){
			return pages;
		}
		
		public String getAddress(){
			return address;
		}
		
		public String getMonth(){
			return month;
		}
		
		public String getOrganization(){
			return organization;
		}
		
		public String getPublisher(){
			return publisher;
		}
		
		public String getNote(){
			return note;
		}
		
		public String getKey(){
			return key;
		}
		
		
		public String toString(){
			return super.toString() 
					+ "," + author
					+ "," + title
					+ "," + booktitle
					+ "," + year
					+ "," + editor
					+ "," + volume
					+ "," + number
					+ "," + series
					+ "," + pages
					+ "," + address
					+ "," + month
					+ "," + organization
					+ "," + publisher
					+ "," + note
					+ "," + key;
		}
}
