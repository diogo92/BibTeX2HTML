package data;

public class InbookData extends BibData {

	//standard Construct
	public InbookData(){
		super();
	}
	
	// Required Data Constructor (with chapter)
		public InbookData(String _author, String _title, Integer _chapter, String _publisher, Integer _year){
			author = _author;
			title = _title;
			chapter = _chapter;
			pages = null;
			publisher = _publisher;
			year = _year;
			volume = null;
			series = null;
			type = null;
			address = null;
			edition = null;
			month = null;
			note = null;
			key = null;
		}
		
		// Required Data Constructor (with pages)
		public InbookData(String _author, String _title, String _pages, String _publisher, Integer _year){
			author = _author;
			title = _title;
			chapter = null;
			pages = _pages;
			publisher = _publisher;
			year = _year;
			volume = null;
			series = null;
			type = null;
			address = null;
			edition = null;
			month = null;
			note = null;
			key = null;
		}
			
		// Required Data Constructor (with pages and chapter)
		public InbookData(String _author, String _title, Integer _chapter, String _pages, String _publisher, Integer _year){
			author = _author;
			title = _title;
			chapter = _chapter;
			pages = _pages;
			publisher = _publisher;
			year = _year;
			volume = null;
			series = null;
			type = null;
			address = null;
			edition = null;
			month = null;
			note = null;
			key = null;
		}
		
		// Full Data Constructor
		public InbookData(String _author, String _title, Integer _chapter, String _pages, String _publisher, Integer _year,
						  Integer _volume, String _series, String _type, String _address, String _edition, String _month, String _note, String _key){
			author = _author;
			title = _title;
			chapter = _chapter;
			pages = _pages;
			publisher = _publisher;
			year = _year;
			volume = _volume;
			series = _series;
			type = _type;
			address = _address;
			edition = _edition;
			month = _month;
			note = _note;
			key = _key;
		}
		
		// Gets for FreeMarker HTML Parse
		public String getAuthor(){
			return author;
		}
		
		public String getTitle(){
			return title;
		}
		
		public Integer getChapter(){
			return chapter;
		}
		
		public String getPages(){
			return pages;
		}
		
		public String getPublisher(){
			return publisher;
		}
		
		public Integer getYear(){
			return year;
		}
		
		public Integer getVolume(){
			return volume;
		}
		
		public String getSeries(){
			return series;
		}
		
		public String getType(){
			return type;
		}
		
		public String getAddress(){
			return address;
		}
		
		public String getEdition(){
			return edition;
		}
		
		public String getMonth(){
			return month;
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
					+ "," + chapter
					+ "," + pages
					+ "," + publisher
					+ "," + year
					+ "," + volume
					+ "," + series
					+ "," + type
					+ "," + address
					+ "," + edition
					+ "," + month
					+ "," + note
					+ "," + key;
		}
}
